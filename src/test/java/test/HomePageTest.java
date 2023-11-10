package test;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import service.CardPageService;
import service.HomePageService;
import service.RegistrationPageService;
import utils.Retry;

public class HomePageTest extends BaseTest {

    @Test(description="Checking the transition to the registration and login form", retryAnalyzer = Retry.class)
    @Description("Checking the transition to the registration and login form")
    public void checkTheTransitionToTheRegistrationAndLoginFormTest() throws InterruptedException {
        HomePageService homePageService = new HomePageService();
        homePageService.goAddSingIn();
        RegistrationPageService registrationPageService = new RegistrationPageService();

        String actualTextOfMainPageSection =registrationPageService.getActualNameOfPageSection();
        String expectedTextOfMainPageSection = "CREATE AN ACCOUNT";
        Assert.assertEquals(actualTextOfMainPageSection, expectedTextOfMainPageSection, "The page did not open");
    }

    @Test(description="Checking the search field")
    @Description("Checking the search field")
    public void checkTheSearchFieldTest() throws InterruptedException {
        HomePageService homePageService = new HomePageService();
        homePageService.clickTheSearchField();

        String actualTextOfMainPageSection =homePageService.getActualSearchResults();
        String expectedTextOfMainPageSection = "\"DRESS\"";
        Assert.assertEquals(actualTextOfMainPageSection, expectedTextOfMainPageSection, "The page did not open");
    }

    @Test(description="Checking go to cart")
    @Description("Checking go to cart")
    public void checkGoToCartTest() throws InterruptedException {
        HomePageService homePageService = new HomePageService();
        homePageService.clickTheCard();
        CardPageService cardPageService = new CardPageService();

        String actualTextOfMainPageSection =cardPageService.getActualNameOfCardPageSection();
        String expectedTextOfMainPageSection = "SHOPPING-CART SUMMARY";
        Assert.assertEquals(actualTextOfMainPageSection, expectedTextOfMainPageSection, "The page did not open");
    }

    @Test(description="Checking go to the discounts section")
    @Description("Checking go to the discounts section")
    public void checkGoToTheDiscountsSectionTest() throws InterruptedException {
        HomePageService homePageService = new HomePageService();
        homePageService.goToTheDiscountsSection();

        String actualTextOfMainPageSection = homePageService.getActualNameOfPageSection();
        String expectedTextOfMainPageSection = "PRICE DROP";
        Assert.assertEquals(actualTextOfMainPageSection, expectedTextOfMainPageSection, "The page did not open");
    }

    @Test(description="Checking go to the new products section")
    @Description("Checking go to the new products section")
    public void checkGoToTheNewProductsSectionTest() throws InterruptedException {
        HomePageService homePageService = new HomePageService();
        homePageService.goToTheNewProductsSection();

        String actualTextOfMainPageSection = homePageService.getActualNameOfPageSection();
        String expectedTextOfMainPageSection = "NEW PRODUCTS";
        Assert.assertEquals(actualTextOfMainPageSection, expectedTextOfMainPageSection, "The page did not open");
    }

    @Test(description="Checking go to the popular products section")
    @Description("Checking go to the popular products section")
    public void checkGoToThePopularProductsSectionTest() throws InterruptedException {
        HomePageService homePageService = new HomePageService();
        homePageService.goToThePopularProductsSection();

        String actualTextOfMainPageSection = homePageService.getActualNameOfPageSection();
        String expectedTextOfMainPageSection = "TOP SELLERS";
        Assert.assertEquals(actualTextOfMainPageSection, expectedTextOfMainPageSection, "The page did not open");
    }

    @Test(description="Checking go to the our stores section")
    @Description("Checking go to the our stores section")
    public void checkGoToTheOurStoresSectionTest() throws InterruptedException {
        HomePageService homePageService = new HomePageService();
        homePageService.goToTheOurStoresSection();

        String actualTextOfMainPageSection = homePageService.getActualNameOfPageOurStoresSection();
        String expectedTextOfMainPageSection = "OUR STORES";
        Assert.assertEquals(actualTextOfMainPageSection, expectedTextOfMainPageSection, "The page did not open");
    }

    @Test(description="Checking go to the contact us section")
    @Description("Checking go to the contact us section")
    public void checkGoToTheContactUsSectionTest() throws InterruptedException {
        HomePageService homePageService = new HomePageService();
        homePageService.goToTheContactUsSection();

        String actualTextOfMainPageSection = homePageService.getActualNameOfPageContactUsSection();
        String expectedTextOfMainPageSection = "CUSTOMER SERVICE - CONTACT US";
        Assert.assertEquals(actualTextOfMainPageSection, expectedTextOfMainPageSection, "The page did not open");
    }

    @Test(description="Checking go to the site map section")
    @Description("Checking go to the site map section")
    public void checkGoToTheSiteMapSectionTest() throws InterruptedException {
        HomePageService homePageService = new HomePageService();
        homePageService.goToTheSiteMapSection();

        String actualTextOfMainPageSection = homePageService.getActualNameOfPageSiteMapSection();
        String expectedTextOfMainPageSection = "SITEMAP";
        Assert.assertEquals(actualTextOfMainPageSection, expectedTextOfMainPageSection, "The page did not open");
    }

    @Test(description="Check the transition from the cart to the main page") //Корзина возврат на главную
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
