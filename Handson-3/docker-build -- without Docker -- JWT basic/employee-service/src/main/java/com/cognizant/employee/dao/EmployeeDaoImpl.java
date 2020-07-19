package com.cognizant.employee.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.employee.exception.EmployeeNotFoundException;
import com.cognizant.employee.model.Employee;
import com.cognizant.employee.repository.EmployeeRepository;

@Service
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {

		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(int emp_id) {

		Employee employee = employeeRepository.findById(emp_id).<EmployeeNotFoundException>orElseThrow(() -> {
			throw new EmployeeNotFoundException();
		});
		return employee;
	}

	@Override
	public Employee updateEmployeeDetails(int emp_id, Employee employee) {

		Employee employeeFound = employeeRepository.findById(emp_id).<EmployeeNotFoundException>orElseThrow(() -> {
			throw new EmployeeNotFoundException();
		});

		employee.setEmp_id(emp_id);
		employeeRepository.save(employee);

		return employeeFound;
	}

	@Override
	public Employee addEmployee(Employee employee) {

		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(int emp_id) {

		Employee employeeFound = employeeRepository.findById(emp_id).<EmployeeNotFoundException>orElseThrow(() -> {
			throw new EmployeeNotFoundException();
		});

		employeeRepository.delete(employeeFound);
	}

}
