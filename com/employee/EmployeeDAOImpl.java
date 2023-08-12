package com.employee;

import java.sql.*;

//implementing the Employee interface
public class EmployeeDAOImpl implements EmployeeDAOIntf {
	Connection con;
	@Override
	public void createEmployee(Employee em) {
		con=DBConnection.createDBConnection();
		String query="insert into employee values(?,?,?,?)";
		try {
			PreparedStatement smt=con.prepareStatement(query);
			smt.setInt(1,em.getEid());
			smt.setString(2, em.getEname());
			smt.setDouble(3,em.getEsalary());
			smt.setInt(4, em.getEage());
			int c=smt.executeUpdate();
			if(c!=0) {
				System.out.println("Employee Details Insserted Successfully!!!\n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void showAllEmployees() {
		con=DBConnection.createDBConnection();
		String query="select * from employee";
		System.out.println("Employee Details : ");
		System.out.println("-----------------------------------------"
				+ "----------------------------------------------");
		System.out.println("ID\tName\t  Salary\tAge");
		System.out.println("-----------------------------------------"
				+ "----------------------------------------------");
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				System.out.format("%d\t%s\t%f\t%d\n", rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getInt(4));
				System.out.println("-----------------------------------------"
						+ "----------------------------------------------");
			}
			System.out.println();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void showEmployeeBasedOnId(int id) {
		con=DBConnection.createDBConnection();
		String query="select * from employee where eid="+id;
		System.out.println("Employee Details with the id "+id+ ":");
		System.out.println("ID\tName\t  Salary\tAge");
		System.out.println("-----------------------------------------"
				+ "----------------------------------------------");
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				System.out.format("%d\t%s\t%f\t%d\n", rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getInt(4));
			}
			System.out.println();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateEmployee(int id, String name) {
		con=DBConnection.createDBConnection();
		String query="update employee set ename=? where eid=?";
		try {
			PreparedStatement smt=con.prepareStatement(query);
			smt.setString(1, name);
			smt.setInt(2, id);
			int c=smt.executeUpdate();
			if(c!=0) {
				System.out.println("The Details you had given are successfully Updated!!!\n");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteEmployee(int id) {
		con=DBConnection.createDBConnection();
		String query="delete from employee where eid=?";
		try {
			PreparedStatement smt=con.prepareStatement(query);
			smt.setInt(1, id);
			int c=smt.executeUpdate();
			if(c!=0) {
				System.out.println("Employee Details for the id "+id+" has been deleted successfully!!!\n");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
