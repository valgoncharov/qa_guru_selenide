package selenide;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import selenide.testdata.TestData;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideSolutionEnterpriseTest extends TestData {

    @Test
    void solutionEnterpriseShouldHaveText(){
        open("baseUrl");
        $(byText("Solutions"))
                .hover();
        $(byText("Enterprise"))
                .click();

    }
}
