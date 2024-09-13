package StudentDetails;

public class udergraduateStudent extends Student{

	public udergraduateStudent(String st_id, String name, double marks) {
		super(st_id, name, marks);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void displayStudentResults() {
		System.out.println("gpa valuw:"+marks);
	}
	
	

}
