package stepdefinitions;

import com.codeborne.selenide.Configuration;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.CHROME;
import static com.codeborne.selenide.WebDriverRunner.FIREFOX;


public class Hooks {
    @Before
    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver","/home/olga/Downloads/chromedriver");
        Configuration.browser="chrome";
    }

    @Before
    public void openHomePage(){
        open("https://www.phptravels.net/");
    }

    @After
    public void closeBrowser(){
        close();
    }
}
