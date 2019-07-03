package com.example.javamavenjunithelloworld;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
 
public class SeleniumTestIT {
    
    @Test
    public void chromeTest() throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities =  DesiredCapabilities.chrome();
 
		WebDriver webDriver = new RemoteWebDriver(new URL("http://zalenium:4445/wd/hub/"), capabilities);
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
        webDriver.manage().window().maximize();

        webDriver.get("https://www.sigma.fr/");

        String actualTitle = webDriver.getTitle();

        assertThat(actualTitle, is("Edition de logiciels, Infogérance, Solutions digitales | Sigma"));

        Thread.sleep(5000);

        webDriver.findElement(By.id("tarteaucitronPersonalize")).click();

        js.executeScript("window.scrollTo(0,112)");
        webDriver.findElement(By.cssSelector("#sticky-nav-clone .panelBkg-darkblue > a")).click();
        js.executeScript("window.scrollTo(0,134)");
        js.executeScript("window.scrollTo(0,383)");
        webDriver.switchTo().frame(0);
        webDriver.findElement(By.id("153941_55395pi_153941_55395")).click();
        webDriver.findElement(By.id("153941_55395pi_153941_55395")).sendKeys("Tutti ! \n");
        webDriver.findElement(By.id("153941_55393pi_153941_55393_640653")).click();

        webDriver.close();

    }

    @Test
    public void firefoxTest() throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities =  DesiredCapabilities.firefox();
 
		WebDriver webDriver = new RemoteWebDriver(new URL("http://zalenium:4445/wd/hub/"), capabilities);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        webDriver.manage().window().maximize();

        webDriver.get("https://www.sigma.fr/");

        String actualTitle = webDriver.getTitle();

        assertThat(actualTitle, is("Edition de logiciels, Infogérance, Solutions digitales | Sigma"));

        Thread.sleep(5000);

        webDriver.findElement(By.id("tarteaucitronPersonalize")).click();

        js.executeScript("window.scrollTo(0,112)");
        webDriver.findElement(By.cssSelector("#sticky-nav-clone .panelBkg-darkblue > a")).click();
        js.executeScript("window.scrollTo(0,134)");
        js.executeScript("window.scrollTo(0,383)");
        webDriver.switchTo().frame(0);
        webDriver.findElement(By.id("153941_55395pi_153941_55395")).click();
        webDriver.findElement(By.id("153941_55395pi_153941_55395")).sendKeys("Tutti ! \n");
        webDriver.findElement(By.id("153941_55393pi_153941_55393_640653")).click();

        webDriver.close();
    }

 
}