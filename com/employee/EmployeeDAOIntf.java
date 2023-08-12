package com.employee;
//interface
public interface EmployeeDAOIntf {
	public void createEmployee(Employee em);
	public void showAllEmployees();
	public void showEmployeeBasedOnId(int id);
	public void updateEmployee(int id,String name);
	public void deleteEmployee(int id);
}
