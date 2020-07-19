package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Model {
	private String name;
	private String custid;
	private String accno;
	private String pwd;
	private String amt;
	private String email;
	private String recepient;
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet res;
	private int rows;
	
	public Model()
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// or DriverManager.registerDriver(new OracleDriver());
			con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "SYSTEM", "system");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getAmt() {
		return amt;
	}
	public void setAmt(String amt) {
		this.amt = amt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRecepient() {
		return recepient;
	}
	public void setRecepient(String recepient) {
		this.recepient = recepient;
	}
	
	
	public boolean login()
	{
		try 
		{
			pstmt=con.prepareStatement("SELECT *FROM BANK WHERE CUST_ID=? AND PWD=?");
			pstmt.setString(1,custid);
			pstmt.setString(2, pwd);
			res=pstmt.executeQuery();
			
			if(res.next()==true)
			{
				accno=res.getString("ACCNO");
				return true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean checkBalance() throws Exception 
	{
		pstmt=con.prepareStatement("SELECT * FROM BANK WHERE ACCNO=?");
		pstmt.setString(1, accno);	
		res=pstmt.executeQuery();
	
		if(res.next()==true)
			amt=res.getString("AMOUNT"); //res.getString(1) 1 bcz its only returning one column
			
		if(amt==null)
			return false;
		else
			return true;
	}
	
	public boolean changePwd() throws Exception
	{
		pstmt=con.prepareStatement("UPDATE BANK SET PWD=? WHERE ACCNO=?");
		pstmt.setString(1,pwd );
		pstmt.setString(2, accno);
		rows=pstmt.executeUpdate(); 
		
		if(rows==0)
			return false;
		else
			return true;
	}
	public boolean transfer() throws Exception
	{
		pstmt=con.prepareStatement("UPDATE BANK SET AMOUNT=AMOUNT-? WHERE ACCNO=?");
		pstmt.setString(1,amt );
		pstmt.setString(2, accno);
		rows=pstmt.executeUpdate(); 

		pstmt=con.prepareStatement("INSERT INTO BANK_STATEMENT VALUES(?,?)");
		pstmt.setString(1,accno);
		pstmt.setString(2,amt );
		pstmt.executeQuery(); 

		if(rows==0)
			return false;
		else
			return true;
	}
	 
	public boolean credit() throws Exception
	{
		pstmt=con.prepareStatement("UPDATE BANK SET AMOUNT=AMOUNT+? WHERE ACCNO=?");
		pstmt.setString(1,amt );
		pstmt.setString(2, recepient);
		rows=pstmt.executeUpdate(); 
		
		if(rows==0)
			return false;
		else
			return true;
	} 
	
	public ArrayList getStatement()
	{
		ArrayList al=new ArrayList();
		try 
		{
			pstmt=con.prepareStatement("SELECT * FROM BANK_STATEMENT WHERE ACCNO=?"); 
			pstmt.setString(1,accno);
			res=pstmt.executeQuery();
			while(res.next()==true)
			{
				al.add((String)res.getString(2));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return al;
	}
	
	public boolean forgotPassword() throws SQLException
	{
		pstmt=con.prepareStatement("UPDATE BANK SET PWD=? WHERE EMAIL=?");
		pstmt.setString(1,pwd);
		pstmt.setString(2, email);
		rows=pstmt.executeUpdate(); 
		
		if(rows==0)
			return false;
		else
			return true;
	}
}