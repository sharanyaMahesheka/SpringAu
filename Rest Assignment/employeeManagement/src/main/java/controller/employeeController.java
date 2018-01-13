package controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import modal.employee;
import service.employeeService;

@Path("EmployeeManagement/services/")
public class employeeController {

	static employeeService service= new employeeService();
	/**
	 * Method handling HTTP GET requests. The returned object will be sent
	 * to the client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Produces({"application/xml", "application/json"})
	public List<employee> getAllEmployeeDetails() {
		
		return service.getAllEmployee();
	}
	
	@GET
	@Path("/{empId}")
	@Produces({"application/xml", "application/json"})
	public employee getEmployeeDetails(
			@PathParam("Id") int id) {
	
		return service.getEmployee(id);
	}
	@POST
	@Path("deleteEmployee/{empId}")
	public String deleteEmployee(@PathParam("empId") int id){
		return service.delete(id);
	}		

	@POST
	@Path("updateEmployee/{param1}/{param2}")
	@Consumes({"application/xml", "application/json"})
	public String updateEmployee(@PathParam("param1") int id,@PathParam("param2") String name){
		
		return service.update(id, name);
	}
	
	

	@POST
	@Consumes({"application/xml", "application/json"})
	public String insertEmployee(employee employee) {
		//use logging within controller functions- which is useful for debugging
		System.out.println("inserting a new employee");
		return service.insert(employee);
		}
}
