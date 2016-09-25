package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OpenGoogle {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://google.com");
	  driver.findElement(By.id("lst-ib")).sendKeys("Jobs");
	  Thread.sleep(5000);
	  driver.close();
  }
}
