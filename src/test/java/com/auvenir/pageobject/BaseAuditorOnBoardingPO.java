package com.auvenir.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.LoadableComponent;

/**
 * Created by cuong.nguyen on 4/12/2017.
 */
public abstract class BaseAuditorOnBoardingPO <T extends BaseAuditorOnBoardingPO<T>> extends LoadableComponent<T>{

    protected WebDriver webDriver;
    protected WebElement eleHeader;
    protected WebElement eleFooter;

    /**
     * Verify Page Content
     */
    public abstract void verifyPageContent();

    public BaseAuditorOnBoardingPO(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public WebElement getEleHeader(){
        return  eleHeader;
    }

    public WebElement getEleFooter(){
        return eleFooter;
    }

}
