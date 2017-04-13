package com.auvenir.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.WatchEvent;

/**
 * Created by toan.nguyenp on 4/12/2017.
 * Define all of elements in email template after user enter email to forgot password
 */
public class EmailResetPassPO extends BasePagePO<EmailResetPassPO> {

    @FindBy
    private WebElement btnResetPassword;
    public WebElement getBtnResetPassword() { return btnResetPassword; }

    public EmailResetPassPO(WebDriver webDriver) {
        super(webDriver);
        super.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    /**
     * Verify page content
     */
    @Override
    public void verifyContentPage() {

    }

    @Override
    protected void load() {

    }

    @Override
    protected void isLoaded() throws Error {

    }
}
