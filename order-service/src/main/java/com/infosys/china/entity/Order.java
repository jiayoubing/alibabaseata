package com.infosys.china.entity;

import java.math.BigDecimal;

public class Order
{
    private Integer id;

    private String userId;

    /**
     * 产品id
     */
    private String productId;
    
    /**
     * 商品数量
     */
    private Integer count;

    /**
     * 金额
     */

    private BigDecimal money;

    /**
     * 订单状态: 0:创建中 1:已完结
     */
    private Integer status;


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

    public String getProductId()
    {
        return productId;
    }

    public void setProductId(String productId)
    {
        this.productId = productId;
    }

    public Integer getCount()
    {
        return count;
    }

    public void setCount(Integer count)
    {
        this.count = count;
    }

    public BigDecimal getMoney()
    {
        return money;
    }

    public void setMoney(BigDecimal money)
    {
        this.money = money;
    }

    public Integer getStatus()
    {
        return status;
    }

    public void setStatus(Integer status)
    {
        this.status = status;
    }

   
}
