package br.com.alessanderleite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public List<Employee> getEmployees() {
		List<Employee> list = employeeDAO.getAllEmployees();
		return list;
	}
}
