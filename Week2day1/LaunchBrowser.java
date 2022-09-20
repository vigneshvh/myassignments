package maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.findElement(By.id("username")).sendKeys("DemoCSR");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		String text = driver.findElement(By.tagName("h2")).getText();

		System.out.println(text);

		String title = driver.getTitle();

		System.out.println(title);

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Selenium");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("VIGNESH");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("SRINIVASAN");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("VIKI");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("MR");

		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium Automation");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Filling the form using Selenium");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7092365061");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("automation@gmail.com");

		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select select1 = new Select(country);
		select1.selectByVisibleText("India");

		WebElement stateprovince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select2 = new Select(stateprovince);
		select2.selectByVisibleText("TAMILNADU");

		driver.findElement(By.name("submitButton")).click();

		String title2 = driver.getTitle();

		System.out.println(title2);

	}
}