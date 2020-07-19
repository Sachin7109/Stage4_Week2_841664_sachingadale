package com.cognizant.employee.dao;

import java.util.List;

import com.cognizant.employee.model.Employee;

public interface EmployeeDao {

	public List<com.cognizant.employee.model.Employee> getAllEmployees();

	public Employee getEmployeeById(int emp_id);

	public Employee updateEmployeeDetails(int emp_id, Employee employee);

	public Employee addEmployee(Employee employee);

	public void deleteEmployee(int emp_id);

}
