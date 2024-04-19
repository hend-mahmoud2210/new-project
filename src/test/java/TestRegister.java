import org.testng.Assert;
import org.testng.annotations.Test;
import accountPages.OverViewPage;
import pages.LandingPage;
import accountPages.OpenAccountPage;
import pages.RegisterPage;
import pages.SignInPage;

public class TestRegister extends BaseTest {

//    String firstname = "hend";
//    String username = "hoho";
//    String password = "12345";
//
//    String generatedFirstName = firstname + System.currentTimeMillis();
//    String generatedUserName = username + System.currentTimeMillis();

    @Test
    public void testValidRegister(){
        new LandingPage(driver)
                .clickOnRegister()
                .validRegister("Hend" , "Mahmoud", "Skr", "Maadi","Cairo", "1234","123456789", "123", "Hendita","Hend1234@");
        boolean titleIsDisplayed = driver.findElement(RegisterPage.getTitle()).isDisplayed();
        Assert.assertTrue(titleIsDisplayed);

    }

    @Test
    public void testLogin(){
        new LandingPage(driver)
                .clickOnRegister()
                .validRegister("Hendoo" , "Mahm", "Skrr", "Maadii","Cairoo", "12345","123456789", "123", "Henda","Hend1234@")
                .signIn("Henditaa","Hend12345@");
        boolean isOpenNewAccountIsDisplayed = driver.findElement(OverViewPage.getOpenNewAccountLink()).isDisplayed();
        Assert.assertTrue(isOpenNewAccountIsDisplayed);
    }




}
