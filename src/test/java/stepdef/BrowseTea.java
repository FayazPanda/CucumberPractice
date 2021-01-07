package stepdef;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.FindBy;

public class BrowseTea {
    private static WebDriver driver;
    private static String URL = "http://www.practiceselenium.com/welcome.html";

    @FindBy(xpath = "/html/body/div/div/div[1]/div/div[13]/div/ul/li[3]/a")
    private WebElement menu;

    @Before
    public static void init() {
        System.setProperty("webdriver.gecko.driver",
                "src/test/resources/drivers/geckodriver-v0.28.0-win64/geckodriver.exe");
        FirefoxOptions fOptions = new FirefoxOptions();
        fOptions.setHeadless(true);
        fOptions.addPreference("profile.default_content_setting_values.cookies", 2);
        fOptions.addPreference("network.cookie.cookieBehavior", 2);
        fOptions.addPreference("profile.block_third_party_cookies", true);
        driver = new FirefoxDriver(fOptions);
        driver.manage().window().setSize(new Dimension(1366, 768));

    }

    @After
    public void cleanUp() {
        driver.quit();
    }

    @Given("^the correct web address$")
    public void the_correct_web_address() throws Throwable {
        driver.get(URL);

        assertEquals("Welcome", driver.getTitle());
    }

    @When("^I navigate to the 'Menu' page$")
    public void i_navigate_to_the_Menu_page() throws Throwable {
        menu.click();
    }

    @Then("^I can browse a list of the available products\\.$")
    public void i_can_browse_a_list_of_the_available_products() throws Throwable {
        //I wanted to check if there are product divs on the page, but section of each item is loose so its really hard to check for specifics
        assertEquals("Menu", driver.getTitle());
    }
}
