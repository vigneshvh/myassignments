package maven1;

public class Student {

	private void studentname() {
		String name = "Vignesh";
		System.out.println("Student name:" + name);

	}

	private void Rollno() {
		short rollno = 07;
		System.out.println("Roll number:" + rollno);

	}

	private void Collegename() {
		String collegename = "Gurunanak college";
		System.out.println("College name:" + collegename);

	}

	private void markscored() {
		short markscored = 500;
		System.out.println("Mark Scored:" + markscored);

	}

	private void Cgpa() {
		float cgpa = 7.5f;
		System.out.println("CGPA:" + cgpa);

	}

	public static void main(String[] args) {

		Student obj = new Student();
		System.out.println("Class Report");
		obj.studentname();
		obj.Rollno();
		obj.Collegename();
		obj.markscored();
		obj.Cgpa();

	}

}
