package test;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import service.HomePageService;
import service.RegistrationPageService;
import utils.Retry;

public class RegistrationPageTest extends BaseTest {

    @Test(description="Checking the transition to the registration and login form", retryAnalyzer = Retry.class)
    @Description("Checking the transition to the registration and login form")
    public void checkTheTransitionToTheRegistrationAndLoginFormTest() throws InterruptedException {
        HomePageService homePageService = new HomePageService();
        homePageService.goAddSingIn();
        RegistrationPageService registrationPageService = new RegistrationPageService();

        String actualTextOfMainPageSection =registrationPageService.getActualNameOfPageSection();
        String expectedTextOfMainPageSection = "AUTHENTICATION";
        Assert.assertEquals(actualTextOfMainPageSection, expectedTextOfMainPageSection, "The page did not open");
    }
}
