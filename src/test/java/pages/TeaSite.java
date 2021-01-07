package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeaSite {
    public static final String URL = "http://www.practiceselenium.com/welcome.html";

    @FindBy(xpath = "/html/body/div/div/div[1]/div/div[13]/div/ul/li[5]/a")
    private WebElement checkout;

    @FindBy(xpath = "/html/body/div/div/div[1]/div/div[13]/div/ul/li[3]/a")
    private WebElement menu;

    public TeaSite() {
    }

    public void checkoutClick() {
        checkout.click();
    }

    public void menuClick() {
        menu.click();
    }

}
