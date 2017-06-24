package tx3.dao;

/**
 * Created by admin on 2017/6/24.
 */
public interface AccountDao {

    void out(String outer, Integer money);

    void in(String inner, Integer money);
}
