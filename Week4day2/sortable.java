package Week4day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sortable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/sortable");

		driver.switchTo().frame(0);

		List<WebElement> list1 = driver.findElements(By.xpath("//*[@id='sortable']/li"));

		WebElement click = list1.get(5);

		WebElement click2 = list1.get(2);

		Actions mouse = new Actions(driver);

		mouse.clickAndHold(click);
		mouse.moveToElement(click2);
		mouse.release(click2);
		mouse.build().perform();

	}

}
