package service;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import model.User;
import page.CreateAnAccountPage;

@Log4j2
public class CreateAnAccountPageService {

    private CreateAnAccountPage createAnAccountPage = new CreateAnAccountPage();

    @Step("Create an account")
    public CreateAnAccountPageService createAnAccount(User user) {
        log.info("Create an account");
        createAnAccountPage.fillInFirstName(user.getFirstName())
                .fillInLastName(user.getLastName())
                .fillInPassword(user.getPassword())
                .clickRegisterButton();
        return new CreateAnAccountPageService();
    }
}
