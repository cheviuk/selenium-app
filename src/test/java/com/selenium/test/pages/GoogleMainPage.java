package com.selenium.test.pages;

import com.selenium.test.webtestsbase.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by daria on 15.11.15.
 */
public class GoogleMainPage extends BasePage {
    private static final String PAGE_URL = "http://google.com";

    @FindBy(xpath = "//input[@id='lst-ib']")
    private WebElement searchField;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement searchButton;

    public GoogleMainPage() {
        super(true);
    }

    @Override
    protected void openPage() {
        getDriver().get(PAGE_URL);
    }

    @Override
    public boolean isPageOpened() {
        return searchField.isDisplayed();
    }

    public void insertSearchString(String searchString) {
        searchField.sendKeys(searchString);
    }

    public GoogleSearchResultsPage clickSearchButton() {
        searchButton.click();
        return new GoogleSearchResultsPage();
    }
}
