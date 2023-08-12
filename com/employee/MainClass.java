package com.employee;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDAOImpl dao=new EmployeeDAOImpl();
		System.out.println("Welcome\nEmployee Management System!!");
		Scanner sc=new Scanner(System.in);
		int empid;
		String empname;
		
		do{
			System.out.println("1.Add the Employee\n2.Show all Employee\n3.Show all Employee Based on ID\n"
					+ "4.Update the Employee\n5.Delete the Employee\n6.Exit or Quit\n");
			System.out.println("Enter the choice:");
			
			int ch=sc.nextInt();
			switch(ch) {
			case 1: 
				Employee e=new Employee();
				System.out.println("Enter Employee ID: ");
				int id=sc.nextInt();
				System.out.println("Enter the Employee Name: ");
				String name=sc.next();
				System.out.println("Enter the Employee's salary: ");
				double sal=sc.nextDouble();
				System.out.println("Enter the Employee's Age: ");
				int age=sc.nextInt();
				e.setEid(id);
				e.setEname(name);
				e.setEsalary(sal);
				e.setEage(age);
				dao.createEmployee(e);
				break;
			case 2:
				dao.showAllEmployees();
				break;
			case 3:
				System.out.println("Enter the id to find the Employee Details: ");
				empid=sc.nextInt();
				dao.showEmployeeBasedOnId(empid);
				break;
			case 4:
				System.out.println("Enter the id to which you want to update: ");
				empid=sc.nextInt();
				System.out.println("Enter the name to be updated: ");
				name=sc.next();
				dao.updateEmployee(empid, name);
				break;
			case 5:
				System.out.println("Enter the Employee id to delete details:");
				empid=sc.nextInt();
				dao.deleteEmployee(empid);
				break;
			case 6:
				System.out.println("Thank You for using Our Application!!!");
				System.exit(0);
			default:
				System.out.println("Invalid Choice...Please Enter the Valid choice!!");
				break;
			}

		}while(true);

	}

}
