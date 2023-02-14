package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import steps.Steps;
import testdata.TestData;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browserSize;

public class BaseTest {
    Steps steps = new Steps();

    @BeforeAll
    public static void setUp() {
        browserSize = "1920x1080";
        baseUrl = "https://github.com";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }
}
