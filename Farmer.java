import java.util.ArrayList;

public class Farmer extends User {
    ArrayList<Location> shipping_locations;
    ArrayList<Product> products;


    public Farmer(String name, String lastname, String ssn, String username, String password, Account account, String email, String phone_no, Location location, ArrayList<Location> shipping_locations, ArrayList<Product> products) {
        super(name, lastname, ssn, username, password, account, email, phone_no, location);
        this.shipping_locations = shipping_locations;
        this.products = products;

    }

    public Account getAccount() {
        return this.account;
    }

}