package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page {

    @FindBy(xpath = "//a[@title='Women']")
    private WebElement nameOfMainPage;

    @FindBy(xpath = "//h1[@class='page-heading product-listing']")
    private WebElement nameOfPage;

    @FindBy(xpath = "//a[@title='Specials']")
    private WebElement priceDrop;

    @FindBy(xpath = "//a[@title='New products']")
    private WebElement newProducts;

    @FindBy(xpath = "//a[@title='Best sellers']")
    private WebElement popularProducts;

    @FindBy(xpath = "//a[@title='Our stores']")
    private WebElement ourStores;

    @FindBy(xpath = "//h1[@class='page-heading']")
    private WebElement nameOfPageOurStories;

    @FindBy(xpath = "//a[@title='Contact us']")
    private WebElement contactUs;

    @FindBy(xpath = "//h1[@class='page-heading bottom-indent']")
    private WebElement nameOfPageContactUs;

    @FindBy(xpath = "//a[@title='Sitemap']")
    private WebElement siteMap;

    @FindBy(xpath = "//h1[@class='page-heading']")
    private WebElement nameOfPageSiteMap;

    @FindBy(xpath = "//input[@name='search_query']")
    private WebElement searchField;

    @FindBy(xpath = "//button[@name='submit_search']")
    private WebElement searchButton;

    @FindBy(xpath = "//span[@class='lighter']")
    private WebElement nameOfPageSearch;

    @FindBy(xpath = "//a[@title='View my shopping cart']")
    private WebElement cardButton;


    public HomePage openPage(String url) {
        driver.get(url);
        return this;
    }

    public String getTextOfMainPageSection() {
        return nameOfMainPage.getText();
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

    public HomePage searchField(String name) {
        searchField.sendKeys(name);
        return this;
    }

    public void clickSearch() {
        searchButton.click();
    }

    public String getTextOfSearchPageSection() {
        return nameOfPageSearch.getText();
    }

    public void clickCard() {
        cardButton.click();
    }
}
