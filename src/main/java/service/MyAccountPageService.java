package service;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import page.MyAccountPage;

@Log4j2
public class MyAccountPageService {

    private MyAccountPage myAccountPage = new MyAccountPage();

    @Step("Getting the actual page section title")
    public String getActualNameOfPageSection(){
        log.info("Getting the actual page section title");
        return myAccountPage.getTextOfPageSection();
    }
}
