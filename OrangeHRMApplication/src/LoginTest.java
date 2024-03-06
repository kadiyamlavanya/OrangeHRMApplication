import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {



	public static void main(String[] args) {
		
		
		ChromeDriver chromeBrowser;
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\OrangeHRMApplication\\OrangeHRMApplication\\Libraries\\drivers\\chromedriver.exe");
		chromeBrowser = new ChromeDriver();
		chromeBrowser.get(applicationUrlAddress);


		chromeBrowser.findElement(By.id("txtUsername")).sendKeys("srini");

		// Password Properties
		// <input name="txtPassword"  autocomplete="off" type="password">

		chromeBrowser.findElement(By.name("txtPassword")).sendKeys("Q@Trainer7");

		// LogIn Button Properties
		// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">

		chromeBrowser.findElement(By.className("button")).click();

		// Validating the OrangeHRM Application Home Page
		// Expected Title should be - "OrangeHRM"


		chromeBrowser.close();

		
		// TODO Auto-generated method stub

	}

}
