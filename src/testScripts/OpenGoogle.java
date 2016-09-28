package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OpenGoogle {
	public static final String USERNAME = "atariq";
  public static final String ACCESS_KEY = "cd001cac-fd15-40fc-9925-566a691f4e06";
  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	
  @Test
  public void f() throws InterruptedException { DesiredCapabilities caps = DesiredCapabilities.safari();
	  caps.setCapability("platform", "OS X 10.9");
	  caps.setCapability("version", "7.0");
	  
    WebDriver driver = new RemoteWebDriver(new URL(URL), caps););
	  driver.get("http://google.com");
	  driver.findElement(By.id("lst-ib")).sendKeys("Jobs");
	  Thread.sleep(5000);
	  driver.close();
  }
}
