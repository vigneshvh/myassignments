package Week4day2;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myntra {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();

		driver.get(" https://www.myntra.com/");
// mouseover mens and jackets
		WebElement mens = driver.findElement(By.xpath("(//div[@class='desktop-navContent'])[1]"));

		WebElement jacket = driver.findElement(By.xpath("(//*[text()='Jackets'])[1]"));

		Actions mouseover = new Actions(driver);

		mouseover.moveToElement(mens).click(jacket).perform();

		// total count of item

		String text = driver.findElement(By.className("title-count")).getText();

		System.out.println("total count of item : " + text);

		// click more brands

		driver.findElement(By.className("brand-more")).click();

		driver.findElement(By.className("FilterDirectory-searchInput")).sendKeys("duke");

		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id='mountRoot']/div/div[1]/main/div[3]/div[1]/section/div/div[3]/div[3]/div[2]/ul/li[2]/label"))
				.click();

		driver.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();

		// check brand duke

		List<WebElement> duke = driver.findElements(By.className("product-brand"));

		for (WebElement webElement : duke) {

			System.out.println(webElement.getText());

		}

		driver.findElement(By.xpath("//div[@class='sort-sortBy']")).click();

		// discount
		driver.findElement(By.xpath("(//*[@class='sort-label '])[4]")).click();
		Thread.sleep(2000);
		// first product
		String text2 = driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[1]")).getText();
		System.out.println("price of the first product  : " + text2);

		String parent = driver.getWindowHandle();

		driver.findElement(By.xpath("(//div   [@class ='product-productMetaInfo'])[1]")).click();

		Set<String> windowHandles = driver.getWindowHandles();

		for (String newwindow : windowHandles) {
			driver.switchTo().window(newwindow);

		}
		Thread.sleep(2000);
		File s = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(s, new File("C:\\Users\\DELL\\eclipse-workspace\\Sel\\myntra.png"));

		driver.findElement(By.xpath(
				"//span[@class='myntraweb-sprite pdp-notWishlistedIcon sprites-notWishlisted pdp-flex pdp-center ']"))
				.click();

		driver.quit();

	}

}
