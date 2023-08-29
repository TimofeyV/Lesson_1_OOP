import lombok.Data;
import lombok.NoArgsConstructor;


public class User {
    String login;
    private String password;
    private Basket buy;

    public User(String login, String password, Basket buy) {
        this.login = login;
        this.password = password;
        this.buy = buy;
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getBuy() {
        return buy;
    }

    public void setBuy(Basket buy) {
        this.buy = buy;
    }

    @Override
    public String toString() {
        return "User:\n" +
                login + "\n" + buy + "\n";
    }
}
