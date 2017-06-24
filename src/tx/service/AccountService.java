package tx.service;

/**
 * Created by admin on 2017/6/24.
 */
public interface AccountService {

    void transfer(String inner, String outer, Integer money);
}
