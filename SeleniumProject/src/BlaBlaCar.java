import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.file.FileReader;

/**
 * 
 */

/**
 * @author Balanarasimha
 *
 */
public class BlaBlaCar {

	WebDriver driver;

	public void Login() {
		File file = new File("");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Balanarasimha\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("");

	}

	public void switchOne(int[] a) {

		for (int i = 0; i <= a.length; i++) {
			if(i%2==0){
				switch(i){
				case 2:
					System.out.println("two");
				}
			}

		}
	}

}
