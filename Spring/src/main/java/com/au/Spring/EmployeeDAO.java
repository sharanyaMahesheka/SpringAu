package com.au.Spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDAO {
	private JdbcTemplate jdbcTemplate;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	// CRUD operations are implemented below
	public int addEmployee(Employee e){  
	    String query="insert into employees values('"+e.getId()+"','"+e.getName()+"','"+e.getAge()+"')";  
	    return jdbcTemplate.update(query);  
	}  
	public int updateEmployee(Employee e){  
	    String query="update employees set ename='"+e.getName()+"',eage='"+e.getAge()+"' where eid='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	public int deleteEmployee(Employee e){  
	    String query="delete from employees where eid='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	  
	public List<Employee> getAllEmployeesRowMapper(){
		// This implements row mapper to map rows.
		 return jdbcTemplate.query("select * from employees",new RowMapper<Employee>(){  
		    
			 public Employee mapRow(ResultSet rs, int rownumber) throws SQLException {  
		        Employee e=new Employee();  
		        e.setId(rs.getInt(1));  
		        e.setName(rs.getString(2));  
		        e.setAge(rs.getInt(3));  
		        return e;  
		    }  
		    });  
		}
	public Employee getEmpById(int id){
		return jdbcTemplate.query("select * from employees where eid="+id,new RowMapper<Employee>(){  
		    
			 public Employee mapRow(ResultSet rs, int rownumber) throws SQLException {  
		        Employee e=new Employee();  
		        e.setId(rs.getInt(1));  
		        e.setName(rs.getString(2));  
		        e.setAge(rs.getInt(3));  
		        return e;  
		    }  
		    }).get(0);
	
	}
	
	public void insertBatch(final List<Employee> emps){
		//batch updates
		String sql = "INSERT INTO employees VALUES (?, ?, ?)";

		List<Object[]> parameters = new ArrayList<Object[]>();

		for (Employee emp : emps) {
	        parameters.add(new Object[] {emp.getId(),
	            emp.getName(), emp.getAge()}
	        );
	    }
	    jdbcTemplate.batchUpdate(sql, parameters);
	}
	public Employee get5thEmployeebyAge() {
		return jdbcTemplate.query("select * from employees order by eage",new RowMapper<Employee>(){  
		    //get 5th lowest salary
			 public Employee mapRow(ResultSet rs, int rownumber) throws SQLException {  
		        Employee e=new Employee();  
		        e.setId(rs.getInt(1));  
		        e.setName(rs.getString(2));  
		        e.setAge(rs.getInt(3));  
		        return e;  
		    }  
		    }).get(4);  
		}
}
