package com.infosys.china.entity;

/**
 * 
 * <一句话功能简述> <功能详细描述>
 * 
 * @author Jiayoubing
 * @version [版本号,2020年4月19日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Storage
{
    private Integer id;

    /**
     * 产品id
     */
    private String productId;

    /**
     * 总库存
     */

    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getProductId()
    {
        return productId;
    }

    public void setProductId(String productId)
    {
        this.productId = productId;
    }

    public Integer getTotal()
    {
        return total;
    }

    public void setTotal(Integer total)
    {
        this.total = total;
    }

    public Integer getUsed()
    {
        return used;
    }

    public void setUsed(Integer used)
    {
        this.used = used;
    }

    public Integer getResidue()
    {
        return residue;
    }

    public void setResidue(Integer residue)
    {
        this.residue = residue;
    }

}
