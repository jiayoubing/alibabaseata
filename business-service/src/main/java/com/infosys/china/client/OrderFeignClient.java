package com.infosys.china.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 业务调用其他接口的服务
 * 
 * @author Jiayoubing
 * @version [版本号,2020年4月19日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@FeignClient("order-service")
public interface OrderFeignClient
{

    @GetMapping("/order/create")
    public void create(@RequestParam("userId") String userId, @RequestParam("productId") String productId, @RequestParam("count") Integer count);
    
}
