/**
 * 文件名：StorageService.java 版权：Company Technologies Co.,Ltd.Copyright
 * YYYY-YYYY,All rights reserved 版权：Copyright (c) 2020, jia2040020@126.com All
 * Rights Reserved. 描述：<描述> 修改人：Administrator 修改时间：2020年4月19日 修改内容：<修改内容>
 */
package com.infosys.china.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.china.entity.Storage;
import com.infosys.china.mapper.StorageMapper;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author Jiayoubing
 * @version [版本号,2020年4月19日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Service
public class StorageService
{
    @Autowired
    private StorageMapper storageMapper;

    public void deduct(String productId, int count)
    {

        System.out.println("productId is :>>>>>>>>>>>>>>>" + productId);

        Storage storage = storageMapper.findByProductId(productId);
        if (storage != null)
        {
            storage.setTotal(storage.getTotal() - count);
            storage.setUsed(storage.getUsed() + count);
            storage.setResidue(storage.getResidue() - count);
            storageMapper.updateById(storage);
        }
        System.out.println("productId is null>>>>>>>>>>>>>>>");
    }

}
