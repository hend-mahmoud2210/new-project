package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

    private WebDriver driver;
    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    private By registerBtn = By.linkText("Register");

    private By login = By.xpath("//*[contains(text(), \"about\")]");
    private By userNameInput = By.xpath("//input[@name=\"username\"]");
    private By passwordInput  = By.xpath("//input[@name=\"password\"]");
    private By logInBtn = By.xpath("//input[@value=\"Log In\"]");


    //Actions on elements
    public RegisterPage clickOnRegister(){
        driver.findElement(registerBtn).click();
        return new RegisterPage(driver);
    }
//    public AccountOverViewPage signIn(String username, String password){
//        driver.findElement(userNameInput).sendKeys(username);
//        driver.findElement(passwordInput).sendKeys(password);
//        driver.findElement(logInBtn).click();
//        return new AccountOverViewPage(driver);
//    }



}



