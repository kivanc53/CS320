import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DataBase {
	ArrayList<String> userlist;
	ArrayList<String> pwlist;
	protected Connection conn = null;
	String url = String.format(
			"jdbc:mysql://localhost:3306/project320final?user=root&password=Ricardo&useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey");

	public DataBase() throws SQLException {
		userlist = new ArrayList<String>();
		pwlist = new ArrayList<String>();
		conn = DriverManager.getConnection(url);
	}

	public DataBase(String url) throws SQLException {
		conn = DriverManager.getConnection(url);
	}

	public void addCustomer(Customer customer) throws SQLException {
		{
			try {
				PreparedStatement pStmt1 = conn
						.prepareStatement("INSERT INTO user () VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?)");
				pStmt1.setInt(1, customer.getAccount().getId());
				pStmt1.setString(2, customer.name);
				pStmt1.setString(3, customer.lastname);
				pStmt1.setString(4, customer.ssn);
				pStmt1.setString(5, customer.username);
				pStmt1.setString(6, customer.password);
				pStmt1.setString(7, customer.email);
				pStmt1.setString(8, customer.phone_no);
				pStmt1.setInt(9, customer.location.getLocId());

				PreparedStatement pStmt2 = conn.prepareStatement("INSERT INTO location () VALUES ( ?, ?, ?, ?)");
				pStmt2.setInt(1, customer.location.getLocId());
				pStmt2.setString(2, customer.location.city);
				pStmt2.setString(3, "ADDRESS");
				pStmt2.setInt(4, customer.location.zip);

				pStmt2.executeUpdate();
				pStmt1.executeUpdate();

				System.out.println("Customer saved successfully");
			}

			finally {
				Account.idPP();
				Location.locIdPP();
			}
		}

	}

	public void addFarmer(Farmer farmer) throws SQLException {

		try {
			PreparedStatement pStmt1 = conn.prepareStatement("INSERT INTO user () VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			pStmt1.setInt(1, farmer.getAccount().getId());
			pStmt1.setString(2, farmer.name);
			pStmt1.setString(3, farmer.lastname);
			pStmt1.setString(4, farmer.ssn);
			pStmt1.setString(5, farmer.username);
			pStmt1.setString(6, farmer.password);
			pStmt1.setString(7, farmer.email);
			pStmt1.setString(8, farmer.phone_no);
			pStmt1.setInt(9, farmer.location.getLocId());

			PreparedStatement pStmt2 = conn.prepareStatement("INSERT INTO location () VALUES ( ?, ?, ?, ?)");
			pStmt2.setInt(1, farmer.location.getLocId());
			pStmt2.setString(2, farmer.location.city);
			pStmt2.setString(3, "ADDRESS");
			pStmt2.setInt(4, farmer.location.zip);

			String locationstemp = farmer.shipping_locations.toString();

			PreparedStatement pStmt3 = conn.prepareStatement("INSERT INTO farmer () VALUES ( ?, ?, ?)");
			pStmt3.setInt(1, farmer.getAccount().getId());
			pStmt3.setString(2, "" + (locationstemp) + "");
			pStmt3.setInt(3, farmer.tempProductId);

			pStmt2.executeUpdate();
			pStmt1.executeUpdate();
			pStmt3.executeUpdate();
		} finally {
			Account.idPP();
			Location.locIdPP();
		}

	}

	public void addProduct(Product product) throws SQLException {

		try {
			PreparedStatement pStmt1 = conn.prepareStatement("INSERT INTO product () VALUES ( ?, ?, ?, ?, ?");
			pStmt1.setInt(1, product.getProductId());
			pStmt1.setString(2, product.name);
			pStmt1.setString(3, product.dsc);
			pStmt1.setDouble(4, product.perprice);
			pStmt1.setDouble(5, product.stock);

			pStmt1.executeUpdate();

		} finally {
			// BIR FARMER ICIN BUTUN PRODUCTLAR GIRILDIKTEN SONRA pID ++
			// YAPILMALI
		}

	}

	public ArrayList<Farmer> getFarmers(Location location) {
		ArrayList<Farmer> farmers = new ArrayList();
		ArrayList<Integer> ids = new ArrayList();

		try {
			PreparedStatement pStmt = conn.prepareStatement("SELECT user.acc FROM user "
					+ "INNER JOIN location ON user.locationId = location.locationId WHERE location.locationId ="
					+ location.getLocId());
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1));
				ids.add(rs.getInt(1));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		/*
		 * try { for (int i = 0; i < ids.size(); i++) { PreparedStatement pStmt
		 * = conn.prepareStatement("SELECT * FROM user WHERE locationId = " +
		 * ids.get(i)); ResultSet rs = pStmt.executeQuery(); while (rs.next()) {
		 * new Farmer lol (rs.getString("name"),rs.getString("lastname"),
		 * rs.getString("ssn"), rs.getString("userName"),
		 * rs.getString("userPass"),Account("") String email, String phone_no,
		 * Location location, ArrayList<Location> shipping_locations,
		 * ArrayList<Product> products);
		 * 
		 * 
		 * }
		 * 
		 * } catch (Exception e) { e.printStackTrace(); }
		 */
		finally {
		}

		return farmers;
	}

	public String getProductsOfFarmer(Farmer farmer) {
		int tempId = farmer.getProductId();
		String temp = null;
		try {
			PreparedStatement pStmt = conn.prepareStatement("SELECT productName,productDesc,productPrice,productStock"
					+ " FROM product INNER JOIN farmer ON product.productId = farmer.productId WHERE farmer.productId ="
					+ tempId);
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(1));
				temp += (rs.getString(1) + " | ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}

		return temp;
	}

	public ArrayList<Location> getLocationsofFarmer(Farmer farmer) {
		// get all the locations of a farmer can deliver
		return new ArrayList<Location>();
	}

	public ArrayList<Product> getProductsofCustomer(Customer customer) {
		// get all the products of a customer already bought
		return new ArrayList<Product>();
	}

	public ArrayList<Product> getProductsofFarmerSold(Farmer farmer) {
		// get all the products sold by a farmer
		return new ArrayList<Product>();
	}

	public String getUserName(User user) {
		int accTemp = user.account.getId();
		String accTemp2 = null;
		try {
			PreparedStatement pStmt = conn.prepareStatement("SELECT username FROM user where user.acc = " + accTemp);
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(1));
				accTemp2 = rs.getString(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}

		return accTemp2;
	}

	public String getPassWord(User user) {
		int accTemp = user.account.getId();
		String accTemp2 = null;
		try {
			PreparedStatement pStmt = conn.prepareStatement("SELECT userPass FROM user where user.acc = " + accTemp);
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(1));
				accTemp2 = rs.getString(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}

		return accTemp2;
	}

	public String getSSN(User user) {
		int accTemp = user.account.getId();
		String accTemp2 = null;
		try {
			PreparedStatement pStmt = conn.prepareStatement("SELECT ssn FROM user where user.acc = " + accTemp);
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(1));
				accTemp2 = rs.getString(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}

		return accTemp2;
	}

	public String getName(User user) {
		int accTemp = user.account.getId();
		String accTemp2 = null;
		try {
			PreparedStatement pStmt = conn.prepareStatement("SELECT name FROM user where user.acc = " + accTemp);
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(1));
				accTemp2 = rs.getString(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}

		return accTemp2;
	}

	public String getLastName(User user) {
		int accTemp = user.account.getId();
		String accTemp2 = null;
		try {
			PreparedStatement pStmt = conn.prepareStatement("SELECT lastname FROM user where user.acc = " + accTemp);
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(1));
				accTemp2 = rs.getString(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}

		return accTemp2;
	}

	public String getEmail(User user) {
		int id = user.account.getId();
		String out = null;
		try {
			PreparedStatement pStmt = conn.prepareStatement("SELECT email FROM user where acc=" + id);
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {

				out = (rs.getString(1));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return out;
	}

	public String getPhoneNo(User user) {
		int accTemp = user.account.getId();
		String accTemp2 = null;
		try {
			PreparedStatement pStmt = conn.prepareStatement("SELECT phoneNum FROM user where user.acc = " + accTemp);
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(1));
				accTemp2 = rs.getString(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}

		return accTemp2;
	}

	public Account getAccount(User user) {
		int accTemp = user.account.getId();
		Account temp = null;
		try {
			PreparedStatement pStmt = conn.prepareStatement("SELECT account.acc, balance FROM account "
					+ "INNER JOIN user ON account.acc = user.acc WHERE account.acc =" + accTemp);
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				temp = new Account(rs.getInt(1), rs.getDouble(2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}

		return temp;
	}

	public Location getLocation(User user) {
		int accTemp = user.account.getId();
		Location temp = null;
		try {
			PreparedStatement pStmt = conn.prepareStatement("SELECT location.city, location.address, location.zip FROM location "
					+ "INNER JOIN user ON location.locationID = user.locationId WHERE user.acc =" + accTemp);
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getInt(3));
				
				temp = new Location(rs.getString(1), rs.getString(2),rs.getInt(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}

		return temp;
	}

	public void updateAccount(Account account, double change) throws SQLException {
		int tempAcc = account.getId();
		PreparedStatement pStmt1 = conn
				.prepareStatement("UPDATE account SET balance = " + change + " WHERE acc=" + tempAcc);
		pStmt1.executeUpdate();
	}

	public String findUser(String username) {
		String username1 = null;
		try {
			PreparedStatement pStmt = conn
					.prepareStatement("SELECT acc FROM user WHERE username LIKE '%" + username + "%'");
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				username1 = rs.getString(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}

		return username1;
	}

	public double getBalance(Account account) {
		double balance = 0;
		try {
			PreparedStatement pStmt = conn.prepareStatement("SELECT balance FROM acc WHERE acc =" + account.getId());
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				balance = rs.getDouble(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}

		return balance;
	}

	public ArrayList<String> getActivities(Account account) {
		// Get the past Activities of an Account
		return new ArrayList<String>();
	}

	public void getDBacc() {
		//INITIAL ACCOUNT IDS GATHERED SINCE MULTIPLE PK's OCCURINGS
	    //WHEN THE PROGRAM STARST IT WILL GET THE LAST CREATED PK's
		
		try {
			PreparedStatement pStmt = conn.prepareStatement("SELECT MAX(acc) AS acc FROM account");
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				Account.id = rs.getInt(1) + 1;
				System.out.println("Last created account id: " + rs.getString(1));
			}
			PreparedStatement pStmt1 = conn.prepareStatement("SELECT MAX(locationId) AS locationId FROM location");
			ResultSet rs1 = pStmt1.executeQuery();
			while (rs1.next()) {
				Location.locId = rs1.getInt(1) + 1;
				System.out.println("Last created location id: " + rs1.getString(1));
			}
			PreparedStatement pStmt2 = conn.prepareStatement("SELECT MAX(productId) AS productId FROM product");
			ResultSet rs2 = pStmt2.executeQuery();
			while (rs1.next()) {
				Product.pId = rs2.getInt(1) + 1;
				System.out.println("Last created location id: " + rs2.getString(1));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void showTables() {

		try {
			PreparedStatement pStmt = conn.prepareStatement("SHOW TABLES");
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {

				System.out.println(rs.getString(1));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
