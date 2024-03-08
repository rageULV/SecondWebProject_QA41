package Tests;

import Config.BaseTest;
import Helpers.TopMenuItem;
import Pages.MainPage;
import Pages.SearchPage;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

public class ilcarroTest extends BaseTest {

    @Test void ilcarroTest_001() throws InterruptedException{
        MainPage mainPage = new MainPage(getDriver());
        SearchPage searchPage = mainPage.openTopMenu(TopMenuItem.SEARCH.toString());
        Thread.sleep(3000);

    }
}
