package inheritance;

public class Student extends Department {

	public void studentName() {
		String name1 = "Vignesh";
		System.out.println("Student name is: " + name1);

	}

	public void studentDept() {

		String deptname = "BCA";
		System.out.println("Student Dept : " + deptname);

	}

	public void studentId() {

		int id = 25;
		System.out.println("Student id : " + id);

	}

	public static void main(String[] args) {

		Student obj = new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();

	}

}
