package Tests;

import Config.BaseTest;
import Pages.MainPage;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

public class ilcarroTest extends BaseTest {

    @Test void ilcarroTest_001(){
        MainPage mainPage = new MainPage(getDriver());
        
    }
}
