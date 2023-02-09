package com.herokuapp.tests;

import com.Herokuapp.page.PageBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChallengingDOMPageTests extends PageBase {

    @Test
    public void ifTableExist() {
        boolean table = challengingDOMPage().isTableDisplayed();
        Assert.assertTrue(table, "The expected table is not displayed");
    }

    @Test
    public void ifTableDoesNotExist() {
        boolean table = challengingDOMPage().isTableDisplayed();
        Assert.assertNotEquals(table, "The expected table is not displayed']");
    }

    @Test
    public void clickFirstButtonAndVerifyTheLabelsOfAllButtons() {
        challengingDOMPage().triggerFirstButtonAndCheckLabels();
    }

    @Test
    public void clickSecondButtonAndVerifyTheLabelsOfAllButtons() {
        challengingDOMPage().triggerSecondButtonAndCheckLabels();
    }

    @Test
    public void clickThirdButtonAndVerifyTheLabelsOfAllButtons() {
        challengingDOMPage().triggerThirdButtonAndCheckLabels();
    }

    @Test
    public void triggerAnyEditButtonAndVerifyTheCurrentUrl() {
        challengingDOMPage().triggerAnyEditButtonAndGetTheCurrentUrl();
    }

    @Test
    public void SearchByValueAndEditTheRowDetails() {
        challengingDOMPage().searchAndEditARow();
    }

    @Test
    public void triggerAnyDeleteButtonAndVerifyTheCurrentUrl() {
        challengingDOMPage().triggerAnyDeleteButtonAndGetTheCurrentUrl();
    }
    @Test
    public void SearchByValueAndDeletThatRow() {
        challengingDOMPage().searchAndDeleteRow();
    }

    @Test
    public void triggerFormMeToGitHubAndVerifyThePageUrl(){
        challengingDOMPage().clickForkMeOnGitHub();
    }
}
