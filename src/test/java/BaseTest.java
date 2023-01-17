import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

abstract public class BaseTest {
    @BeforeTest
    public void init() {
        setUp();
//        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    public void setUp() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "2560x1440";
        Configuration.timeout = 60;
//        Configuration.pageLoadTimeout = 50;
        Configuration.headless = false;
    }

    @AfterClass
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
