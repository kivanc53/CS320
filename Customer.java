import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

class Customer extends User {

	
	public Customer(String name, String lastname, String ssn, String username, String password, Account account, String email, String phone_no, Location location, ArrayList<Location> locations) throws SQLException {
		super(name, lastname, ssn, username, password, account, email, phone_no, location);
//		String locationstemp = this.locations.toString();
//		locationstemp = locationstemp.replaceAll("\\p{P}", "");
//		System.out.println("Consumer Locations Saved! ---> " + locationstemp);
//		try {
//			PreparedStatement pStmt = conn.prepareStatement("INSERT INTO consumer () VALUES ( ?, ?)");
//			pStmt.setInt(1, this.account.getNo());
//			pStmt.setString(2, "" + (locationstemp) + "");
//
//			pStmt.executeUpdate();
//
//			System.out.println("Consumer saved successfully");
//
//			Account.no++;
//
//		} catch (SQLException ex) {
//			ex.printStackTrace();
//		} finally {
//
//		}
	}
	
	public Account getAccount() {
		return super.account;
	}

}
	/*public String giveinfo() {
		String info = "";
		info += "Account No : " + super.account.getNo() + "\n";
		info += "Balance : " + super.account.getBalance() + "\n" ;
		info +="Locations : ";
		for(Location location : locations) {
			info += location.loc + " ";
		}
		return info;
	}*/
	
	


