import accountPages.OpenAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignInPage;

public class TestPayBill extends BaseTest{

    @Test
    public void testPayBill(){
        new SignInPage(driver)
                .signIn("hola" , "1234")
                .clickOnBillPay()
                .payBill("Hend", "skr" , "Maadi" , "Cairo" , "1234" , "12345", "123457", "123457", "500");
        boolean IsHeaderDisplayed = driver.findElement(OpenAccountPage.getHeader()).isDisplayed();
        Assert.assertTrue(IsHeaderDisplayed);

    }
}
