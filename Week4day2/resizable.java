package Week4day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class resizable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/resizable");

		driver.switchTo().frame(0);

		WebElement findElement = driver
				.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-s']/following-sibling::div[1]"));

		Actions mouse = new Actions(driver);

		mouse.moveToElement(findElement).clickAndHold().moveByOffset(70, 70).release().perform();

	}

}
