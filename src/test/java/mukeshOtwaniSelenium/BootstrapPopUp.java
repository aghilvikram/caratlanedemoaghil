package mukeshOtwaniSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapPopUp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("http://seleniumpractise.blogspot.in/2016/11/handle-bootstrap-model-dialog-in.html");
		WebElement bootstrapLink = driver.findElement(By.xpath("(//*[contains(text(),'Click here to Login')])[1]"));
		bootstrapLink.click();
		driver.findElement(By.xpath("//div[@class='modal-body']/p/following-sibling::input[1]")).sendKeys("vikram");
		driver.findElement(By.xpath("//div[@class='modal-body']/p/following-sibling::input[2]")).sendKeys("password");
		driver.findElement(By.xpath("//input[contains(@value,'login')]")).click();

	}

}
