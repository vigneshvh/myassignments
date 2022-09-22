package abstraction;

public class Automation extends MultipleLangauge implements TestTool {

	public void Selenium() {
		System.out.println("Selenium is testing framework");

	}

	public void Java() {
		System.out.println("java contains OOPS concepts ");

	}

	@Override
	public void ruby() {
		System.out.println("We can use Ruby language for automation testing");

	}

	public static void main(String[] args) {
		Automation obj = new Automation();
		obj.Selenium();
		obj.Java();
		obj.ruby();
		obj.python();

	}

}
