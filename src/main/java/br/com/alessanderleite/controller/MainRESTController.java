package br.com.alessanderleite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.alessanderleite.dao.EmployeeDAO;
import br.com.alessanderleite.model.Employee;

@RestController
public class MainRESTController {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	@RequestMapping(value = "/employees",
			method = RequestMethod.GET,
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Employee> getEmployees() {
		List<Employee> list = employeeDAO.getAllEmployees();
		return list;
	}
	
	//URL:
	//http://localhost:8080/employee/{empId}
	@RequestMapping(value = "/employee/{empId}", 
			method = RequestMethod.DELETE,
			produces = {MediaType.APPLICATION_JSON_VALUE})
	public void deleteEmployee(@PathVariable Long empId) {
		
		System.out.println("(Service Side) Deleting employee with Id: " + empId);
		
		employeeDAO.deleteEmployee(empId);
	}
}
