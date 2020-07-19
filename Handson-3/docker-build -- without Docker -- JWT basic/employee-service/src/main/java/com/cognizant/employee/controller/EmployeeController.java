package com.cognizant.employee.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.employee.model.Employee;
import com.cognizant.employee.service.EmployeeService;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping()
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@GetMapping(value = "/{emp_id}")
	public Employee getEmployeeById(@PathVariable @Valid int emp_id) {

		return employeeService.getEmployeeById(emp_id);
	}

	@PutMapping(value = "/{emp_id}")
	public Employee updateEmployeeDetails(@PathVariable @Valid int emp_id, @RequestBody Employee employee) {

		return employeeService.updateEmployeeDetails(emp_id, employee);
	}

	@PostMapping()
	public Employee addEmployee(@RequestBody Employee employee) {

		return employeeService.addEmployee(employee);
	}

	@DeleteMapping(value = "/{emp_id}")
	public String deleteEmployee(@PathVariable @Valid int emp_id) {

		employeeService.deleteEmployee(emp_id);
		return "Employee Deleted Successfully";
	}
}
