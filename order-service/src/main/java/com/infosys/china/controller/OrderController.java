/**
* 文件名：OrderController.java
* 版权：Company Technologies Co.,Ltd.Copyright YYYY-YYYY,All rights reserved
* 版权：Copyright (c) 2020, jia2040020@126.com All Rights Reserved.
* 描述：<描述>
* 修改人：Administrator
* 修改时间：2020年4月19日
* 修改内容：<修改内容>
*/
package com.infosys.china.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.china.service.OrderService;

import io.seata.core.context.RootContext;

/**
* <一句话功能简述>
* <功能详细描述>
* 
* @author Jiayoubing
* @version [版本号,2020年4月19日]
* @see [相关类/方法]
* @since [产品/模块版本]
*/
@RequestMapping("/order")
@RestController
public class OrderController
{
    @Autowired
    private OrderService orderService;

    @GetMapping(value = "/create")
    public void create(@RequestParam String userId, @RequestParam String productId, @RequestParam Integer count) {
        System.out.println("order XID " + RootContext.getXID());
        orderService.create(userId, productId, count);
    }
}
