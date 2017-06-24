package tx2.service.impl;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
import tx2.dao.AccountDao;
import tx2.service.AccountService;

/**
 * Created by admin on 2017/6/24.
 */
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    //需要spring注入模板
    private TransactionTemplate transactionTemplate;
    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }
    @Override
    public void transfer(final String inner,final String outer,final Integer money) {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                accountDao.in(inner, money);
                //上面操作之后，下面未能成功操作
//                int i = 1 / 0;
                accountDao.out(outer, money);
            }
        });

    }
}
