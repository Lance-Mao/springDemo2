package tx3.entity;

/**
 * Created by admin on 2017/6/24.
 */
public class Account {
    private Integer money;
    private String username;

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Account{" +
                "money=" + money +
                ", username='" + username + '\'' +
                '}';
    }
}
