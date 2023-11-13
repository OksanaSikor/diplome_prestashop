package service;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import page.HomePage;

@Log4j2
public class HomePageService {

    private static final String HOME_PAGE_URL = "http://prestashop.qatestlab.com.ua/ru/";
    private static final String ACCOUNT_PAGE_URL = "http://prestashop.qatestlab.com.ua/ru/authentication?back=my-account";

    private HomePage homePage = new HomePage();

    @Step("Getting the actual title of the home page section")
    public String getActualNameOfMainPageSection(){
        log.info("Getting the actual title of the home page section");
        return homePage.getTextOfMainPageSection();
    }

    @Step("Click the Sing In button")
    public RegistrationPageService goAddSingIn() {
        log.info("Click the Sing In button");
        homePage.openPage(ACCOUNT_PAGE_URL);
        return new RegistrationPageService();
    }

    @Step("Click the Discounts In link")
    public void goToTheDiscountsSection() {
        log.info("Click the Discounts In link");
        homePage.openPage(HOME_PAGE_URL)
                .clickOnTheLinkDiscounts();
    }

    @Step("Getting the actual title of the page")
    public String getActualNameOfPageSection(){
        log.info("Getting the actual title of the page");
        return homePage.getTextOfPageSection();
    }

    @Step("Click the New Products In link")
    public void goToTheNewProductsSection() {
        log.info("Click the New Products In link");
        homePage.openPage(HOME_PAGE_URL)
                .clickOnTheLinkNewProducts();
    }

    @Step("Click the Popular Products In link")
    public void goToThePopularProductsSection() {
        log.info("Click the Popular Products In link");
        homePage.openPage(HOME_PAGE_URL)
                .clickOnTheLinkPopularProducts();
    }

    @Step("Click the Our Stores In link")
    public void goToTheOurStoresSection() {
        log.info("Click the Our Stores In link");
        homePage.openPage(HOME_PAGE_URL)
                .clickOnTheLinkOurStores();
    }

    @Step("Getting the actual title of the page Our Stores")
    public String getActualNameOfPageOurStoresSection(){
        log.info("Getting the actual title of the page Our Stores");
        return homePage.getTextOfPageOurStoresSection();
    }

    @Step("Click the Our Contact Us link")
    public void goToTheContactUsSection() {
        log.info("Click the Our Contact Us link");
        homePage.openPage(HOME_PAGE_URL)
                .clickOnTheLinkContactUs();
    }

    @Step("Getting the actual title of the page Contact Us")
    public String getActualNameOfPageContactUsSection(){
        log.info("Getting the actual title of the page Contact Us");
        return homePage.getTextOfPageContactUsSection();
    }

    @Step("Click the Site Map Section")
    public void goToTheSiteMapSection() {
        log.info("Click the Site Map Section");
        homePage.openPage(HOME_PAGE_URL)
                .clickOnTheLinkSiteMapSection();
    }

    @Step("Getting the actual title of the page Site Map")
    public String getActualNameOfPageSiteMapSection(){
        log.info("Getting the actual title of the page Site Map");
        return homePage.getTextOfPageSiteMapSection();
    }

    @Step("Click the search field")
    public void clickTheSearchField() {
        log.info("Click the search field");
        homePage.openPage(HOME_PAGE_URL)
                .searchField("dress")
                .clickSearch();
    }

    @Step("Getting the actual search results")
    public String getActualSearchResults(){
        log.info("Getting the actual search results");
        return homePage.getTextOfSearchPageSection();
    }

    @Step("Go to cart")
    public void clickTheCard() {
        log.info("Go to cart");
        homePage.openPage(HOME_PAGE_URL)
                .clickCard();
        }
}
