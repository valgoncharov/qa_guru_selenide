import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideSoftAssertionsTest {
    @BeforeAll
    static void configure(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";

    }

    @Test
    void softAssertionsJUnitTest(){
        open("https://github.com/");
        $(By.name("q")).setValue("selenide").pressEnter();
        $("a[href='/selenide/selenide']").click();
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("Softassertions");
        $(".wiki-rightbar").shouldHave(Condition.text("SoftAssertions"));
        $(".wiki-rightbar").$(byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));

    }
}
