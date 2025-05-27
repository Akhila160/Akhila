package AddingProducts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zara_coat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Finish");
		System.out.println("Finish");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("akhilabarbie1@gmail.com");
		driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys("Akhila@123");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		
	List<WebElement> pro=	driver.findElements(By.xpath("//h5"));
	int count=pro.size();
	System.out.println(count);
	for(WebElement element:pro) {
		String proname=element.getText();
		
		
		
	if(proname.equals("ZARA COAT 3")){
		System.out.println(proname);		
		}
	
	}
	
	
	
	
	}

}
