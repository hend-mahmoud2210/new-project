package accountPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverViewPage {

    private WebDriver driver;


    public OverViewPage(WebDriver driver){
        this.driver= driver;
    }

    private static By openNewAccountLink = By.xpath("//a[@href=\"/parabank/openaccount.htm\"]");

    private  By transferFundsLink = By.xpath("//a[@href=\"/parabank/transfer.htm\"]");

    private  By billPayLink = By.xpath("//a[@href=\"/parabank/billpay.htm\"]");
    public static By getOpenNewAccountLink() {
        return openNewAccountLink;
    }

    public OpenAccountPage clickOnOpenNewAccount(){
        driver.findElement(openNewAccountLink).click();
        return new OpenAccountPage(driver);
    }

    public TransferFundsPage clickOnTranfsrFunds(){
        driver.findElement(transferFundsLink).click();
        return new TransferFundsPage(driver);
    }
    public BillPayPage clickOnBillPay(){
        driver.findElement(billPayLink).click();
        return new BillPayPage(driver);
    }





}


