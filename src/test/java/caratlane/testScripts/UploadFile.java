package caratlane.testScripts;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFile {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download");
		//driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\vikra\\OneDrive\\Desktop\\file.json");
		WebElement ele=driver.findElement(By.id("uploadFile"));
		//ele.click();
		
		Actions actions=new Actions(driver);
		actions.moveToElement(ele).click().perform();
		
		Robot rb=new Robot();
		rb.delay(3000);
		StringSelection ss=new StringSelection("C:\\Users\\vikra\\OneDrive\\Desktop\\file.json");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
