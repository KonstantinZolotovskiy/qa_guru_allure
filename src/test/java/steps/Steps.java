package steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class Steps {
    @Step("Открывем главную страницу")
    public void openMainPage() {
        open("/");
    }

    @Step("Ищем репозиторий \"{repository}\" ")
    public void searchForRepository(String repository) {
        $(".header-search-input").click();
        $(".header-search-input").sendKeys(repository);
        $(".header-search-input").submit();
    }

    @Step("Кликаем по ссылке репозитория \"{repository}\"")
    public void clickOnRepositoryLink(String repository) {
        $(linkText(repository)).click();
    }

    @Step("Открываем таб Issues")
    public void openIssuesTab() {
        $("#issues-tab").click();
    }

    @Step("Проверяем наличие Issue с заголовком \"{issueTitle}\"")
    public void shouldSeeIssueWithNumber(String issueTitle) {
        $(withText(issueTitle)).should(exist);
    }
}
