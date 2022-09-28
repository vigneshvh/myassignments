package Week4day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Absoluteusage {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://html.com/tags/table");

		List<WebElement> list1 = driver.findElements(By.xpath("//div[@class='render']//table[1]//tr[2]"));

		for (WebElement webElement : list1) {

			System.out.println(webElement.getText());

		}

	}
}
