package maven1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ajio {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();

		driver.get("https://www.ajio.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);

		driver.findElement(By.xpath("//label[@for='Men']")).click();

		WebElement click1 = driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']"));
		driver.executeScript("arguments[0].click();", click1);

		Thread.sleep(3000);

		String noofbags = driver.findElement(By.className("length")).getText();
		System.out.println(noofbags);

		List<WebElement> list1 = driver.findElements(By.className("brand"));
		System.out.println("total number of brands :");
		System.out.println(list1.size());

		System.out.println("List of brands are  :");
		for (WebElement brandname : list1) {
			String text = brandname.getText();
			System.out.println(text);

		}
		System.out.println("List of bag names are :");
		for (WebElement bagname : list1) {
			String text = bagname.getText();
			System.out.println(text);

		}
	}

}
