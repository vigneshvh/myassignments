package Week4day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leafgroundtable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://testleaf.herokuapp.com/pages/table.html");

		// no of row
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int size = rows.size();
		System.out.println("the number of rows in the table is :   " + size);

		// no of column
		List<WebElement> column = driver.findElements(By.tagName("th"));
		int size1 = column.size();

		System.out.println("the number of columns in the table is :  " + size1);

		// value ofLearn to interact

		WebElement getprogress = driver.findElement(By.xpath("//table//tr[3]//td[2]"));
		String text = getprogress.getText();
		System.out.println("the progress value of 'Learn to interact with Elements is  :" + text);
		;

		// vital task

		List<WebElement> vitaltask = driver.findElements(By.xpath("//td[2]"));
		List<Integer> list = new ArrayList<Integer>();

		for (WebElement webelement : vitaltask) {

			String value = webelement.getText().replace("%", "");
			list.add(Integer.parseInt(value));

		}

		int smallvalue = Collections.min(list);
		System.out.println("the least completed progress is  : " + smallvalue);

		String smallstring = Integer.toString(smallvalue) + "%";

		WebElement checkbox = driver.findElement(
				By.xpath("// td[normalize-space()=" + "\"" + smallstring + "\"" + "]" + "//following::td[1]"));

		checkbox.click();

	}

}
