package com.auvenir.pageobject;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

/**
 * Created by toan.nguyenp on 4/12/2017.
 * Define all of elements in Forgot Password modal
 */
public class ForgotPassPO extends LoadableComponent<ForgotPassPO> {

    private WebDriver webDriver;

    @FindBy(id = "forgotPassword")
    private WebElement eleForgorPasswordModal;
    public WebElement getEleForgorPasswordModal() { return eleForgorPasswordModal; }

    @FindBy(id = "email")
    private WebElement eleEmail;
    public WebElement getEleEmail() { return eleEmail; }

    @FindBy(id = "requestLink")
    private WebElement eleRequestResetLink;
    public WebElement getEleRequestResetLink() { return eleRequestResetLink; }

    public ForgotPassPO(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @Override
    protected void load() {

    }

    @Override
    protected void isLoaded() throws Error {
        //TODO verify that Forgot password modal is displaying
        try{
            Assert.assertTrue(eleForgorPasswordModal.isDisplayed(), "Forgot password modal is hidden.");
        }catch (NoSuchElementException e){

        }

    }

    /**
     * Reset password
     * @param email
     */
    public ResetLinkSentPO resetPassword(String email){
        eleEmail.sendKeys(email);
        eleRequestResetLink.click();
        return new ResetLinkSentPO(webDriver);
    }
}
