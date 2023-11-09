package test;

import model.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import service.CreateAnAccountPageService;
import service.HomePageService;
import service.MyAccountPageService;
import service.RegistrationPageService;
import utils.Retry;

public class CreateAnAccountPageTest extends BaseTest {

    @Test(description="Checking the transition to the account creation page", retryAnalyzer = Retry.class)
    public void сheckTheTransitionToTheAccountCreationPageTest() throws InterruptedException {
        HomePageService homePageService = new HomePageService();
        homePageService.goAddSingIn();
        RegistrationPageService registrationPageService = new RegistrationPageService();

        registrationPageService.createAnAccount(new User());
        CreateAnAccountPageService createAnAccountPageService = new CreateAnAccountPageService();
        createAnAccountPageService.createAnAccount(new User());
        MyAccountPageService myAccountPageService = new MyAccountPageService();

        String actualTextOfMainPageSection = myAccountPageService.getActualNameOfPageSection();
        String expectedTextOfMainPageSection = "MY ACCOUNT";
        Assert.assertEquals(actualTextOfMainPageSection, expectedTextOfMainPageSection, "The page did not open");
    }
}
