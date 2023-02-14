package tests;

import org.junit.jupiter.api.Test;

import static testdata.TestData.*;

public class StepsTests extends BaseTest {
    @Test
    public void stepTest() {
        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.clickOnRepositoryLink(REPOSITORY);
        steps.openIssuesTab();
        steps.shouldSeeIssueWithNumber(ISSUE_TITLE);
    }
}
