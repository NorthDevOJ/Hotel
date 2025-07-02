package modelo;


public class Admin {

    private String user;
    private String password;

    public Admin(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static boolean iniciar(String user, String password) {
        boolean login = false;
        System.out.println(user.toUpperCase());
        if (user.toUpperCase().equals("ADMIN") && password.equals("admin123")) {
            login = true;
        }
        return login;
    }
}
