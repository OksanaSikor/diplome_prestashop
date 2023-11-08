package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import service.HomePageService;
import service.RegistrationPageService;

public class HomePageTest extends BaseTest {
    @Test(description="Checking the transition to the registration and login form")
    public void checkTheTransitionToTheRegistrationAndLoginFormTest() throws InterruptedException {
        HomePageService homePageService = new HomePageService();
        homePageService.goAddSingIn();
        RegistrationPageService registrationPageService = new RegistrationPageService();

        String actualTextOfMainPageSection =registrationPageService.getActualNameOfPageSection();
        String expectedTextOfMainPageSection = "AUTHENTICATION";
        Assert.assertEquals(actualTextOfMainPageSection, expectedTextOfMainPageSection, "The page did not open");
    }

    @Test(description="Переход в раздел Скидки")
    public void checkGoToTheDiscountsSectionTest() throws InterruptedException {
        HomePageService homePageService = new HomePageService();
        homePageService.goToTheDiscountsSection();

        String actualTextOfMainPageSection = homePageService.getActualNameOfPageSection();
        String expectedTextOfMainPageSection = "PRICE DROP";
        Assert.assertEquals(actualTextOfMainPageSection, expectedTextOfMainPageSection, "The page did not open");
    }

    @Test(description="Переход в раздел Новые товары")
    public void checkGoToTheNewProductsSectionTest() throws InterruptedException {
        HomePageService homePageService = new HomePageService();
        homePageService.goToTheNewProductsSection();

        String actualTextOfMainPageSection = homePageService.getActualNameOfPageSection();
        String expectedTextOfMainPageSection = "NEW PRODUCTS";
        Assert.assertEquals(actualTextOfMainPageSection, expectedTextOfMainPageSection, "The page did not open");
    }

    @Test(description="Переход в раздел Популярные товары")
    public void checkGoToThePopularProductsSectionTest() throws InterruptedException {
        HomePageService homePageService = new HomePageService();
        homePageService.goToThePopularProductsSection();

        String actualTextOfMainPageSection = homePageService.getActualNameOfPageSection();
        String expectedTextOfMainPageSection = "TOP SELLERS";
        Assert.assertEquals(actualTextOfMainPageSection, expectedTextOfMainPageSection, "The page did not open");
    }

    @Test(description="Переход в раздел Наши магазины")
    public void checkGoToTheOurStoresSectionTest() throws InterruptedException {
        HomePageService homePageService = new HomePageService();
        homePageService.goToTheOurStoresSection();

        String actualTextOfMainPageSection = homePageService.getActualNameOfPageOurStoresSection();
        String expectedTextOfMainPageSection = "OUR STORES";
        Assert.assertEquals(actualTextOfMainPageSection, expectedTextOfMainPageSection, "The page did not open");
    }

    @Test(description="Переход в раздел Свяжитесь с нами")
    public void checkGoToTheContactUsSectionTest() throws InterruptedException {
        HomePageService homePageService = new HomePageService();
        homePageService.goToTheContactUsSection();

        String actualTextOfMainPageSection = homePageService.getActualNameOfPageContactUsSection();
        String expectedTextOfMainPageSection = "CUSTOMER SERVICE - CONTACT US";
        Assert.assertEquals(actualTextOfMainPageSection, expectedTextOfMainPageSection, "The page did not open");
    }

    @Test(description="Переход в раздел Site Map")
    public void checkGoToTheDressesSectionTest() throws InterruptedException {
        HomePageService homePageService = new HomePageService();
        homePageService.goToTheDressesSection();

        String actualTextOfMainPageSection = homePageService.getActualNameOfPageSiteMapSection();
        String expectedTextOfMainPageSection = "SITEMAP";
        Assert.assertEquals(actualTextOfMainPageSection, expectedTextOfMainPageSection, "The page did not open");
    }
}
