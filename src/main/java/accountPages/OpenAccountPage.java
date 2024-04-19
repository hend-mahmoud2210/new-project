package accountPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OpenAccountPage {
    private WebDriver driver;

    public OpenAccountPage(WebDriver driver){
        this.driver= driver;
    }
    private  By checkingDropDown = By.xpath("//select[@id=\"type\"]");

    private By depositAmountDropDown = By.xpath("//select[@id=\"fromAccountId\"]");
    private  By openNewAccountBtn = By.xpath("//input[@value =\"Open New Account\"]");

    private static By header = By.xpath("//h1[@class=\"title\"]");

public OpenAccountPage openNewAccount() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.visibilityOfElementLocated(checkingDropDown));
    wait.until(ExpectedConditions.visibilityOfElementLocated(depositAmountDropDown));
    driver.findElement(openNewAccountBtn).click();
    return this;
}
public static By getHeader(){
    return header;
    }
}