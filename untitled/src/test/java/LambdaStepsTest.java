import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class LambdaStepsTest {

    private final static String repository = "eroshenkoam/allure-example";
    private final static Integer issueNumber = 68;

        @Test
        public void gitHubTest(){
            step("Открываем главную страницу", () -> {
                open("https://github.com/");
            });

            step("Ищем репозиторий " + repository, () -> {
                $("[data-test-selector=nav-search-input]").setValue("eroshenkoam/allure-example").pressEnter();
                $("[href='/" + repository + "']").click();
            });

            step("Кликаем на таб Issues и ищем " + issueNumber + " pull request", () -> {
                $("#issues-tab").click();
                $("#issue_" + issueNumber + "_link").should(Condition.exist);
            });
        }
}
