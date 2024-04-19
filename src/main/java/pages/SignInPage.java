package pages;

import accountPages.OverViewPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {

    private WebDriver driver;

    public SignInPage(WebDriver driver){
        this.driver = driver;
    }
    private By login = By.xpath("//*[contains(text(), \"about\")]");
    private By userNameInput = By.xpath("//input[@name=\"username\"]");
    private By passwordInput  = By.xpath("//input[@name=\"password\"]");
    private By logInBtn = By.xpath("//input[@value=\"Log In\"]");


    public void clickOnLoginBtn(){
        driver.findElement(login).click();

    }
    public OverViewPage signIn(String username, String pw){
        driver.findElement(userNameInput).sendKeys(username);
        driver.findElement(passwordInput).sendKeys(pw);
        driver.findElement(logInBtn).click();
        return new OverViewPage(driver);
    }

}
