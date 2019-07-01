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

        webDriver.get("https://www.sigma.fr/");

        String actualTitle = webDriver.getTitle();

        assertThat(actualTitle, is("Edition de logiciels, Infogérance, Solutions digitales | Sigma"));

        Thread.sleep(2000);

        webDriver.findElement(By.xpath("//li/a[text()='Contact'][1]")).click();

        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        WebElement Element = webDriver.findElement(By.name("153941_55395pi_153941_55395"));
        js.executeScript("arguments[0].scrollIntoView();", Element);

        Thread.sleep(1000);

        Element.sendKeys("Tutti !");

        webDriver.close();
    }

    @Test
    public void firefoxTest() throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities =  DesiredCapabilities.firefox();
 
		WebDriver webDriver = new RemoteWebDriver(new URL("http://zalenium:4445/wd/hub/"), capabilities);

        webDriver.get("https://www.sigma.fr/");

        String actualTitle = webDriver.getTitle();

        assertThat(actualTitle, is("Edition de logiciels, Infogérance, Solutions digitales | Sigma"));

        Thread.sleep(2000);

        webDriver.findElement(By.xpath("//li/a[text()='Contact'][1]")).click();

        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        WebElement Element = webDriver.findElement(By.name("153941_55395pi_153941_55395"));
        js.executeScript("arguments[0].scrollIntoView();", Element);

        Thread.sleep(1000);

        Element.sendKeys("Tutti !");

        webDriver.close();
    }

 
}