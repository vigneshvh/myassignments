package Week4day2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mergecontact {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);

		String parent = driver.getWindowHandle();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.findElement(By.id("username")).sendKeys("DemoCSR");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Contacts")).click();

		driver.findElement(By.linkText("Merge Contacts")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//img[@alt='Lookup'])")).click();
		Thread.sleep(2000);

		Set<String> windowhandles = driver.getWindowHandles();
		for (String newwindow : windowhandles) {
			driver.switchTo().window(newwindow);

		}

		driver.findElement(By.xpath("(//span[text()='Advanced']/following::input)[2]")).sendKeys("viki");

		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[3]")).click();

		Thread.sleep(2000);
		driver.switchTo().window(parent);

		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Thread.sleep(2000);

		Set<String> windowhandles1 = driver.getWindowHandles();
		for (String newwindow2 : windowhandles1) {
			driver.switchTo().window(newwindow2);

		}

		driver.findElement(By.xpath("(//span[text()='Advanced']/following::input)[2]")).sendKeys("vignesh");

		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[3]")).click();
		driver.switchTo().window(parent);

		driver.findElement(By.linkText("Merge")).click();

		Alert alert = driver.switchTo().alert();

		alert.accept();
		Thread.sleep(3000);

		String title1 = driver.getTitle();

		System.out.println(title1);

	}

}
