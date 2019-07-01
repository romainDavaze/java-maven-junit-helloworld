import java.net.MalformedURLException;
import java.net.URL;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.junit.jupiter.api.Test;
 
public class SeleniumTestIT {
    
    @Test
    public void getTest() {
		DesiredCapabilities capabilities =  DesiredCapabilities.chrome();
 
		WebDriver webDriver = new RemoteWebDriver(new URL("http://zalenium:4445/wd/hub/"), capabilities);

        webDriver.get("https://huongdanjava.com/");
    }
 
}