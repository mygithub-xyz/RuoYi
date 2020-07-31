package com.ruoyi.web.controller.system;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SysEmpl;
import com.ruoyi.system.service.ISysEmplService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 员工管理Controller
 * 
 * @author ruoyi
 * @date 2020-07-31
 */
@Controller
@RequestMapping("/system/empl")
public class SysEmplController extends BaseController
{
    private String prefix = "system/empl";

    @Autowired
    private ISysEmplService sysEmplService;

    @RequiresPermissions("system:empl:view")
    @GetMapping()
    public String empl()
    {
        return prefix + "/empl";
    }

    /**
     * 查询员工管理列表
     */
    @RequiresPermissions("system:empl:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysEmpl sysEmpl)
    {
        startPage();
        List<SysEmpl> list = sysEmplService.selectSysEmplList(sysEmpl);
        return getDataTable(list);
    }

    /**
     * 导出员工管理列表
     */
    @RequiresPermissions("system:empl:export")
    @Log(title = "员工管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysEmpl sysEmpl)
    {
        List<SysEmpl> list = sysEmplService.selectSysEmplList(sysEmpl);
        ExcelUtil<SysEmpl> util = new ExcelUtil<SysEmpl>(SysEmpl.class);
        return util.exportExcel(list, "empl");
    }

    /**
     * 新增员工管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存员工管理
     */
    @RequiresPermissions("system:empl:add")
    @Log(title = "员工管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SysEmpl sysEmpl)
    {
        return toAjax(sysEmplService.insertSysEmpl(sysEmpl));
    }

    /**
     * 修改员工管理
     */
    @GetMapping("/edit/{sid}")
    public String edit(@PathVariable("sid") Long sid, ModelMap mmap)
    {
        SysEmpl sysEmpl = sysEmplService.selectSysEmplById(sid);
        mmap.put("sysEmpl", sysEmpl);
        return prefix + "/edit";
    }

    /**
     * 修改保存员工管理
     */
    @RequiresPermissions("system:empl:edit")
    @Log(title = "员工管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysEmpl sysEmpl)
    {
        return toAjax(sysEmplService.updateSysEmpl(sysEmpl));
    }

    /**
     * 删除员工管理
     */
    @RequiresPermissions("system:empl:remove")
    @Log(title = "员工管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sysEmplService.deleteSysEmplByIds(ids));
    }
}
