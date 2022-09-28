package Week4day2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leafgroundwindow {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");

		String oldwindow = driver.getWindowHandle();

		// Click and Confirm new Window Opens

		driver.findElement(By.xpath("//span[text()='Open']")).click();

		Set<String> windowHandles = driver.getWindowHandles();

		for (String newwindow : windowHandles) {

			driver.switchTo().window(newwindow);

		}

		String title1 = driver.getTitle();

		System.out.println("new window title :  " + title1);
		driver.close();

		driver.switchTo().window(oldwindow);

		// Find the number of opened tabs

		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();

		int numberofwindows = driver.getWindowHandles().size();

		System.out.println("number of windows opened  " + numberofwindows);

		// Close all windows except Primary

		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();

		Set<String> windowHandles2 = driver.getWindowHandles();

		for (String openwindows : windowHandles2) {

			if (!openwindows.equals(oldwindow)) {
				driver.switchTo().window(openwindows);

				driver.close();
			}

		}

		// Wait for 2 new tabs to open
		driver.switchTo().window(oldwindow);

		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();

	}

}
