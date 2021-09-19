import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AnnotationSteps {

    @Step ("Открываем главную страницу")
    public void gitHubTest(){
        open("https://github.com/");
    }

    @Step ("Ищем репозиторий {repository}")
    public void searchRepository(String repository) {
        $("[data-test-selector=nav-search-input]").setValue("eroshenkoam/allure-example").pressEnter();
        $("[href='/" + repository + "']").click();
    }

    @Step ("Кликаем на таб Issues и ищем {issueNumber}}")
    public void search68Issue(Integer issueNumber) {
        $("#issues-tab").click();
        $("#issue_" + issueNumber + "_link").should(Condition.exist);
    }
}
