package com.auvenir.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

/**
 * Created by toan.nguyenp on 4/12/2017.
 * Define all of elements in Reset Link Sent modal
 */
public class ResetLinkSentPO extends LoadableComponent<ResetLinkSentPO> {

    private WebDriver webDriver;

    //TODO need to change locator of modal
    @FindBy(id = "resetLinkModal")
    private WebElement resetLinkSendModal;
    public WebElement getResetLinkSendModal() { return resetLinkSendModal; }

    //TODO need to change locator of text content
    @FindBy(id = "txt")
    private WebElement eleTextContent;
    public WebElement getEleTextContent() { return eleTextContent; }

    public ResetLinkSentPO(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @Override
    protected void load() {

    }

    @Override
    protected void isLoaded() throws Error {
        String css = resetLinkSendModal.getCssValue("display");
        Assert.assertEquals(css, "block");
    }

    /**
     * TODO
     * Verify content modal
     */
    public void verifyContentModal(){
        String expectedContent = "";
        Assert.assertEquals(this.eleTextContent.getText(), expectedContent);
    }
}
