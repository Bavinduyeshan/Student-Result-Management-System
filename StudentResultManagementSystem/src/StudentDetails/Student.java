package StudentDetails;

public class Student {
	private String st_id;
	private String name;
	protected double marks;
	
	public Student(String st_id,String name,double marks) {
		this.st_id=st_id;
		this.name=name;
		this.marks=marks;
	}

	//get the student id
	public String getSt_id() {
		return st_id;
	}
	
	

	//set the student id
	public void setSt_id(String st_id) {
		this.st_id = st_id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	public void displayStudentResults() {
		System.out.println("Student id:"+st_id);
		System.out.println("Student name:"+name);
		System.out.println("Student marks:"+marks);
	}

}
