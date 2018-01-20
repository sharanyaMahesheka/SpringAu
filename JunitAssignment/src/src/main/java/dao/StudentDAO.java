package dao;

import java.util.HashMap;
import java.util.Map;

import model.Student;

public class StudentDAO {
	private  Map<Integer,Student> studentList;
	static {
		
	}
	@SuppressWarnings("deprecation")
	public StudentDAO() {
	
	}

	public Student addStudent(Student student) {
		if(studentList.get(student.getRollNo())!=null)
		return null;
		
		studentList.put(student.getRollNo(), student);
		return studentList.get(student.getRollNo());
	}

	public Student updateStudent(Student student) {
		if(studentList.get(student.getRollNo())==null)
			return null;
		studentList.put(student.getRollNo(), student);	
		
		return studentList.get(student.getRollNo());

	}

	public Student getStudent(int rollNo) {
		if(studentList.get(rollNo)==null)
			return null;
			
		
		return studentList.get(rollNo);
	}

	

	public Student deleteStudent(int rollNo) {
		if(studentList.get(rollNo)==null)
			return null;
		return studentList.remove(rollNo);
		
	}
}
