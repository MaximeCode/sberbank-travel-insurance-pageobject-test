package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TravelInsuranceSecondFormPage extends BasePage {

    @FindBy(id = "surname_vzr_ins_0")
    private WebElement surnameInput;

    @FindBy(id = "name_vzr_ins_0")
    private WebElement nameInput;

    @FindBy(id = "birthDate_vzr_ins_0")
    private WebElement birthDateInput;

    @FindBy(id = "person_lastName")
    private WebElement personLastNameInput;

    @FindBy(id = "person_firstName")
    private WebElement personFirstNameInput;

    @FindBy(id = "person_middleName")
    private WebElement personMiddleNameInput;

    @FindBy(id = "person_birthDate")
    private WebElement personBirthDateInput;

    @FindBy(id = "passportSeries")
    private WebElement passportSeriesInput;

    @FindBy(id = "passportNumber")
    private WebElement passportNumberInput;

    @FindBy(id = "documentDate")
    private WebElement documentDateInput;

    @FindBy(id = "documentIssue")
    private WebElement documentIssueInput;

    @FindBy(xpath = "//button[contains(text(), 'Продолжить')]")
    private WebElement continueButton;

    @FindBy(xpath = "//div[contains(@class, 'alert-form')]")
    private WebElement warningElement;

    public TravelInsuranceSecondFormPage(WebDriver driver) {
        super(driver);
    }

    public TravelInsuranceSecondFormPage fillSurname(String value) {
        fillField(surnameInput, value);
        return this;
    }

    public TravelInsuranceSecondFormPage fillName(String value) {
        fillField(nameInput, value);
        return this;
    }

    public TravelInsuranceSecondFormPage fillBirthDate(String value) {
        fillField(birthDateInput, value);
        return this;
    }

    public TravelInsuranceSecondFormPage fillPersonLastName(String value) {
        fillField(personLastNameInput, value);
        return this;
    }

    public TravelInsuranceSecondFormPage fillPersonFirstName(String value) {
        fillField(personFirstNameInput, value);
        return this;
    }

    public TravelInsuranceSecondFormPage fillPersonMiddleName(String value) {
        fillField(personMiddleNameInput, value);
        return this;
    }

    public TravelInsuranceSecondFormPage fillPersonBirthDate(String value) {
        fillField(personBirthDateInput, value);
        return this;
    }

    public TravelInsuranceSecondFormPage fillPassportSeries(String value) {
        fillField(passportSeriesInput, value);
        return this;
    }

    public TravelInsuranceSecondFormPage fillPassportNumber(String value) {
        fillField(passportNumberInput, value);
        return this;
    }

    public TravelInsuranceSecondFormPage fillDocumentDate(String value) {
        fillField(documentDateInput, value);
        return this;
    }

    public TravelInsuranceSecondFormPage fillDocumentIssue(String value) {
        fillField(documentIssueInput, value);
        return this;
    }

    public TravelInsuranceSecondFormPage checkSurname(String value) {
        checkField(surnameInput, value);
        return this;
    }

    public TravelInsuranceSecondFormPage checkName(String value) {
        checkField(nameInput, value);
        return this;
    }

    public TravelInsuranceSecondFormPage checkBirthDate(String value) {
        checkField(birthDateInput, value);
        return this;
    }

    public TravelInsuranceSecondFormPage checkPersonLastName(String value) {
        checkField(personLastNameInput, value);
        return this;
    }

    public TravelInsuranceSecondFormPage checkPersonFirstName(String value) {
        checkField(personFirstNameInput, value);
        return this;
    }

    public TravelInsuranceSecondFormPage checkPersonMiddleName(String value) {
        checkField(personMiddleNameInput, value);
        return this;
    }

    public TravelInsuranceSecondFormPage checkPersonBirthDate(String value) {
        checkField(personBirthDateInput, value);
        return this;
    }

    public TravelInsuranceSecondFormPage checkPassportSeries(String value) {
        checkField(passportSeriesInput, value);
        return this;
    }

    public TravelInsuranceSecondFormPage checkPassportNumber(String value) {
        checkField(passportNumberInput, value);
        return this;
    }

    public TravelInsuranceSecondFormPage checkDocumentDate(String value) {
        checkField(documentDateInput, value);
        return this;
    }

    public TravelInsuranceSecondFormPage checkDocumentIssue(String value) {
        checkField(documentIssueInput, value);
        return this;
    }

    public void proceed() {
        click(continueButton);
    }

    public void checkWarning() {
        Assert.assertEquals("При заполнении данных произошла ошибка", warningElement.getText());
    }

    void fillField(WebElement field, String value) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(field));
        element.click();
        element.clear();
        element.sendKeys(value);
    }

    void checkField(WebElement field, String value) {
        Assert.assertEquals(value, field.getAttribute("value"));
    }
}
