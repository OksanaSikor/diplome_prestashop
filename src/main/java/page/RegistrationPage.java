package page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class RegistrationPage extends Page {

    @FindBy(xpath = "//h1[@class='page-heading']")
    private WebElement nameToSection;

    @FindBy(xpath = "//div[@id='header_logo']")
    private WebElement backToHomeButton;

    @FindBy(xpath = "//button[@name='SubmitCreate']")
    private WebElement createAnAccountButton;

    @FindBy(xpath = "//input[@id='email_create']")
    private WebElement emailAddress;

    @FindBy(xpath = "//h3[@class='page-subheading']")
    private WebElement yourPersonalInformationBlock;


    public String getTextOfPageSection() {
        return nameToSection.getText();
    }

    public void clickButtonOfBack() {
        backToHomeButton.click();
    }

    public RegistrationPage fillInEmail(String email) {
        log.info("Enter email");
        emailAddress.sendKeys(email);
        return this;
    }

    public void clickCreateAnAccountButton() {
        log.info("Click on the create an account button");
        createAnAccountButton.click();
    }

    public String getTextOfPersonalInformationBlock() {
        return yourPersonalInformationBlock.getText();
    }
}
