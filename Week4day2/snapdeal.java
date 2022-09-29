package Week4day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class snapdeal {

	private static String snapshot;

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();

		driver.get("https://www.snapdeal.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement mensfashion = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));

		WebElement shoe = driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]"));

		Actions mouse = new Actions(driver);

		mouse.moveToElement(mensfashion).click(shoe).perform();

		String count = driver.findElement(By.xpath("//span[ @class='category-name category-count']")).getText();

		System.out.println(" the count of the sports shoes : " + count);

		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//i[@class ='sd-icon sd-icon-expand-arrow sort-arrow']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@class='search-li'])[1]")).click();

		Thread.sleep(2000);
		
		String sort = driver.findElement(By.xpath("//div[@class='sort-drop clearfix']/div")).getText();
		System.out.println(sort);

		if (sort.contains("Low To High")) {
			System.out.println("items displayed correctly");
		} else
			System.out.println("not listed correctly");

		driver.findElement(By.name("fromVal")).clear();
		driver.findElement(By.name("fromVal")).sendKeys("499");

		driver.findElement(By.name("toVal")).clear();
		driver.findElement(By.name("toVal")).sendKeys("1200");
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='filter-color-tile Navy ']")).click();

		Thread.sleep(3000);
		System.out.println("filters applied:");
		String text = driver.findElement(By.xpath("(//a[@data-key='Price|Price'])[1]")).getText();

		System.out.println(text);

		String text2 = driver.findElement(By.xpath("(//a[@data-key='Color_s|Color'])[1]")).getText();

		System.out.println(text2);

		Thread.sleep(3000);

		// mouse
		WebElement mouse1 = driver.findElement(By.xpath("(//div[@class='clearfix row-disc'])[1]"));

		Actions mouseover = new Actions(driver);

		mouseover.moveToElement(mouse1).click().release().perform();

		Thread.sleep(2000);
		String text3 = driver.findElement(By.xpath("//div[contains(@class,'product-price pdp-e-i-PAY-l')]//span[1]"))
				.getText();

		System.out.println("cost of the shoe is  :" + text3);

		String text4 = driver.findElement(By.xpath("//span[@class='payBlkBig']/following-sibling::span[1]")).getText();

		System.out.println("Discount amount is    :" + text4);

		File s = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(s, new File("C:\\Users\\DELL\\eclipse-workspace\\Sel\\screen.png"));

		driver.close();

	}
}
