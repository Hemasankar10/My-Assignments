package week5.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		//load url
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//switch to the frame
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
		//handle alert
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		String text=driver.findElement(By.xpath("//h2[text()='JavaScript Confirm Box']/following::p")).getText();
		System.out.println(text);
		
		

	}

}
