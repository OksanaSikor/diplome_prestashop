package page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class CreateAnAccountPage extends Page{

    @FindBy(xpath = "//input[@id='customer_firstname']")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@id='customer_lastname']")
    private WebElement lastNameField;

    @FindBy(xpath = "//input[@id='passwd']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@name='submitAccount']")
    private WebElement registerButton;


    public CreateAnAccountPage fillInFirstName(String firstName) {
        log.info("Enter first name");
        firstNameField.sendKeys(firstName);
        return this;
    }

    public CreateAnAccountPage fillInLastName(String lastName) {
        log.info("Enter last name");
        lastNameField.sendKeys(lastName);
        return this;
    }

    public CreateAnAccountPage fillInPassword(String password) {
        log.info("Enter password");
        passwordField.sendKeys(password);
        return this;
    }

    public void clickRegisterButton() {
        log.info("Click on the register button");
        registerButton.click();
    }
}
