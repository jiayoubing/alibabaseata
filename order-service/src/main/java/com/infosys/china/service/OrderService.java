package com.infosys.china.service;

import java.math.BigDecimal;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.china.client.AccountFeignClient;
import com.infosys.china.entity.Order;
import com.infosys.china.mapper.OrderMapper;

/**
 * 
 * 创建订单，并修改账户服务的余额
 * 
 * @author Jiayoubing
 * @version [版本号,2020年4月19日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Service
public class OrderService
{

    /**
     * 远程调用客户端
     */
    @Autowired
    private AccountFeignClient accountFeignClient;

    @Autowired
    private OrderMapper orderMapper;

    public void create(String userId, String productId, Integer count)
    {
        BigDecimal orderMoney = new BigDecimal(count).multiply(new BigDecimal(5));
        Order order = new Order();
        order.setUserId(userId);
        order.setProductId(productId);
        order.setCount(count);
        order.setMoney(orderMoney);

        orderMapper.insert(order);
        accountFeignClient.debit(userId, orderMoney);
        System.out.println("创建订单和修改余额成功！>>>>>>>>>>>>>");

    }
}