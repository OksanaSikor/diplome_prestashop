package service;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import page.HomePage;

@Log4j2
public class HomePageService {

    private static final String HOME_PAGE_URL = "http://prestashop.qatestlab.com.ua/ru/";

    private HomePage homePage = new HomePage();

    @Step("Getting the actual title of the home page section")
    public String getActualNameOfMainPageSection(){
        log.info("Getting the actual title of the home page section");
        return homePage.getTextOfMainPageSection();
    }

    @Step("Click the Sing In button")
    public RegistrationPageService goAddSingIn() {
        log.info("Click the Sing In button");
        homePage.openPage(HOME_PAGE_URL)
                .clickLogin();
        return new RegistrationPageService();
    }

    @Step("Click the Discounts In link")
    public HomePageService goToTheDiscountsSection() {
        log.info("Click the Discounts In link");
        homePage.openPage(HOME_PAGE_URL)
                .clickOnTheLinkDiscounts();
        return new HomePageService();
    }

    @Step("Getting the actual title of the page")
    public String getActualNameOfPageSection(){
        log.info("Getting the actual title of the page");
        return homePage.getTextOfPageSection();
    }

    @Step("Click the New Products In link")
    public HomePageService goToTheNewProductsSection() {
        log.info("Click the New Products In link");
        homePage.openPage(HOME_PAGE_URL)
                .clickOnTheLinkNewProducts();
        return new HomePageService();
    }

    @Step("Click the Popular Products In link")
    public HomePageService goToThePopularProductsSection() {
        log.info("Click the Popular Products In link");
        homePage.openPage(HOME_PAGE_URL)
                .clickOnTheLinkPopularProducts();
        return new HomePageService();
    }

    @Step("Click the Our Stores In link")
    public HomePageService goToTheOurStoresSection() {
        log.info("Click the Our Stores In link");
        homePage.openPage(HOME_PAGE_URL)
                .clickOnTheLinkOurStores();
        return new HomePageService();
    }

    @Step("Getting the actual title of the page Our Stores")
    public String getActualNameOfPageOurStoresSection(){
        log.info("Getting the actual title of the page Our Stores");
        return homePage.getTextOfPageOurStoresSection();
    }

    @Step("Click the Our Stores In link")
    public HomePageService goToTheContactUsSection() {
        log.info("Click the Our Stores In link");
        homePage.openPage(HOME_PAGE_URL)
                .clickOnTheLinkContactUs();
        return new HomePageService();
    }

    @Step("Getting the actual title of the page Contact Us")
    public String getActualNameOfPageContactUsSection(){
        log.info("Getting the actual title of the page Contact Us");
        return homePage.getTextOfPageContactUsSection();
    }

    @Step("Click the Site Map Section")
    public HomePageService goToTheSiteMapSection() {
        log.info("Click the Site Map Section");
        homePage.openPage(HOME_PAGE_URL)
                .clickOnTheLinkSiteMapSection();
        return new HomePageService();
    }

    @Step("Getting the actual title of the page Site Map")
    public String getActualNameOfPageSiteMapSection(){
        log.info("Getting the actual title of the page Site Map");
        return homePage.getTextOfPageSiteMapSection();
    }
}
