package accountPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TransferFundsPage {
    private WebDriver driver;

    public TransferFundsPage(WebDriver driver){
        this.driver=driver;
    }

    private By amountInput = By.id("amount");
    private By fromAccountSelect = By.id("fromAccountId");
    private By toAccountSelect = By.id("toAccountId");
    private By transferBtn = By.xpath("toAccountId");
    private static By header = By.xpath("//h1[@class=\"title\"]");

    public TransferFundsPage transferFunds(String amount){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(fromAccountSelect));
        wait.until(ExpectedConditions.visibilityOfElementLocated(toAccountSelect));
        driver.findElement(amountInput).sendKeys(amount);
        Select fromAccount = new Select(driver.findElement(By.id("fromAccountId")));
        fromAccount.selectByVisibleText("16785");
        Select toAccount = new Select(driver.findElement(By.id("toAccountId")));
        toAccount.selectByVisibleText("16785");
        driver.findElement(transferBtn).click();
        return this;
    }

    public static By getHeader(){
        return header;
    }

}
