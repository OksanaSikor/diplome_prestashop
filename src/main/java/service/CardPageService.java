package service;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import page.CardPage;

@Log4j2
public class CardPageService {

    private CardPage cardPage = new CardPage();

    @Step("Getting the actual title of the home page section")
    public String getActualNameOfCardPageSection(){
        log.info("Getting the actual title of the home page section");
        return cardPage.getTextOfCardPageSection();
    }

    @Step("Navigate of back to main page")
    public void navigateOfBackToMainPage(){
        log.info("Navigate of back to main page");
        cardPage.clickButtonOfBack();
    }
}
