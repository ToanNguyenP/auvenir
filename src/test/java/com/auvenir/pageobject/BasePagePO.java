package com.auvenir.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;

/**
 * Created by toan.nguyenp on 4/11/2017.
 */
public abstract class BasePagePO<T extends BasePagePO<T>> extends LoadableComponent<T> {

    protected WebDriver webDriver;
    protected HeaderPO headerPO;
    protected FooterPO footerPO;

    /**
     * Verify page content
     */
    public abstract void verifyContentPage();

    public BasePagePO(WebDriver webDriver){
        this.headerPO = new HeaderPO(webDriver);
        this.footerPO = new FooterPO(webDriver);
    }

    public HeaderPO getHeaderPO(){ return headerPO; }
    public FooterPO getFooterPO() { return footerPO; }
}
