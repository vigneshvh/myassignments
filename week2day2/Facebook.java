package maven1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.name("firstname")).sendKeys("Vignesh");

		driver.findElement(By.name("lastname")).sendKeys("S");
		driver.findElement(By.name("reg_email__")).sendKeys("vikibca07@gmail");
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("Vignesh@123");

		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		Select select1 = new Select(day);
		select1.selectByVisibleText("28");

		WebElement month = driver.findElement(By.name("birthday_month"));
		Select select2 = new Select(month);
		select2.selectByVisibleText("Sep");

		WebElement Year = driver.findElement(By.id("year"));
		Select select3 = new Select(Year);
		select3.selectByVisibleText("1997");

		driver.findElement(By.name("sex")).click();

	}

}
