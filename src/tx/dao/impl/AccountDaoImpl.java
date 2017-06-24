package tx.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import tx.dao.AccountDao;

/**
 * Created by admin on 2017/6/24.
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    @Override
    public void out(String outer, Integer money) {
        this.getJdbcTemplate().update("UPDATE account SET money = money - ? WHERE username = ?",money,outer);
    }

    @Override
    public void in(String inner, Integer money) {
        this.getJdbcTemplate().update("UPDATE account SET money = money + ? WHERE username = ?",money,inner);
    }
}
