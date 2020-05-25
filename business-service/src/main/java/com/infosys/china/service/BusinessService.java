/**
 * 文件名：BusinessService.java 版权：Company Technologies Co.,Ltd.Copyright
 * YYYY-YYYY,All rights reserved 版权：Copyright (c) 2020, jia2040020@126.com All
 * Rights Reserved. 描述：<描述> 修改人：Administrator 修改时间：2020年4月19日 修改内容：<修改内容>
 */
package com.infosys.china.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.china.client.OrderFeignClient;
import com.infosys.china.client.StorageFeignClient;

import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author Jiayoubing
 * @version [版本号,2020年4月19日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Service
public class BusinessService
{
    private static final Logger LOGGER = LoggerFactory.getLogger(BusinessService.class);

    @Autowired
    private StorageFeignClient storageClient;

    @Autowired
    private OrderFeignClient orderClient;

    /**
     * 减库存，下订单
     *
     *@GlobalTransactional  一个注解搞定全局事务
     * @param userId
     * @param commodityCode
     * @param orderCount
     */
    @GlobalTransactional
    public void purchase(String userId, String commodityCode, int orderCount)
    {
        LOGGER.info("BusinessService purchase begin ... xid: {}" ,RootContext.getXID());
        storageClient.deduct(commodityCode, orderCount);
        orderClient.create(userId, commodityCode, orderCount);
    }
}
