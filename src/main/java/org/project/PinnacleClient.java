package org.project;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.time.Duration;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PinnacleClient {
    protected WebDriver pDriver;
    protected WebDriverWait wait;

    public PinnacleClient(Browser browserType){
        switch(browserType) {
            case Browser.FIREFOX:
                this.pDriver = this.startFirefoxDriver();
            case Browser.CHROME:
            default:
                this.pDriver = this.startChromeDriver();
        }
    }

    public WebDriver getWebDriver(){
        return this.pDriver;
    }
    protected FirefoxDriver startFirefoxDriver() {
        options.setImplicitWaitTimeout(Duration.ofSeconds(5));
        return startFirefoxDriver(new FirefoxOptions());
    }

    protected FirefoxDriver startFirefoxDriver(FirefoxOptions options) {
        driver = new FirefoxDriver(options);
        return (FirefoxDriver) driver;
    }

    protected ChromeDriver startChromeDriver() {
        options.setImplicitWaitTimeout(Duration.ofSeconds(1));
        ChromeOptions options = new ChromeOptions();
        return startChromeDriver(options);
    }

    protected ChromeDriver startChromeDriver(ChromeOptions options) {
        driver = new ChromeDriver(options);
        return (ChromeDriver) driver;
    }

    public void closeBrowser(){
        this.pDriver.close();
    }

}
