package com.infosys.china.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.china.entity.Account;
import com.infosys.china.mapper.AccountMapper;

/**
 * 
 * 查询账户信息，更新余额
 * 
 * @author Jiayoubing
 * @version [版本号,2020年4月19日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */

@Service
public class AccountService
{

    @Autowired
    private AccountMapper accountMapper;

    public void debit(String userId, BigDecimal num)
    {
        Account account = accountMapper.selectByUserId(userId);
        account.setTotal(account.getTotal().subtract(num));
        account.setUsed(account.getUsed().add(num));
        account.setResidue(account.getResidue().subtract(num));
        accountMapper.updateById(account);
        System.out.println("账户更新完毕！>>>>>>>>>>>");
    }

}
