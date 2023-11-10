package service;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import page.RegistrationPage;

@Log4j2
public class RegistrationPageService {

    private RegistrationPage registrationPage = new RegistrationPage();

    @Step("Getting the actual page section title")
    public String getActualNameOfPageSection(){
        log.info("Getting the actual page section title");
        return registrationPage.getTextOfPageSection();
    }
}
