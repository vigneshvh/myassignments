package Week4day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class noofrowsandcolumn {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://html.com/tags/table");

		List<WebElement> rows = driver.findElements(By.xpath("//div[@class='render']//table[1]//tr"));
		int size = rows.size();
		System.out.println("the number of rows in the table is :   " + size);

		List<WebElement> column = driver.findElements(By.xpath("//div[@class='render']//table[1]//th"));
		int size1 = column.size();
		System.out.println("the number of columns in the table is :  " + size1);

	}

}
