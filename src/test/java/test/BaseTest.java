package test;

import driver.DriverSingleton;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import utils.TestListener;

@Listeners(TestListener.class)
public class BaseTest {

    @AfterTest
    public void stopBrowser() {
        DriverSingleton.getInstance().closeDriver();
    }
}
