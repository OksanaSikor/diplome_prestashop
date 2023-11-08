package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends Page {

    @FindBy(xpath = "//h1[@class='page-heading']")
    private WebElement nameToSection;

    public String getTextOfPageSection() {
        return nameToSection.getText();
    }
}
