package accountPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BillPayPage {

    private WebDriver driver;

    public BillPayPage (WebDriver driver){
        this.driver=driver;
    }
    private By payeeNameInput = By.name("payee.name");
    private By addressinput = By.name("payee.address.street");
    private By cityinput = By.name("payee.address.city");
    private By stateinput = By.name("payee.address.state");
    private By zipcodeinput = By.name("payee.address.zipCode");
    private By phoneinput = By.name("payee.phoneNumber");
    private By accountNumberinput = By.name("payee.accountNumber");
    private By verifyAccountinput = By.name("verifyAccount");
    private By amountInput = By.name("amount");
    private By fromAccountDropDowninput = By.name("fromAccountId");
    private By sendPaymentBtninput = By.xpath("//input[@class=\"button\"]");

    private static By header = By.xpath("//span[@id=\"amount\"]");

    public void payBill(String payeeName , String address , String city, String state, String zipcode ,String phone,String accountNumber, String verifiedaccountNumber , String  amount){
        driver.findElement(payeeNameInput).sendKeys(payeeName);
        driver.findElement(addressinput).sendKeys(address);
        driver.findElement(cityinput).sendKeys(city);
        driver.findElement(stateinput).sendKeys(state);
        driver.findElement(zipcodeinput).sendKeys(zipcode);
        driver.findElement(phoneinput).sendKeys(phone);
        driver.findElement(accountNumberinput).sendKeys(accountNumber);
        driver.findElement(verifyAccountinput).sendKeys(accountNumber);
        driver.findElement(amountInput).sendKeys(amount);
        Select fromAccount = new Select(driver.findElement(fromAccountDropDowninput));
        fromAccount.selectByVisibleText("14898");
        driver.findElement(sendPaymentBtninput).click();
    }

    public static By getHeader(){
        return header;
    }

}

