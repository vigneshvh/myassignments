package Week4day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class droppable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/droppable");

		driver.switchTo().frame(0);

		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']//p[1]"));

		WebElement drop = driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));

		Actions mouse = new Actions(driver);
		mouse.dragAndDrop(drag, drop).perform();

	}

}
