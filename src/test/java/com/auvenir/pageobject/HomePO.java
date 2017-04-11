package com.auvenir.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by toan.nguyenp on 4/11/2017.
 */
public class HomePO extends BasePagePO<HomePO>{

    public HomePO(WebDriver webDriver){
        super(webDriver);
        super.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    /**
     * Verify page content
     */
    @Override
    public void verifyContentPage() {
        System.out.println("Verify home page content.");
    }

    @Override
    protected void load() {

    }

    @Override
    protected void isLoaded() throws Error {

    }
}
