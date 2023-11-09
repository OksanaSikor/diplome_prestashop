package service;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import model.User;
import page.RegistrationPage;

@Log4j2
public class RegistrationPageService {

    private RegistrationPage registrationPage = new RegistrationPage();

    @Step("Getting the actual page section title")
    public String getActualNameOfPageSection(){
        log.info("Getting the actual page section title");
        return registrationPage.getTextOfPageSection();
    }

    @Step("Navigate of back to main page")
    public HomePageService navigateOfBackToMainPage(){
        log.info("Navigate of back to main page");
        registrationPage.clickButtonOfBack();
        return new HomePageService();
    }

    @Step("Create An Account")
    public RegistrationPage createAnAccount(User email){
        log.info("Create An Account");
        registrationPage.fillInEmail(email.getEmail())
                .clickCreateAnAccountButton();
        return new RegistrationPage();
    }

    @Step("Getting the actual page block title")
    public String getActualPersonalInformationBlock(){
        log.info("Getting the actual page block title");
        return registrationPage.getTextOfPersonalInformationBlock();
    }
}
