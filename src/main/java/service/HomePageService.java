package service;

import io.qameta.allure.Step;
import page.HomePage;

public class HomePageService {

    private static final String HOME_PAGE_URL = "http://prestashop.qatestlab.com.ua/ru/";

    private HomePage homePage = new HomePage();

    @Step("Getting the actual title of the home page section")
    public String getActualNameOfMainPageSection(){
        return homePage.getTextOfMainPageSection();
    }

    @Step("Click the Sing In button")
    public RegistrationPageService goAddSingIn() {
        homePage.openPage(HOME_PAGE_URL)
                .clickLogin();
        return new RegistrationPageService();
    }

    @Step("Click the Discounts In link")
    public HomePageService goToTheDiscountsSection() {
        homePage.openPage(HOME_PAGE_URL)
                .clickOnTheLinkDiscounts();
        return new HomePageService();
    }

    @Step("Getting the actual title of the page")
    public String getActualNameOfPageSection(){
        return homePage.getTextOfPageSection();
    }

    @Step("Click the New Products In link")
    public HomePageService goToTheNewProductsSection() {
        homePage.openPage(HOME_PAGE_URL)
                .clickOnTheLinkNewProducts();
        return new HomePageService();
    }

    @Step("Click the Popular Products In link")
    public HomePageService goToThePopularProductsSection() {
        homePage.openPage(HOME_PAGE_URL)
                .clickOnTheLinkPopularProducts();
        return new HomePageService();
    }

    @Step("Click the Our Stores In link")
    public HomePageService goToTheOurStoresSection() {
        homePage.openPage(HOME_PAGE_URL)
                .clickOnTheLinkOurStores();
        return new HomePageService();
    }

    @Step("Getting the actual title of the page Our Stores")
    public String getActualNameOfPageOurStoresSection(){
        return homePage.getTextOfPageOurStoresSection();
    }

    @Step("Click the Our Stores In link")
    public HomePageService goToTheContactUsSection() {
        homePage.openPage(HOME_PAGE_URL)
                .clickOnTheLinkContactUs();
        return new HomePageService();
    }

    @Step("Getting the actual title of the page Contact Us")
    public String getActualNameOfPageContactUsSection(){
        return homePage.getTextOfPageContactUsSection();
    }

    @Step("Click the Site Map Section")
    public HomePageService goToTheSiteMapSection() {
        homePage.openPage(HOME_PAGE_URL)
                .clickOnTheLinkSiteMapSection();
        return new HomePageService();
    }

    @Step("Getting the actual title of the page Site Map")
    public String getActualNameOfPageSiteMapSection(){
        return homePage.getTextOfPageSiteMapSection();
    }
}
