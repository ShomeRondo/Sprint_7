package model;

public class CourierCredentials {
    private final String login;
    private final String password;

    public CourierCredentials(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public CourierCredentials() {
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public void setPassword(){
        this.password = password;
    }
}
