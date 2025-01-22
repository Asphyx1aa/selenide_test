import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class GithubSelenideTests {
    @BeforeAll
    static void setUpTest() {
        Configuration.baseUrl = "https://github.com/";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void SearchSoftAssertionInSelenideTest() {
        
    }
}
