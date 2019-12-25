public class Execute {
	public static void main(String[] args) {
		
	try { 	
	Gui gui = new Gui();
	Product product = new Product("prd1", "dsc", 100, 100);
	ArrayList<Product> products = new ArrayList<Product>();
	products.add(product);

	Location location = new Location("loc", "address", 111);
	ArrayList<Location> locations = new ArrayList<Location>();
	locations.add(location);

	Account account = new Account(1, 5);
	Farmer far = new Farmer("f1", "aa", "111", "far1", "aa", account, "aa", "asd", location, locations, products);

	}
	
	catch (Exception e) {
      	System.out.println("Something went wrong");
} 
}
}
