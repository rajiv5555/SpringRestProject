/**
 * 
 */
package com.restapi.prac;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Raji
 *
 */
@XmlRootElement
@XmlType(propOrder={"id","name","designation"})
public class Employee {

	private int id;
	private String name;
	private String designation;
	
	
	public Employee() {
		
	}
	
	
	public Employee(int id, String name, String designation) {
		
		this.id = id;
		this.name = name;
		this.designation = designation;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
}
