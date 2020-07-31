package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 员工管理对象 sys_empl
 * 
 * @author ruoyi
 * @date 2020-07-31
 */
public class SysEmpl extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 员工主键 */
    private Long sid;

    /** 姓名 */
    @Excel(name = "姓名")
    private String sname;

    /** $column.columnComment */
    @Excel(name = "姓名")
    private Integer sage;

    /** $column.columnComment */
    @Excel(name = "姓名")
    private String address;

    public void setSid(Long sid) 
    {
        this.sid = sid;
    }

    public Long getSid() 
    {
        return sid;
    }
    public void setSname(String sname) 
    {
        this.sname = sname;
    }

    public String getSname() 
    {
        return sname;
    }
    public void setSage(Integer sage) 
    {
        this.sage = sage;
    }

    public Integer getSage() 
    {
        return sage;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("sid", getSid())
            .append("sname", getSname())
            .append("sage", getSage())
            .append("address", getAddress())
            .toString();
    }
}
