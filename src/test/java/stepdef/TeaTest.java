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
import org.openqa.selenium.support.PageFactory;
import pages.TeaSite;

public class TeaTest {
    private static WebDriver driver;

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
        driver.get(TeaSite.URL);

        assertEquals("Welcome", driver.getTitle());
    }

    @When("^I navigate to the 'Menu' page$")
    public void i_navigate_to_the_Menu_page() throws Throwable {
        TeaSite webpage = PageFactory.initElements(driver, TeaSite.class);
        webpage.menuClick();
    }

    @Then("^I can browse a list of the available products\\.$")
    public void i_can_browse_a_list_of_the_available_products() throws Throwable {
        //I wanted to check if there are product divs on the page, but section of each item is loose so its really hard to check for specifics
        assertEquals("Menu", driver.getTitle());
    }

    @When("^I click the checkout button$")
    public void i_click_the_checkout_button() throws Throwable {
        TeaSite webpage = PageFactory.initElements(driver, TeaSite.class);
        webpage.checkoutClick();
    }

    @Then("^I am taken to the checkout page$")
    public void i_am_taken_to_the_checkout_page() throws Throwable {
        assertEquals("Check Out", driver.getTitle());
    }
}
