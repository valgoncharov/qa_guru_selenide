import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositoryShearch {
    @Test
    void shouldFindRepositoryAtFirstPlace(){
        open("https://github.com/");
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
        $$(".repo-list li").first().$("a").click();//selenide  кликает всегда в центр элемента, поэтому может не срабатывать

        $("#repository-container-header").shouldHave(text("selenide / selenide"));//добавив пробелы будет также работать
        sleep(5000);

    }
}
