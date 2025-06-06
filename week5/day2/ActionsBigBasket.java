package week5.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsBigBasket {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//launch a browser
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("guest");
		//ChromeDriver driver=new ChromeDriver(options)
		EdgeDriver driver=new EdgeDriver();
		
		//load the URL
		driver.get("https://www.bigbasket.com/");
		
		//maximize the screen
		driver.manage().window().maximize();
		
		driver.navigate();
		
		//add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//click on shop by category
		driver.findElement(By.xpath("(//div[@class='relative h-full'])[4]/button")).click();
		
		//hover on foodgrains, oil & masala
		WebElement hover=driver.findElement(By.linkText("Foodgrains, Oil & Masala"));
		
		//instantiate action for hovering 
		Actions act=new Actions(driver);
		act.moveToElement(hover).perform();
		
		//hover rice and rice products
		WebElement hoverAgain=driver.findElement(By.linkText("Rice & Rice Products"));
		act.moveToElement(hoverAgain).perform();
		
		//click on boiled and steamed rice
		WebElement riceProd=driver.findElement(By.linkText("Boiled & Steam Rice"));
		act.click(riceProd).perform();
		
		
		// Filter the results by selecting the brand "bb Royal" using explicit wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(25));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement brand=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("i-bbRoyal")));
		
		//scroll the element using javascript
		js.executeScript("arguments[0].scrollIntoView(true);", brand);
		
		//optional wait
		wait.until(ExpectedConditions.elementToBeClickable(brand));
		brand.click();
		
				
		// Click on "Tamil Ponni Boiled Rice"
		WebElement rice=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Tamil Ponni Boiled Rice']")));
		js.executeScript("arguments[0].click();", rice);
		wait.until(ExpectedConditions.elementToBeClickable(rice));
		
		//to handle the window set is used
		Set<String> newWind=driver.getWindowHandles();
		
		//to handle the child window convert set to list
		List<String> childWindow=new ArrayList<String>(newWind);
		
		//switch to child window
		driver.switchTo().window(childWindow.get(1));
		
		//select the 5kg bag
		driver.findElement(By.xpath("(//div[@class='w-40 xl:w-52'])[1]")).click();
		 
		//Check and note the price of the rice
		String price=driver.findElement(By.xpath("//table//td[@class='Description___StyledTd-sc-82a36a-4 fLZywG']")).getText();
		System.out.println("The price of the Rice is : "+price);
		
		//add to the basket
		driver.findElement(By.xpath("(//button[text()='Add to basket'])[1]")).click();
		
		//verify the items added popup
		WebElement toastMsg=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='An item has been added to your basket successfully']")));
		
		String popUpMsg=toastMsg.getText();
		String actualMsg="An item has been added to your basket successfully";
		
		if (popUpMsg.equals(actualMsg)) {
			System.out.println(popUpMsg);
			System.out.println("the msg is as expected..thanks for shopping...visit again...");
		} else {

			System.out.println("The message popped is : "+popUpMsg);
			System.out.println("Actual message should be popped is : "+actualMsg);
		}
		
		//take snapshot
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snap/bigbasket.png");
		FileUtils.copyFile(src, dest);
		

		driver.close();
	}

}
