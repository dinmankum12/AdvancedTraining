package com.dinesh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DBConnection {
	
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	DBConnection() throws SQLException {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/allproduct","root","");
			
			System.out.println("Connected...");
			
		}catch (Exception e) {
			
		}
		
	}
	
	public void insert(String pid, String pname, int price) throws Exception{
		ps = con.prepareStatement("insert into product(pid,pname,price) values(?,?,?)");
		ps.setString(1, pid);
		ps.setString(2, pname);
		ps.setInt(3, price);
		ps.executeUpdate();
		System.out.println("Inserted successfully...");
		
	}
	
	public void update(String pid, String pname, int price) throws Exception{
		ps = con.prepareStatement("Update product set pname=?, price=? where pid=?");
		ps.setString(3, pid);
		ps.setString(1, pname);
		ps.setInt(2, price);
		ps.executeUpdate();
		System.out.println("Updated successfully...");
		
	}
	
	public void delete(String pid) throws Exception{
		ps = con.prepareStatement("select * from product where pid=?");
		ps.setString(1, pid);
		rs = ps.executeQuery();
		
		if(rs.next()) {
			ps = con.prepareStatement("delete from product where pid=?");
			ps.setString(1, pid);
			ps.executeUpdate();
			System.out.println("Deleted successfully...");
		}else 
			System.out.println("Record not found..");
		
		
	}
	
	public void display() throws SQLException {
		ps = con.prepareStatement("select * from product");
		rs = ps.executeQuery();
		while(rs.next()) {
			System.out.printf("%-15s%-20s%5s\n",rs.getString(1),rs.getString(2),rs.getString(3));
		}
	
	}
	
	public void searchByPid(String pid) throws SQLException {
		ps = con.prepareStatement("select * from product where pid=?");
		ps.setString(1, pid);
		rs = ps.executeQuery();
		if(rs.next()) {
			System.out.printf("%-15s%-20s%5s\n",rs.getString(1),rs.getString(2),rs.getString(3));
		}else 
			System.out.println("Record not found..");
	
	}
	
	public void searchByPrice(int price) throws SQLException {
		boolean found = false;
		ps = con.prepareStatement("select * from product where price > ?");
		ps.setInt(1, price);
		rs = ps.executeQuery();
		while(rs.next()) {
			System.out.printf("%-15s%-20s%5s\n",rs.getString(1),rs.getString(2),rs.getString(3));
			found = true;
		}
		if(!found)
			System.out.println("Record not found..");
	}
	
	public void close() throws Exception{
		con.close();
		System.out.println("connection closed...");
	}

}
