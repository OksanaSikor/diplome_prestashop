package test;

import model.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import service.HomePageService;
import service.RegistrationPageService;

public class RegistrationPageTest extends BaseTest {
    @Test(description="Navigate of back to main page")
    public void checkReturnToHomePageTest() {
        HomePageService homePageService = new HomePageService();
        homePageService.goAddSingIn();
        RegistrationPageService registrationPageService = new RegistrationPageService();
        registrationPageService.navigateOfBackToMainPage();

        String actualTextOfMainPageSection = homePageService.getActualNameOfMainPageSection();
        String expectedTextOfMainPageSection = "WOMEN";
        Assert.assertEquals(actualTextOfMainPageSection, expectedTextOfMainPageSection, "The page did not open");
    }

    @Test(description="Checking go to registration form")
    public void checkTGoToRegistrationFormTest() throws InterruptedException {
        HomePageService homePageService = new HomePageService();
        homePageService.goAddSingIn();
        RegistrationPageService registrationPageService = new RegistrationPageService();

        registrationPageService.createAnAccount(new User());
        String actualTextOfMainPageSection = registrationPageService.getActualPersonalInformationBlock();
        String expectedTextOfMainPageSection = "CREATE AN ACCOUNT";
        Assert.assertEquals(actualTextOfMainPageSection, expectedTextOfMainPageSection, "The page did not open");
    }

}
