package com.infosys.china.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.infosys.china.entity.Account;

@Mapper
public interface AccountMapper
{

    /**
     * 
     * 根据userid来查询账户信息
     * 
     * @param userId
     * @return[参数说明] @return Account[返回类型说明]
     * @exception throws
     *                [违例类型][违例说明]
     * @see [类、类#方法、类#成员]
     */
    Account selectByUserId(@Param("userId") String userId);

    /**
     * 更新账户信息
     * 
     * @param record
     * @return[参数说明] @return int[返回类型说明]
     * @exception throws
     *                [违例类型][违例说明]
     * @see [类、类#方法、类#成员]
     */
    int updateById(@Param("account") Account record);

}