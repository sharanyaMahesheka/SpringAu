import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.stubbing.OngoingStubbing;
import org.mockito.stubbing.Stubber;


import dao.StudentDAO;
import model.Student;
import service.StudentService;

public class StudentServiceTest {
	@Mock
	StudentDAO mockedStudentDAO;
	@BeforeEach
	void setup()
	{
		MockitoAnnotations.initMocks(this);

	}
	
	@Test
	public void isAddStudentWorking() {
	
	
	@SuppressWarnings("deprecation")
	Student student=new Student(2, "sharanya", "Mahesheka","rty", new Date(1996, 04, 12), 5678, 3, "cse");
	Student student1=new Student(3, "Tanya", " mallick", "Techno India", new Date(1994, 03, 12), 9876553, "ece");
	Student student2=new Student(7, "Prachi","Choudhary", "VIT", new Date(1994, 9, 12), 4567, 9, "cse");
	
	Mockito.when(mockedStudentDAO.addStudent(student)).thenReturn(null);
	Mockito.when(mockedStudentDAO.addStudent(student1)).thenReturn(null);
	Mockito.when(mockedStudentDAO.addStudent(student2)).thenReturn(student2);
	StudentService studentService=new StudentService();
	
	Student stud=studentService.addStudent(student);
	Student stud1=studentService.addStudent(student1);
	Student stud2=studentService.addStudent(student2);
	assertNull(stud);
	assertNull(stud1);
	assertNotNull(stud2);
	assertEquals(student2, stud2);
}
	
	@Test
	public void isUpdateWorking()
	{
		@SuppressWarnings("deprecation")
		Student student=new Student(1, "Rishabh", "Choudhary", "JEC", new Date(1994, 03, 12), 12345, 3, "IT");
		
		Mockito.when(mockedStudentDAO.updateStudent(student)).thenReturn(null);
		
		StudentService studentService=new StudentService();
		
		Student stud=studentService.updateStudent(student);
		assertNotNull(stud);
	}
	
	@Test
	public void isDeleteWorking()
	{
		@SuppressWarnings("deprecation")
		Student student=new Student(1, "Aman", "Kumar", "XYZ", new Date(1994, 03, 12), 55675, 3, "It");
		
		Mockito.when(mockedStudentDAO.deleteStudent(1)).thenReturn(student);
		
		StudentService studentService=new StudentService();
		
		Student stud=studentService.deleteStudent(1);
		assertNotNull(stud);
	}
	
	@Test
	public void isGetStudentWorking()
	{
		@SuppressWarnings("deprecation")
		Student student=new Student(1, "Aman", "Kumar", "XYZ", new Date(1994, 03, 12), 55675, 3, "It");
		
		Mockito.when(mockedStudentDAO.getStudent(Matchers.anyInt())).thenReturn(student);
		
		StudentService studentService=new StudentService();
		
		Student stud=studentService.deleteStudent(1);
		assertNotNull(stud);
	}
}