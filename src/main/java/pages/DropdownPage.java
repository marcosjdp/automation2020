package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropdownPage {

    private WebDriver driver;
    private By dropdown = By.id("dropdown");

    private DropdownPage (WebDriver driver){
        this.driver = driver;
    }

    public void selectFromDropDown(String optioin){

    }

    public DropdownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }
}
