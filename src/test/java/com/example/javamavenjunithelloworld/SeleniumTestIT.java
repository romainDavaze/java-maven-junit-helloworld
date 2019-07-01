import java.net.MalformedURLException;
import java.net.URL;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.junit.jupiter.api.Test;
 
public class SeleniumTestIT {
    
    @Test
    public void chromeTest() throws MalformedURLException {
		DesiredCapabilities capabilities =  DesiredCapabilities.chrome();
 
		WebDriver webDriver = new RemoteWebDriver(new URL("http://zalenium:4445/wd/hub/"), capabilities);

        webDriver.get("https://www.sigma.fr/");

        String actualTitle = driver.getTitle();

        assertThat(actualTitle, is("Edition de logiciels, Infogérance, Solutions digitales | Sigma"));

        driver.close();
    }

    @Test
    public void firefoxTest() throws MalformedURLException {
		DesiredCapabilities capabilities =  DesiredCapabilities.firefox();
 
		WebDriver webDriver = new RemoteWebDriver(new URL("http://zalenium:4445/wd/hub/"), capabilities);

        webDriver.get("https://www.sigma.fr/");

        String actualTitle = driver.getTitle();

        assertThat(actualTitle, is("Edition de logiciels, Infogérance, Solutions digitales | Sigma"));

        driver.close();
    }

 
}