package inheritance;

public class Students {

	public void Studentinfo(int id) {
		System.out.println("Student id is " + id);
	}

	public void Studentinfo(int id, String name) {
		System.out.println("Student id is " + id);
		System.out.println("Student name is " + name);

	}

	public void Studentinfo(String mail, long num) {
		System.out.println("Student Email id is " + mail);
		System.out.println("Student phone number is " + num);
	}

	public static void main(String[] args) {
		Students obj = new Students();
		obj.Studentinfo(07);
		obj.Studentinfo(07, "Vignesh");

		obj.Studentinfo("vikibca07@gmail.com", 7092365061l);

	}

}
