package util;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.openqa.selenium.WebDriver;

public class hooks {
    WebDriver driver;  //= DriverFactory.getDriver();

    @Before
    public void before(){
        driver = driverFactory.initializeDriver("Chrome");
    }
    @BeforeStep
    public void beforeStep() {

    }

    @AfterStep
    public void afterStep() {

    }

    @After
    public void after(){

    }
}

