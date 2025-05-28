package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class TestcasePVR {

	public static void main(String[] args) {
		
		EdgeDriver driver=new EdgeDriver();
		
		//load URL
		driver.get("https://www.pvrcinemas.com/");
		
		//add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//maximize the screen
		driver.manage().window().maximize();
		
		//selecting the location as chennai
		driver.findElement(By.xpath("(//span[@class='cities-placed'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='cities-overlay cities-active'])[6]")).click();
		
		//selecting cinemas from quick book
		driver.findElement(By.xpath("//span[@class='cinemas-inactive']")).click();
		
		//select your cinema
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		
		//select the location (grand parent to grandchild)
		driver.findElement(By.xpath("//div[@class='p-dropdown-items-wrapper']//li[3]")).click();
				
		//select the date
		driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		
		//select the movie
		driver.findElement(By.xpath("//span[text()='FINAL DESTINATION BLOODLINES']")).click();
		
		//select the timing
		driver.findElement(By.xpath("//span[text()='06:50 PM']")).click();
		
		//enter book button
		driver.findElement(By.xpath("(//span[text()='Book'])[4]")).click();
		
		//handling sweet alert
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		
		//driver.navigate();
		
		//accept the terms and conditions
		//driver.findElement(By.xpath("//button[@class='sc-kfeOyU hsmcHs reject-terms']")).click();
		
		//driver.findElement(By.xpath("//button[text()='Accept']")).click();
		driver.findElement(By.xpath("//div[@class='accpet-btn-flow-seat']//button[2]")).click();
		
		//select the seat
		driver.findElement(By.id("CL.CLUB|I:11")).click();
		
		//click on proceed button
		driver.findElement(By.xpath("//button[@class='sc-dJkDXt bWYhCG btn-proceeded']")).click();
		
		//print the seat num from booking summary
		String seat=driver.findElement(By.xpath("//div[@class='seat-number']")).getText();
		System.out.println("your seat number is : "+seat);
				
		//print the grandtotal from the booking summary
		String total=driver.findElement(By.xpath("//div[@class='all-grand']")).getText();
		System.out.println(total);
				
		//click continue
		driver.findElement(By.xpath("//button[@class='fb-added-btndesk']")).click();
		
		//verify mobnum and click on i'm not a robot
		//driver.findElement(By.id("mobileInput")).sendKeys("7904627594");
		//close the pop up
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		
		//get title of the page
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
		
	}
}
