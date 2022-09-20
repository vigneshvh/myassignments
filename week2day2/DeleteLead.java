package maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.findElement(By.id("username")).sendKeys("DemoCSR");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();

		driver.findElement(By.linkText("Phone")).click();

		driver.findElement(By.name("phoneCountryCode")).clear();
		driver.findElement(By.name("phoneCountryCode")).sendKeys("91");

		driver.findElement(By.name("phoneNumber")).sendKeys("7092365061");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		Thread.sleep(3000);

		String Leadid = driver.findElement(By.linkText("10506")).getText();
		System.out.println(Leadid);

		driver.findElement(By.linkText("VIGNESH")).click();

		driver.findElement(By.linkText("Delete")).click();

		driver.findElement(By.linkText("Find Leads")).click();

		driver.findElement(By.name("id")).sendKeys(Leadid);

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		String list = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println(list);
		driver.close();

	}

}
