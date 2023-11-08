package service;

import io.qameta.allure.Step;
import model.User;
import page.RegistrationPage;

public class RegistrationPageService {

    private RegistrationPage registrationPage = new RegistrationPage();

    @Step(" Getting the actual page section title ")
    public String getActualNameOfPageSection(){
        return registrationPage.getTextOfPageSection();
    }

    @Step("Navigate of back to main page")
    public HomePageService navigateOfBackToMainPage(){
        registrationPage.clickButtonOfBack();
        return new HomePageService();
    }

    @Step("Create An Account")
    public RegistrationPage createAnAccount(User email){
        registrationPage.fillInEmail(email.getEmail())
                .clickCreateAnAccountButton();
        return new RegistrationPage();
    }

    @Step(" Getting the actual page block title ")
    public String getActualPersonalInformationBlock(){
        return registrationPage.getTextOfPersonalInformationBlock();
    }
}
