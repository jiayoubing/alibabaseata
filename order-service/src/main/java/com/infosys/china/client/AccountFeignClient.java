package com.infosys.china.client;

import java.math.BigDecimal;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
 * 调用账户信息
 * 
 * @author Jiayoubing
 * @version [版本号,2020年4月19日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */

@FeignClient(name = "account-service")
public interface AccountFeignClient
{
    @GetMapping("/account/debit")
    public void debit(@RequestParam("userId") String userId , @RequestParam("orderMoney") BigDecimal orderMoney);
    
}
