package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.DuplicateEmployeeFoundException;
import com.example.demo.Exception.EmployeeNotFoundException;
import com.example.demo.bean.Employee;

@RestController
public class EmployeeController {

	List<Employee> alist = new ArrayList<Employee>();
	TreeSet<Employee> ts = new TreeSet<Employee>();

	@RequestMapping(value = "/getall", method = RequestMethod.GET)
	public Set<Employee> getEmployee() throws EmployeeNotFoundException{
		if (ts.size() == 0) 
			throw new EmployeeNotFoundException("There are no records Found");
		return ts;
	}

	@PostMapping(value = "/addEmployee")
	public ResponseEntity addEmployee(@RequestBody Employee emp) throws DuplicateEmployeeFoundException {
		
		boolean flag=ts.add(emp);
			if(flag)
			return new ResponseEntity(ts, HttpStatus.OK);			
		    throw new DuplicateEmployeeFoundException("Id matched ");
			
	}

	@GetMapping(value = "/getEmployee/{id}")
	public ResponseEntity getEmployeeById(@PathVariable int id) throws Exception {
		ResponseEntity<Employee> response = new ResponseEntity<Employee>(HttpStatus.OK);
		try {
			if (ts.size()> 0) {
				for (Employee m : ts) {
					if (m.getEmployID() == id) {
						response = new ResponseEntity<Employee>(m, HttpStatus.OK);
					}
				}
			} else {
				throw new EmployeeNotFoundException("There are no records Found with given id ");
			}
		} catch (Exception e) {
			throw new EmployeeNotFoundException();
			// e.printStackTrace();
		}
		return response;
	}



}
