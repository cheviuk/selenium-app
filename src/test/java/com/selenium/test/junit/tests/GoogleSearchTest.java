package com.selenium.test.junit.tests;

import com.selenium.test.junit.rules.ScreenShotOnFailRule;
import com.selenium.test.pages.GoogleMainPage;
import com.selenium.test.pages.GoogleSearchResultsPage;
import com.selenium.test.webtestsbase.WebDriverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

/**
 * Created by daria on 15.11.15.
 */
public class GoogleSearchTest {
    @Rule
    public ScreenShotOnFailRule screenShotOnFailRule = new ScreenShotOnFailRule();

    @Before
    public void beforeTest() {
        WebDriverFactory.startBrowser(true);
    }

    @Test
    public void googleSearchTest() {
        String searchString = "VK";
        GoogleMainPage googleMainPage = new GoogleMainPage();
        googleMainPage.openPage();
        googleMainPage.insertSearchString(searchString);
        GoogleSearchResultsPage = googleMainPage.clickSearchButton();
        assertTrue("", GoogleSearchResultsPage.isPageOpened());
        TEST

    }

    @After
    public void afterTest() {
        WebDriverFactory.finishBrowser();
    }
}

