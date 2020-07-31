package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysEmplMapper;
import com.ruoyi.system.domain.SysEmpl;
import com.ruoyi.system.service.ISysEmplService;
import com.ruoyi.common.core.text.Convert;

/**
 * 员工管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-07-31
 */
@Service
public class SysEmplServiceImpl implements ISysEmplService 
{
    @Autowired
    private SysEmplMapper sysEmplMapper;

    /**
     * 查询员工管理
     * 
     * @param sid 员工管理ID
     * @return 员工管理
     */
    @Override
    public SysEmpl selectSysEmplById(Long sid)
    {
        return sysEmplMapper.selectSysEmplById(sid);
    }

    /**
     * 查询员工管理列表
     * 
     * @param sysEmpl 员工管理
     * @return 员工管理
     */
    @Override
    public List<SysEmpl> selectSysEmplList(SysEmpl sysEmpl)
    {
        return sysEmplMapper.selectSysEmplList(sysEmpl);
    }

    /**
     * 新增员工管理
     * 
     * @param sysEmpl 员工管理
     * @return 结果
     */
    @Override
    public int insertSysEmpl(SysEmpl sysEmpl)
    {
        return sysEmplMapper.insertSysEmpl(sysEmpl);
    }

    /**
     * 修改员工管理
     * 
     * @param sysEmpl 员工管理
     * @return 结果
     */
    @Override
    public int updateSysEmpl(SysEmpl sysEmpl)
    {
        return sysEmplMapper.updateSysEmpl(sysEmpl);
    }

    /**
     * 删除员工管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSysEmplByIds(String ids)
    {
        return sysEmplMapper.deleteSysEmplByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除员工管理信息
     * 
     * @param sid 员工管理ID
     * @return 结果
     */
    @Override
    public int deleteSysEmplById(Long sid)
    {
        return sysEmplMapper.deleteSysEmplById(sid);
    }
}
