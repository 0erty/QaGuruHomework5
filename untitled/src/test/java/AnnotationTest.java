import org.junit.jupiter.api.Test;

public class AnnotationTest {

    private final static String repository = "eroshenkoam/allure-example";
    private final static Integer issueNumber = 68;

    @Test
    public void AnnotationsGitHubTest() {
        AnnotationSteps annotationSteps = new AnnotationSteps();

        annotationSteps.gitHubTest();
        annotationSteps.searchRepository(repository);
        annotationSteps.search68Issue(issueNumber);
    }
}
