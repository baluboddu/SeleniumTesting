import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Application1 {
	WebDriver webDriver;

	public void launchGoogle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Balanarasimha\\Desktop\\chromedriver.exe");
		webDriver = new ChromeDriver();
		//webDriver.manage().timeouts().implicitlyWait(10000000, TimeUnit.SECONDS);
		System.out.println("waited");
	}

	public void getURL(String path) {
		webDriver.get(path);
	}

	/*public void linkRegistration(String ele) {
		webDriver.findElement(By.linkText(ele));
	}*/

}
