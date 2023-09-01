package TestPK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class TCLogin {
public void login_Test()
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	

	
	
	Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	System.out.println(driver.getTitle());
	driver.close();
	
}
}
