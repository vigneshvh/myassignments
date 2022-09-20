package inheritance;

public class Desktop extends Computer {
	public void desktopSize() {

		String size = "60.45cms (23.8)";

		System.out.println("desktop size is : " + size);

	}

	public static void main(String[] args) {

		Desktop obj = new Desktop();
		obj.computerModel();
		obj.desktopSize();

	}

}
