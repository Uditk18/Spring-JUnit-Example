package com.cg.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.rest.pojo.Employee;


@RestController
public class TestController {

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setName("Udit");
		emp.setDesignation("Analyst");
		emp.setEmpId("1");
		emp.setSalary(10000);

		return emp;
	}

}