package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		//load the URL
		driver.get("https://www.irctc.co.in/");
		
		//maximize the screen
		driver.manage().window().maximize();
		
		//add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//click flights
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		Set<String> wind=driver.getWindowHandles();
		
		//convert set to list
		List<String> newWindow= new ArrayList<String>(wind);
		
		//navigate to child window
		driver.switchTo().window(newWindow.get(1));
		
		//address of child window
		String childWindow=driver.getWindowHandle();
		System.out.println(childWindow);
		System.out.println(driver.getTitle());
		
		//close the parent tab
		WebDriver parentWindow=driver.switchTo().window(newWindow.get(0));
		System.out.println(parentWindow);
		driver.close();
		
		
		
		
		
		
	}

}
