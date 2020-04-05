package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {

    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement inputElement = driver.findElement(By.linkText("Inputs"));
        inputElement.click();

        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

        driver.quit();

    }


    public static void main(String args[]){
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
