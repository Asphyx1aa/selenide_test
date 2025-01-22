import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GithubSelenideTests {
    @BeforeAll
    static void setUpTest() {
        Configuration.baseUrl = "https://github.com/";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void SearchSoftAssertionInSelenideTest() {
        open("https://github.com/");
        $(".search-input").click();
        $("[name=query-builder-test]").setValue("selenide").pressEnter();
        $$("[data-testid=results-list]").first().find(byText("selenide")).click();
        $("#wiki-tab").click();
        $(".js-wiki-more-pages-link").click();
        $(".js-wiki-sidebar-toggle-display").shouldHave(text("SoftAssertions"));
    }
}
