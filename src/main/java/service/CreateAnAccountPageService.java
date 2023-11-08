package service;

import io.qameta.allure.Step;
import model.User;
import page.CreateAnAccountPage;

public class CreateAnAccountPageService {
    private CreateAnAccountPage createAnAccountPage = new CreateAnAccountPage();

    @Step("Create an account")
    public CreateAnAccountPageService createAnAccount(User user){
        createAnAccountPage.fillInFirstName(user.getFirstName())
                .fillInLastName(user.getLastName())
                .fillInPassword(user.getPassword())
                .clickRegisterButton();
        return new CreateAnAccountPageService();
    }
}
