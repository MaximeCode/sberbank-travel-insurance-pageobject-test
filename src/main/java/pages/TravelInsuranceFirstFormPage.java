package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TravelInsuranceFirstFormPage extends BasePage {
    @FindBy(xpath = "//legend[text()='Выберите сумму страховой защиты']/..")
    private WebElement sumElement;

    @FindBy(xpath = "//button[text()='Оформить']")
    private WebElement proceedButton;

    public TravelInsuranceFirstFormPage(WebDriver driver) {
        super(driver);
    }

    public void selectSum(String item) {
        click(sumElement.findElement(By.xpath(String.format(".//h3[text()='%s']", item))));
    }

    public void proceed() {
        click(proceedButton);
    }

}
