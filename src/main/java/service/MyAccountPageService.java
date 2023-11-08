package service;

import io.qameta.allure.Step;
import page.MyAccountPage;

public class MyAccountPageService {

    private MyAccountPage myAccountPage = new MyAccountPage();

    @Step(" Getting the actual page section title ")
    public String getActualNameOfPageSection(){
        return myAccountPage.getTextOfPageSection();
    }
}
