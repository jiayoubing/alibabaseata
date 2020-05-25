/**
 * 文件名：StorageServiceApplication.java 版权：Company Technologies Co.,Ltd.Copyright
 * YYYY-YYYY,All rights reserved 版权：Copyright (c) 2020, jia2040020@126.com All
 * Rights Reserved. 描述：<描述> 修改人：Administrator 修改时间：2020年4月19日 修改内容：<修改内容>
 */
package com.infosys.china;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author Jiayoubing
 * @version [版本号,2020年4月19日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@SpringBootApplication
@EnableFeignClients
public class StorageServiceApplication
{
    public static void main(String[] args) throws Exception
    {
        SpringApplication.run(StorageServiceApplication.class, args);
    }

}
