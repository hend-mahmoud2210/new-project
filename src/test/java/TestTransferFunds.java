import accountPages.BillPayPage;
import accountPages.OpenAccountPage;
import accountPages.TransferFundsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignInPage;

public class TestTransferFunds extends BaseTest {

    @Test
    public void testTransferFunds() {
        new SignInPage(driver)
                .signIn("hello", "12345")
                .clickOnTranfsrFunds()
                .transferFunds("500");
        boolean IsHeaderDisplayed = driver.findElement(BillPayPage.getHeader()).isDisplayed();
        Assert.assertTrue(IsHeaderDisplayed);

    }
}
