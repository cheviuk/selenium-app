package com.selenium.test.pages;

import com.selenium.test.webtestsbase.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.NoSuchElementException;

/**
 * Created by klen on 16.11.15.
 */
public class VKMainPage extends BasePage {
    private static final String PAGE_URL = "http://vk.com";

    @FindBy(xpath = "//input[@id='quick_email']")
    WebElement name;

    public VKMainPage(){
        super(false);
    }

    @Override
    protected void openPage(){
        getDriver().get(PAGE_URL);
    }

    @Override
    public boolean isPageOpened(){
        try{
            return name.isDisplayed();
        }
        catch (NoSuchElementException ex){
            return false;
        }
    }
}
