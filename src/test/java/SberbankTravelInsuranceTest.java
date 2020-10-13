import org.junit.Test;
import pages.*;

public class SberbankTravelInsuranceTest extends BaseTest {

    @Test
    public void sberbankTravelInsuranceTest() {

        // 2. Нажать на "Страхование".
        MainPage mainPage = new MainPage(driver);
        mainPage.selectMenuItem("Страхование");

        // 3. Выбрать "СберСтрахование", в блоке "Страхование путешественников" нажать "Подробнее".
        // Шаг изменён по текущему дизайну сайта.
        mainPage.selectSubMenuItem("СберСтрахование");
        new InsurancePage(driver).selectMenuItem("Страхование путешественников");

        // 4. Проверить наличие на странице заголовка "Страхование путешественников".
        TravelInsurancePage travelInsurancePage = new TravelInsurancePage(driver);
        travelInsurancePage.checkTitle("Страхование путешественников");

        // 5. Нажать на "Оформить Онлайн".
        travelInsurancePage.proceed();

        // 6. На вкладке "Выбор полиса" выбрать сумму страховой защиты "Минимальная".
        TravelInsuranceFirstFormPage travelInsuranceFirstFormPage = new TravelInsuranceFirstFormPage(driver);
        travelInsuranceFirstFormPage.selectSum("Минимальная");

        // 7. Нажать "Оформить".
        travelInsuranceFirstFormPage.proceed();

        // 8. На вкладке "Оформить" заполнить фамилию, имя, дату рождения застрахованных,
        // фамилию, имя, отчество, дату рождения, пол страхователя, паспортные данные.
        // Контактные данные не заполнять.
        TravelInsuranceSecondFormPage travelInsuranceSecondFormPage = new TravelInsuranceSecondFormPage(driver);
        travelInsuranceSecondFormPage
                .fillSurname("Иванов")
                .fillName("Иван")
                .fillBirthDate("01.01.1960")
                .fillPersonLastName("Петров")
                .fillPersonFirstName("Петр")
                .fillPersonMiddleName("Петрович")
                .fillPersonBirthDate("01.01.2000")
                .fillPassportSeries("1010")
                .fillPassportNumber("101010")
                .fillDocumentDate("01.01.2020")
                .fillDocumentIssue("МВД России");

        // 9. Проверить, что все поля заполнены правильно.
        travelInsuranceSecondFormPage
                .checkSurname("Иванов")
                .checkName("Иван")
                .checkBirthDate("01.01.1960")
                .checkPersonLastName("Петров")
                .checkPersonFirstName("Петр")
                .checkPersonMiddleName("Петрович")
                .checkPersonBirthDate("01.01.2000")
                .checkPassportSeries("1010")
                .checkPassportNumber("101010")
                .checkDocumentDate("01.01.2020")
                .checkDocumentIssue("МВД России");

        // 10. Нажать "Продолжить".
        travelInsuranceSecondFormPage.proceed();

        // 11. Проверить, что появилось сообщение "При заполнении данных произошла ошибка".
        // Шаг изменён по текущему дизайну сайта.
        travelInsuranceSecondFormPage.checkWarning();
    }
}
