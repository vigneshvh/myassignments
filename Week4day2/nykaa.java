package Week4day2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class nykaa {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String parent = driver.getWindowHandle();

		Actions brand = new Actions(driver);

		WebElement brandmove = driver.findElement(By.xpath("(//a[@class='css-1mavm7h'])[2]"));
		WebElement brandmove1 = driver.findElement(By.xpath("//*[@id=\'brandCont_Popular\']/ul/li[5]/a"));

		brand.moveToElement(brandmove).click(brandmove1).perform();

		String title1 = driver.getTitle();

		System.out.println(title1);
		Thread.sleep(2000);

		driver.findElement(By.xpath(" //button[@class=' css-n0ptfk']")).click();

		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();

		driver.findElement(By.xpath("//span[text()='Category']")).click();

		WebElement click1 = driver.findElement(By.xpath("//*[@id=\"custom-scroll\"]/ul/li[2]/div"));
		driver.executeScript("arguments[0].click();", click1);

		driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();

		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();

		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();

		String check = driver.findElement(By.xpath("(//span[@class='filter-value'])[1]")).getText();
		System.out.println("filter is applied with  " + check);

		driver.findElement(By.xpath("//div[@class='css-43m2vm']//img[1]")).click();

		Thread.sleep(2000);

		Set<String> windowHandles = driver.getWindowHandles();

		for (String newwindow : windowHandles) {

			driver.switchTo().window(newwindow);

		}

		WebElement select = driver.findElement(By.xpath("//select[@title='SIZE']"));

		Select size = new Select(select);

		size.selectByVisibleText("175ml");

		String text = driver.findElement(By.xpath("(//span [@class = 'css-1jczs19'])[1]")).getText();
		System.out.println("MRP of the product is   " + text);

		driver.findElement(By.xpath("//div[@class='css-vp18r8']//button[1]")).click();

		driver.findElement(By.xpath("//button[@type='button'][@class='css-g4vs13']")).click();

		Thread.sleep(3000);

		driver.switchTo().frame(0);

		String text2 = driver.findElement(By.xpath("//div[@class='value medium-strong']")).getText();
		System.out.println("Grand total is  : " + text2);

		driver.findElement(By.xpath("//button[@type='button'][@class='btn full fill no-radius proceed ']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();

		String text3 = driver.findElement(By.xpath("(//div[@class='value'])[2]")).getText();
		System.out.println("Grand total is  : " + text3);

		if (text3.equals(text2))
			System.out.println("grand total is same ");
		driver.quit();

	}

}
