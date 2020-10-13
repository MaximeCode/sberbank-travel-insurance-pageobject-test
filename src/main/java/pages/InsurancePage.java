package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InsurancePage extends BasePage {

    @FindBy(xpath = "//div[@class='bp-container bp-ui-dragRoot']")
    private WebElement menu;

    public InsurancePage(WebDriver driver) {
        super(driver);
    }

    public void selectMenuItem(String item) {
        WebElement element = driver.findElement(By.xpath(String.format("//h2[text()='%s']/..//a[text()='Подробнее']", item)));
        ((JavascriptExecutor) driver).executeScript("return arguments[0].scrollIntoView(true);", element);
        click(element);
    }
}
