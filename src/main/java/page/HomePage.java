package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page {

    @FindBy(xpath = "//a[@title='Women']")
    private WebElement nameOfMainPage;

    @FindBy(xpath = "//h1[@class='page-heading product-listing']")
    private WebElement nameOfPage;

    @FindBy(xpath = "//a[@class='login']")
    private WebElement SingIn;

    @FindBy(xpath = "//a[@title='Скидки']")
    private WebElement priceDrop;

    @FindBy(xpath = "//a[@title='Новые товары']")
    private WebElement newProducts;

    @FindBy(xpath = "//a[@title='Популярные товары']")
    private WebElement popularProducts;

    @FindBy(xpath = "//a[@title='Наши магазины']")
    private WebElement ourStores;

    @FindBy(xpath = "//h1[@class='page-heading']")
    private WebElement nameOfPageOurStories;

    @FindBy(xpath = "//a[@title='Свяжитесь с нами']")
    private WebElement contactUs;

    @FindBy(xpath = "//h1[@class='page-heading bottom-indent']")
    private WebElement nameOfPageContactUs;

    @FindBy(xpath = "//a[@title='Карта сайта']")
    private WebElement siteMap;

    @FindBy(xpath = "//h1[@class='page-heading']")
    private WebElement nameOfPageSiteMap;


    public HomePage openPage(String url) {
        driver.get(url);
        return this;
    }

    public String getTextOfMainPageSection() {
        return nameOfMainPage.getText();
    }

    public void clickLogin() {
        SingIn.click();
    }

    public void clickOnTheLinkDiscounts() {
        priceDrop.click();
    }

    public void clickOnTheLinkNewProducts() {
        newProducts.click();
    }

    public String getTextOfPageSection() {
        return nameOfPage.getText();
    }

    public void clickOnTheLinkPopularProducts() {
        popularProducts.click();
    }

    public void clickOnTheLinkOurStores() {
        ourStores.click();
    }

    public String getTextOfPageOurStoresSection() {
        return nameOfPageOurStories.getText();
    }

    public void clickOnTheLinkContactUs() {
        contactUs.click();
    }

    public String getTextOfPageContactUsSection() {
        return nameOfPageContactUs.getText();
    }

    public void clickOnTheLinkSiteMapSection() {
        siteMap.click();
    }

    public String getTextOfPageSiteMapSection() {
        return nameOfPageSiteMap.getText();
    }
}
