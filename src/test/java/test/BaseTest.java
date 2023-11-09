package test;

import driver.DriverSingleton;
import io.qameta.allure.Description;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import utils.TestListener;

@Listeners(TestListener.class)
public class BaseTest {

    @AfterTest
    @Description("Close browser")
    public void stopBrowser() {
        DriverSingleton.getInstance().closeDriver();
    }
}
