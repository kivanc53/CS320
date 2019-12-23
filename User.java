public class User {
    String name;
    String lastname;
    String ssn;
    String username;
    String password;
    Location location;
    String email;
    String phone_no;
    Account account;

    public User(String name, String lastname, String ssn, String username, String password, Account account, String email, String phone_no, Location location) {
        this.name = name;
        this.lastname = lastname;
        this.ssn = ssn;
        this.username = username;
        this.password = password;
        this.account = account;
        this.email = email;
        this.phone_no = phone_no;
        this.location = location;
    }
}