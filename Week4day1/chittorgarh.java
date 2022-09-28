package Week4day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chittorgarh {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.chittorgarh.com");

		driver.findElement(By.id("navbtn_stockmarket")).click();

		driver.findElement(By.linkText("NSE Bulk Deals")).click();

		// printing all the security names
		List<String> lst = new ArrayList<String>();
		List<WebElement> list1 = driver
				.findElements(By.xpath("//table[contains(@class,'table table-bordered')]//tr//td[3]"));

		System.out.println(list1.size());
		for (int i = 1; i < list1.size(); i++) {
			// Store the TrainName in List
			String trainName = driver
					.findElement(By.xpath("//table[contains(@class,'table table-bordered')]//tr[" + i + "]//td[3]"))
					.getText();
			// add data into list as string we can store
			lst.add(trainName);
		}

		System.out.println(" Sizeof list " + lst.size());
		Set<String> dupSet = new HashSet<String>(lst);
		System.out.println("size of Set " + dupSet.size());

		if (lst.size() == dupSet.size()) {
			System.out.println("Duplicate TrainName present");
		} else {
			System.out.println("Duplicate TrainName Not Present");
		}

	}
}
