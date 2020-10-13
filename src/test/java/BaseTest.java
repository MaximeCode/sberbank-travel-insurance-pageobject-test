import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    static Properties properties = TestProperties.getInstance().getProperties();
    static WebDriver driver;
    static WebDriverWait wait;

    @BeforeClass
    public static void beforeSberbankTravelInsuranceTest() {

        if ("chrome".equals(properties.getProperty("browser"))) {
            System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver"));
            driver = new ChromeDriver();
        } else if ("firefox".equals(properties.getProperty("browser"))) {
            System.setProperty("webdriver.gecko.driver", properties.getProperty("webdriver.gecko.driver"));
            driver = new FirefoxDriver();
        }

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 5);

        // 1. Перейти на страницу http://www.sberbank.ru/ru/person.
        driver.get(properties.getProperty("url"));
    }

    @AfterClass
    public static void afterSberbankTravelInsuranceTest() {
        driver.quit();
    }
}
