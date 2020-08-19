package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


class YandexTests {

        @Test
    void selenideSearchTestYandex() {

        open("https://ya.ru/");

        // Ввести Selenide в поиск
        $("#text").setValue("Selenium").pressEnter();

        // Проверить наличие первой ссылки
        $("html").shouldHave(text("selenium.dev"));

    }
}
