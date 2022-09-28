package Week4day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draggable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/draggable");

		driver.switchTo().frame(0);

		WebElement drag = driver.findElement(By.xpath("//div[contains(@class,'ui-widget-content ui-draggable')]"));

		Actions mouse = new Actions(driver);
		mouse.clickAndHold(drag).moveToElement(drag, 150, 150).perform();
	}

}
