package tx3.dao.impl;

import tx3.dao.AccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

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
