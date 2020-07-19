package com.cognizant.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.employee.dao.EmployeeDao;
import com.cognizant.employee.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeDao.getAllEmployees();
	}
	
	@Override
	public Employee getEmployeeById(int emp_id) {

		return employeeDao.getEmployeeById(emp_id);
	}

	@Override
	public Employee updateEmployeeDetails(int emp_id, Employee employee) {

		return employeeDao.updateEmployeeDetails(emp_id, employee);
	}

	@Override
	public Employee addEmployee(Employee employee) {

		return employeeDao.addEmployee(employee);
	}

	@Override
	public void deleteEmployee(int emp_id) {

		employeeDao.deleteEmployee(emp_id);
	}

}
