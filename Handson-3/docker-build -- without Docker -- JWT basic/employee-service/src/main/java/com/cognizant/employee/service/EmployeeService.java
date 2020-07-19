package com.cognizant.employee.service;

import java.util.List;

import com.cognizant.employee.exception.EmployeeNotFoundException;
import com.cognizant.employee.model.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();

	public Employee getEmployeeById(int emp_id);

	public Employee updateEmployeeDetails(int emp_id, Employee employee);

	public Employee addEmployee(Employee employee);

	public void deleteEmployee(int emp_id);
}
