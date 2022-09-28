package Week4day2;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();

		driver.get(" https://www.amazon.in");

		// search as oneplus

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro ", Keys.ENTER);
// price of product
		String text = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[4]")).getText();
		System.out.println("price of the first product is  :" + text);

		// ratings for the first displayed product

		String text2 = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
		System.out.println(" number of customer ratings :  " + text2);

		// Mouse Hover on the stars
		WebElement mouseover = driver.findElement(By.xpath("(//a[@href='javascript:void(0)']//i)[1]"));

		// WebElement mouseover1 =
		//

		Actions mouseclick = new Actions(driver);

		mouseclick.scrollByAmount(0, 150).moveToElement(mouseover).click().build().perform();

		// rating percentage
		Thread.sleep(2000);
		String text3 = driver.findElement(By.xpath("//*[@id=\"histogramTable\"]/tbody/tr[1]/td[3]/span[2]/a"))
				.getText();

		System.out.println("percentage of ratings for the 5 star  : " + text3);

		// first text link of the first image

		String parent = driver.getWindowHandle();

		driver.findElement(By.xpath("(//span[contains(@class,'a-size-medium a-color-base')])[1]")).click();

		Set<String> windowHandles = driver.getWindowHandles();
		for (String newwindow : windowHandles) {

			driver.switchTo().window(newwindow);

		}
		Thread.sleep(2000);

		// screenshot

		File s = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(s, new File("C:\\Users\\DELL\\eclipse-workspace\\Sel\\amazon.png"));

		Thread.sleep(2000);
//add to cart
		driver.findElement(By.xpath("//input[@class='a-button-input attach-dss-atc']")).click();
		Thread.sleep(3000);

		String text4 = driver
				.findElement(By.xpath("//span[contains(@class,'a-size-base-plus a-color-price')]//span[1]")).getText();
		System.out.println("Sub total amount : " + text4);

	}

}
