package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.util.List;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homgePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        homgePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDouw(){
        driver.quit();
    }
}
