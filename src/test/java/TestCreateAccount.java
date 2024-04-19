import accountPages.OpenAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignInPage;

public class TestCreateAccount extends BaseTest {

    @Test
    public void testCreateAccount() {
        new SignInPage(driver)
                .signIn("hola", "1234")
                .clickOnOpenNewAccount()
                .openNewAccount();
        boolean IsHeaderDisplayed = driver.findElement(OpenAccountPage.getHeader()).isDisplayed();
        Assert.assertTrue(IsHeaderDisplayed);

    }
}
