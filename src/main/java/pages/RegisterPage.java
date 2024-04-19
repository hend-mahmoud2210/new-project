package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    private WebDriver driver;
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    private By FirstName = By.id("customer.firstName");

    private By LastName= By.id("customer.lastName");

    private By Address = By.id("customer.address.street");
    private By City = By.id("customer.address.city");
    private By State = By.id("customer.address.state");
    private By ZipCode = By.id("customer.address.zipCode");
    private By Phone = By.id("customer.phoneNumber");
    private By SSN = By.id("customer.ssn");
    private By Username = By.id("customer.username");
    private By Password = By.id("customer.password");
    private By Confirm = By.id("repeatedPassword");
    private By Register = By.className("button");

    private static By title = By.xpath("//h1[@class=\"title\"]");


    public SignInPage validRegister(String firstname , String lastname , String address ,String city ,String state, String zipcpde , String phone , String ssn , String username , String pw){
        driver.findElement(FirstName).sendKeys(firstname);
        driver.findElement(LastName).sendKeys(lastname);
        driver.findElement(Address).sendKeys(address);
        driver.findElement(City).sendKeys(city);
        driver.findElement(State).sendKeys(state);
        driver.findElement(ZipCode).sendKeys(zipcpde);
        driver.findElement(Phone).sendKeys(phone);
        driver.findElement(SSN).sendKeys(ssn);
        driver.findElement(Username).sendKeys(username);
        driver.findElement(Password).sendKeys(pw);
        driver.findElement(Confirm).sendKeys(pw);
        driver.findElement(Register).click();
        return new SignInPage(driver);
    }

    public static By getTitle(){
        return title;

    }





}
