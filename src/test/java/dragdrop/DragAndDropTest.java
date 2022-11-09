package dragdrop;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTest extends TestDataForDrop{
    @Test
    void checkChangeRectangle(){
        open("/drag_and_drop");
        $("#column-a").shouldHave(text("A"));
        $("#column-b").shouldHave(text("B"));
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-a").shouldHave(text("B"));
        sleep(5000);
        $("#column-b").dragAndDropTo($("#column-a"));
        $("#column-b").shouldHave(text("B"));
    }

    @Test
    void checkChangeRectangleWithAction00(){
        open("/drag_and_drop");
        actions().clickAndHold($("#column-b"))
                .moveToElement($("#column-a"))
                .release().perform();
    }
    @Test
    void checkChangeRectangleWithAction01(){
        open("/drag_and_drop");
        actions().clickAndHold($("#column-a"))
                .moveByOffset(150, 150)
                .release().perform();
//        $("#column-a").shouldHave(text("B"));
//        $("#column-b").shouldHave(text("A"));
    }



}
