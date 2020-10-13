package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(xpath = "//ul[@class='kitt-top-menu__list kitt-top-menu__list_icons kitt-top-menu__list_center']")
    private WebElement menu;

    @FindBy(xpath = "//a[text()='Перейти в каталог']/../..")
    private WebElement subMenu;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void selectMenuItem(String item) {
        click(menu.findElement(By.partialLinkText(item)));
    }

    public void selectSubMenuItem(String item) {
        click(subMenu.findElement(By.partialLinkText(item)));
    }
}
