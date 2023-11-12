package test;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import service.CardPageService;
import service.HomePageService;
import utils.Retry;

public class CardPageTest extends BaseTest {

    @Test(description="Checking go to cart", retryAnalyzer = Retry.class)
    @Description("Checking go to cart")
    public void checkGoToCartTest() throws InterruptedException {
        HomePageService homePageService = new HomePageService();
        homePageService.clickTheCard();
        CardPageService cardPageService = new CardPageService();

        String actualTextOfMainPageSection =cardPageService.getActualNameOfCardPageSection();
        String expectedTextOfMainPageSection = "SHOPPING-CART SUMMARY";
        Assert.assertEquals(actualTextOfMainPageSection, expectedTextOfMainPageSection, "The page did not open");
    }

    @Test(description="Check the transition from the cart to the main page", retryAnalyzer = Retry.class)
    @Description("Check the transition from the cart to the main page")
    public void checkGoToCartBackTest() throws InterruptedException {
        HomePageService homePageService = new HomePageService();
        homePageService.clickTheCard();
        CardPageService cardPageService = new CardPageService();

        cardPageService.navigateOfBackToMainPage();
        String actualTextOfMainPageSection =homePageService.getActualNameOfMainPageSection();
        String expectedTextOfMainPageSection = "WOMEN";
        Assert.assertEquals(actualTextOfMainPageSection, expectedTextOfMainPageSection, "The page did not open");
    }
}
