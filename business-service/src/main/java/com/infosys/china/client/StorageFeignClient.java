package com.infosys.china.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.infosys.china.service.BusinessService;

import io.seata.core.context.RootContext;

/**
 * 
 * <一句话功能简述> <功能详细描述>
 * 
 * @author Jiayoubing
 * @version [版本号,2020年4月19日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@FeignClient("storage-service")
public interface StorageFeignClient
{

    @GetMapping("/storage/deduct")
    public void deduct(@RequestParam("productId") String productId, @RequestParam("count") Integer count);

}
