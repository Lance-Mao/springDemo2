package tx.service.impl;

import tx.dao.AccountDao;
import tx.service.AccountService;

/**
 * Created by admin on 2017/6/24.
 */
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
    @Override
    public void transfer(String inner, String outer, Integer money) {
        accountDao.in(inner, money);
        //上面操作之后，下面未能成功操作
        int i = 1 / 0;
        accountDao.out(outer, money);
    }
}
