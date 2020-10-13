package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TravelInsurancePage extends BasePage {

    @FindBy(xpath = "//nav/..//h1")
    private WebElement title;

    @FindBy(xpath = "//span[text()='Оформить онлайн']")
    private WebElement proceedButton;

    public TravelInsurancePage(WebDriver driver) {
        super(driver);
    }

    public void checkTitle(String expected) {
        Assert.assertEquals(expected, this.title.getText());
    }

    public void proceed() {
        click(proceedButton);
    }
}
