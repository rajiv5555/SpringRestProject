/**
 * 
 */
package com.restapi.prac;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import javax.swing.text.html.FormSubmitEvent.MethodType;
import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Raji
 *
 */
@Controller
@RequestMapping(value="/emp")
public class EmployeeResource {
	
	private TreeMap<Integer,Employee> emps=new TreeMap<>();

	public EmployeeResource() {
	
		emps.put(100,new Employee(100,"Romi","SE"));
		emps.put(101,new Employee(101,"Rachit","SE"));
		emps.put(102,new Employee(102,"Rajiv","SE"));
	}
	
	@RequestMapping(value="/{id}",produces={"application/xml","application/json"},method=RequestMethod.GET)
	
	public @ResponseBody Employee findEmployee(@PathVariable("id") int id){
		return emps.get(id);
	}
	
	@RequestMapping(produces={"application/xml","application/json"},method=RequestMethod.GET)
	
	public @ResponseBody Employees getAllEmployee(){
		List<Employee> empp=new ArrayList<Employee>(emps.values());
		return new Employees(empp);
	}
	
	
	
	@RequestMapping(consumes={"application/xml","application/json"},produces={"text/plain"},method=RequestMethod.POST)
	
	public @ResponseBody String saveEmployee(@RequestBody Employee emp){
		int nextid=emps.lastKey()+1;
		emps.put(nextid, emp);
		return "Employee with id"+nextid+" added successfully";
	}
	
	
	
	

}
