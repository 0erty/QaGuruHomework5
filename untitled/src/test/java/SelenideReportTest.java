import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideReportTest {

    @Test
    public void gitHubTest(){
        open("https://github.com/");

        $("[data-test-selector=nav-search-input]").setValue("eroshenkoam/allure-example").pressEnter();
        $("[href='/eroshenkoam/allure-example']").click();
        $("#issues-tab").click();
        $("#issue_68_link").should(Condition.exist);
    }
}
