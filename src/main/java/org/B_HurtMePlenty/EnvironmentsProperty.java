package org.B_HurtMePlenty;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class EnvironmentsProperty
{
    static WebDriver driver;
    public static WebDriver setupBrowser(String browser, String link)
    {
        if (browser.equalsIgnoreCase("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("edge"))
        {
            WebDriverManager.edgedriver().setup();
            driver=new SafariDriver();
        }
        driver.get(link);
        driver.manage().window().maximize();
        return driver;
    }
}
