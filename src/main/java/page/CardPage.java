package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Waiter;

public class CardPage extends Page{

    @FindBy(xpath = "//h1[@id='cart_title']")
    private WebElement nameOfPage;

    @FindBy(xpath = "//div[@id='header_logo']")
    private WebElement backToHomeButton;

    public String getTextOfCardPageSection() {
        return nameOfPage.getText();
    }

    public void clickButtonOfBack() {
        Waiter.waitElementToBeClickable(backToHomeButton).click();
    }
}
