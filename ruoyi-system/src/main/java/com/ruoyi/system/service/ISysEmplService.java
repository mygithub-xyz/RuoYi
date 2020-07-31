package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysEmpl;

/**
 * 员工管理Service接口
 * 
 * @author ruoyi
 * @date 2020-07-31
 */
public interface ISysEmplService 
{
    /**
     * 查询员工管理
     * 
     * @param sid 员工管理ID
     * @return 员工管理
     */
    public SysEmpl selectSysEmplById(Long sid);

    /**
     * 查询员工管理列表
     * 
     * @param sysEmpl 员工管理
     * @return 员工管理集合
     */
    public List<SysEmpl> selectSysEmplList(SysEmpl sysEmpl);

    /**
     * 新增员工管理
     * 
     * @param sysEmpl 员工管理
     * @return 结果
     */
    public int insertSysEmpl(SysEmpl sysEmpl);

    /**
     * 修改员工管理
     * 
     * @param sysEmpl 员工管理
     * @return 结果
     */
    public int updateSysEmpl(SysEmpl sysEmpl);

    /**
     * 批量删除员工管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysEmplByIds(String ids);

    /**
     * 删除员工管理信息
     * 
     * @param sid 员工管理ID
     * @return 结果
     */
    public int deleteSysEmplById(Long sid);
}
