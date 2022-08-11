package stepDefs;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.ConfigReader;
import utilities.Driver;


public class Hooks {

    @Before
    public void setUp(){
        ConfigReader.initProperties();
        Driver.createDriver();
    }

    @After
    public void quit(){
        Driver.getDriver().quit();
    }
}
