package caratlane.testScripts;
import org.apache.hc.client5.http.utils.Base64;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base64class {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		String password="admin123";
		byte[] pass = Base64.encodeBase64(password.getBytes());
		System.out.println(new String(pass));
		byte[] passdecode = Base64.decodeBase64(pass);
		System.out.println(new String(passdecode));
	}

}
