package com.au.Spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	 public static void main( String[] args ){
	        
	    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	      
	        EmployeeDAO dao=(EmployeeDAO)context.getBean("edao");  
	        
	        List<Employee> list=dao.getAllEmployeesRowMapper();  
	        for(Employee e:list)  
	            System.out.println(e.getName()); 
	        
	        List<Employee> eList = new ArrayList<Employee>();
	        Employee e1= new Employee(5,"sharanya",25);
	        Employee e2= new Employee(6,"tanya",23);
	        Employee e3= new Employee(9,"rahul",36);
	        
	        eList.add(e1);
	        eList.add(e2);
	        eList.add(e3);
	        
	        dao.insertBatch(eList);
}
}