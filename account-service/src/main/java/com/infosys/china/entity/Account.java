package com.infosys.china.entity;

import java.math.BigDecimal;

/**
 * 
 * 
 * @author Jiayoubing
 * @version [版本号,2020年4月19日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Account
{
    private Integer id;

    private String userId;

    /**
     * 总额度
     */
    private BigDecimal total;

    /**
     * 已用余额
     */
    private BigDecimal used;

    /**
     * 剩余可用额度
     */
    private BigDecimal residue;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public BigDecimal getTotal()
    {
        return total;
    }

    public void setTotal(BigDecimal total)
    {
        this.total = total;
    }

    public BigDecimal getUsed()
    {
        return used;
    }

    public void setUsed(BigDecimal used)
    {
        this.used = used;
    }

    public BigDecimal getResidue()
    {
        return residue;
    }

    public void setResidue(BigDecimal residue)
    {
        this.residue = residue;
    }

}
