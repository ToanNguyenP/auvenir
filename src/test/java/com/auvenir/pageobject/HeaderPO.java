package com.auvenir.pageobject;

import org.apache.poi.hssf.record.HeaderFooterRecord;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

/**
 * Created by toan.nguyenp on 4/11/2017.
 */
public class HeaderPO extends LoadableComponent<HeaderPO> {

    private WebDriver webDriver;
    private LoginPO loginPO;

    public HeaderPO(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);

        loginPO = new LoginPO(webDriver);
    }

    @Override
    protected void load() {

    }

    @Override
    protected void isLoaded() throws Error {

    }

    public LoginPO getLoginPO(){ return loginPO; }
}
