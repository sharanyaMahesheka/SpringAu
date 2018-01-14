package Annotation;

@interface Student{
	int rollno();
	String name();
}
public class CustomAnnotation {
	
	public static void main(String args[]) {
		
	}
	@Student(rollno=20,name="Sharanya")
	public String toString() {
		return "To String Method";
	}

}
