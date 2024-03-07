package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class MainPage extends BasePage{
    public MainPage(WebDriver driver){
        setDriver(driver);
        driver.get("https://ilcarro.web.app");
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,20),this);

    }
    public <T extends BasePage> T openTopMenu(String topMenuItem)
    {
        WebElement menuItem = driver.findElement(By.xpath("//a[contains(text(),'"+topMenuItem+"')]"));
        menuItem.click();

        switch(topMenuItem)
        {
            case"SEARCH":
                return(T) new SearchPage(driver);
            case"LETCARWORK":
                return(T) new LetCarWorkPage(driver);
            case"TERMSOFUS":
                return(T) new TermsOfUsPage(driver);
            case"SIGNUP":
                return(T) new SignUpPage(driver);
            case"LOGIN":
                return(T) new LoginPage(driver);

            default: throw new IllegalArgumentException("something wrong"+topMenuItem);
        }
    }
}
