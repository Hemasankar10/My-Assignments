package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandlingAndInteraction {

	public static void main(String[] args) {
		
		//instantiate the chrome driver
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		
		//load url
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//maximize the windows
		driver.manage().window().maximize();
		
		//add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//to find and add inputs in username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				
		//to find and add inputs in password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
			
		//to click login button
		driver.findElement(By.className("decorativeSubmit")).click();
				
		//click on crm/sfa link
		driver.findElement(By.partialLinkText("CRM")).click();
		
		//click on the contact button
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		//click on merge contacts
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		//click on the widget of from contact
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		
		//to handle windows
		Set<String> toCont=driver.getWindowHandles();
		
		//to handle child window covert set to list
		List<String> contList=new ArrayList<String>(toCont);
		
		//switch to child window
		driver.switchTo().window(contList.get(1));
		
		//address of child window 1 from contacts
		String childWind1=driver.getWindowHandle();
		System.out.println(childWind1);
		System.out.println(driver.getTitle());
		
		//switch to parent window
		driver.switchTo().window(contList.get(0));
		//click on the widget of to contact
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		
		//address of child window 2 To contacts
		driver.switchTo().window(contList.get(1));
		String childWind2=driver.getWindowHandle();
		System.out.println(childWind2);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		//click on second resulting contact
		driver.findElement(By.xpath("//a[text()='DemoLBCust']")).click();
		
		//click on merge button
		driver.switchTo().window(contList.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		//accept the alert
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		//verify the title of the page
		String title=driver.getTitle();
		System.out.println(title);
		String msg=driver.findElement(By.xpath("//div[@class='messages']")).getText();
		System.out.println(msg);

	}

}
