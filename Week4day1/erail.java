package Week4day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class erail {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://erail.in");

		driver.findElement(By.id("txtStationFrom")).clear();

		driver.findElement(By.id("txtStationFrom")).sendKeys("ms", Keys.TAB);

		driver.findElement(By.id("txtStationTo")).clear();

		driver.findElement(By.id("txtStationTo")).sendKeys("mdu", Keys.TAB);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input [@id='chkSelectDateOnly']")).click();

		List<WebElement> list1 = driver
				.findElements(By.xpath("//table[contains(@class,'DataTable TrainList')]//tr//td[2] "));

		for (WebElement webElement : list1) {

			System.out.println(webElement.getText());

		}

	}
}