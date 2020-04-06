package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");
    // esto es un campo y representa el link

    //constructor que necesita un driver para instanciar la clase y poder interactuar con la pagina web
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    // es un metodo que hara click en el link anterior y devuelve un objeto del tipo loginpage
    //ya que al hacer clic se abrira una nueva pagina.
    public LoginPage clickFormAuthentication(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
        //retorna el controlador de la pagina abierta para seguir interactuando con ella
    }
}
