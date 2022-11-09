import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static java.lang.Thread.sleep;

public class BestContributerInSelenide {
    @Test
    void andreiSolntsevShouldBeTheFirstContributer(){
        open("https://github.com/selenide/selenide");
        $(".Layout-sidebar").$(byText("Contributors"))
                .ancestor(".BorderGrid-cell") //ищет 1го снизу вверхпредка по дереву
                .$$("ul li")
                .first().hover();
        $$(".Popover-message").findBy(visible).shouldHave(text("Andrei Solntsev"));

    }
}
