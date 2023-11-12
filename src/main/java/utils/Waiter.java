package utils;

import driver.DriverSingleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waiter {

    public final static int WAIT_2_SECONDS = 2;
    public final static int WAIT_500_MILLISECONDS = 500;

    private Waiter() {

    }

    public static WebElement waitElementToBeClickable(WebElement element) {
        return new WebDriverWait(DriverSingleton.getInstance().getDriver(), Duration.ofSeconds(WAIT_500_MILLISECONDS))
                .until(ExpectedConditions.elementToBeClickable(element));
    }

}
