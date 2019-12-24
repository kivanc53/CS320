import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Account {
	static int no = 1;
	double balance;
	String url = String.format(
			"jdbc:mysql://localhost:3306/Project320?user=root&password=Ricardo&useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey");
	public Connection conn = DriverManager.getConnection(url);

	public Account(int no, double balance) throws SQLException {
		this.balance = balance;
		try {
			PreparedStatement pStmt = conn.prepareStatement("INSERT INTO account () VALUES ( ?, ?)");
			pStmt.setInt(1, this.getNo());
			pStmt.setDouble(2, this.getBalance());
			pStmt.executeUpdate();

			System.out.println("Account saved successfully" + " Account No: " + getNo() + " Balance: " + getBalance());

		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
		}
	}

	public void setBalance(double x) {
		balance += x;

	}

	public double getBalance() {
		return this.balance;
	}

	public int getNo() {
		return no;

	}
	public double getBalanceChange(){
		return 1123 ;
	}

}
