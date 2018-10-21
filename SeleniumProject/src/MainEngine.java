import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainEngine {
		
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver driver=new ChromeDriver();
		//Application1 application=new Application1();
		//application.launchGoogle();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//application.getURL("http://newtours.demoaut.com/");
		//System.out.println("launched");
		//application.linkRegistration("registration form");

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Balanarasimha\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://in.linkedin.com/");
		// Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='reg-firstname']")).sendKeys("balu2732@gmail.com");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id='login-password']")).sendKeys("boddu1235");
		// Thread.sleep(1000);
		driver.quit();
	}

}
