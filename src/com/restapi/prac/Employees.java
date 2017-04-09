package com.restapi.prac;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Employees {

	private List<Employee> employee;

	public Employees(List<Employee> employee) {
		
		this.employee = employee;
	}

	public Employees() {
		
	}

	/**
	 * @return the employee
	 */
	public List<Employee> getEmployee() {
		return employee;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	
	
	
	
	
}
