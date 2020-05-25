package com.infosys.china.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.china.service.StorageService;

import io.seata.core.context.RootContext;

/**
 * 
* 更新库存
* 
* @author Jiayoubing
* @version [版本号,2020年4月19日]
* @see [相关类/方法]
* @since [产品/模块版本]
 */
@RequestMapping("/storage")
@RestController
public class StorageController {


    @Autowired
    private StorageService storageService;

    @RequestMapping(value = "/deduct")
    public void deduct(@RequestParam String productId, @RequestParam Integer count) throws SQLException {
        System.out.println("storage XID " + RootContext.getXID());
        storageService.deduct(productId, count);
    }

}