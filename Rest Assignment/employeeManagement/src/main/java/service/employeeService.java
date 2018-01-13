package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import modal.employee;

public class employeeService {

	static List<employee> employeeList = new ArrayList<employee>();

	public employeeService() {
		employee e1 = new employee();
		e1.setEmpId(1);
		e1.setEmpName("Payal");
		employeeList.add(e1);
	}

	public List<employee> getAllEmployee() {
		return this.employeeList;
	}

	public employee getEmployee(int Id) {

		Optional<employee> matchingEmployee = employeeList.stream().filter(p -> p.getEmpId() == Id).findFirst();
		if (matchingEmployee.isPresent())
			return matchingEmployee.get();
		else
			return null;
	}

	public String insert(employee employee) {
		int id = employee.getEmpId();
		for (employee e : employeeList) {
			if (e.getEmpId() == id) {
				return "Employee id:" + id + " already Exists! Please try with another ID";
			}
		}

		employeeList.add(employee);
		return "Successfully inserted employee with id" + employee.getEmpId();
	}
	
	public String update(int id, String name) {
		for(employee e: employeeList){
			if(e.getEmpId() == id){
				
				e.setEmpName(name);
				return "Updated name successfully";
			}
		}
		
		return "There is no employee with ID:" + id;
	}
	public String delete(int id) {
		
		
		Iterator<employee> iterator = employeeList.iterator();
		
		while(iterator.hasNext())
		{
		    employee e = iterator.next();
		    if (e.getEmpId() == id)
		    {
		        iterator.remove();
		        return "Successfully deleted !!";
		    }
		}
		return "No record found with ID: " + id;
	}

}
