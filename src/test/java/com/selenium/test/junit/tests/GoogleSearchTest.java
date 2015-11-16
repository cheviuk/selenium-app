package com.selenium.test.junit.tests;

import com.selenium.test.junit.rules.ScreenShotOnFailRule;
import com.selenium.test.pages.GoogleMainPage;
import com.selenium.test.pages.GoogleSearchResultsPage;
import com.selenium.test.pages.VKMainPage;
import com.selenium.test.webtestsbase.WebDriverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

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
        googleMainPage.insertSearchString(searchString);
        GoogleSearchResultsPage googleSearchResultsPage = googleMainPage.clickSearchButton();
        assertTrue("Search results page has been successfully opened.", googleSearchResultsPage.isPageOpened());
        VKMainPage vkMainPage = googleSearchResultsPage.clickFirstResult();
        assertTrue("VK has been successfully opened.", vkMainPage.isPageOpened());


    }

    @After
    public void afterTest() {
        WebDriverFactory.finishBrowser();
    }
}

