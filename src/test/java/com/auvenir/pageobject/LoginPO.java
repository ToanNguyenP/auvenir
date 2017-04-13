package com.auvenir.pageobject;

import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Set;

/**
 * Created by toan.nguyenp on 4/11/2017.
 * Define all of elements in Login modal
 */
public class LoginPO extends LoadableComponent<LoginPO> {

    private WebDriver webDriver;

    public LoginPO(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(id = "loginModal")
    private WebElement eleLoginModal;
    public WebElement getEleLoginModal(){ return eleLoginModal; }

    //TODO need change locator of email input
    @FindBy(css = "#loginModal .email")
    private WebElement eleEmail;
    public WebElement getEleEmail(){ return eleEmail; }

    //TODO need change locator of password input
    @FindBy(css = "#loginModal .pass")
    private WebElement elePassword;
    public WebElement getElePassword() { return elePassword; }

    //TODO need change locator of forgot password link
    @FindBy(css = "#loginModal .forgot")
    private WebElement eleForgot;
    public WebElement getEleForgot() { return eleForgot; }

    //TODO need change locator of login button
    @FindBy(css = "#loginModal .loginbutton")
    private WebElement btnLogin;
    public  WebElement getBtnLogin() { return btnLogin; }

    //TODO need change locator of forgot password link
    @FindBy(css = "#loginModal .forgot")
    private WebElement eleForgotPassword;
    public WebElement getEleForgotPassword() { return eleForgotPassword; }

    @Override
    protected void load() {

    }

    @Override
    protected void isLoaded() throws Error {
        try{
            Assert.assertTrue(eleLoginModal.isDisplayed(), "Login modal is hidden.");
            NXGReports.addStep("Loading login modal is successful.", LogAs.PASSED, null);
        }catch (NoSuchElementException e){
            NXGReports.addStep("Login modal is not found.", LogAs.FAILED, new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
            throw new AssertionError("Login modal is not found.");
        }
    }

    /**
     * Check login feature
     */
    public void login(){
        eleEmail.sendKeys("toan.phuoc.tg@gmail.com");
        NXGReports.addStep("Enter email.", LogAs.PASSED, new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));

        elePassword.sendKeys("toan.nguyen");
        NXGReports.addStep("Enter password.", LogAs.PASSED, new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
        btnLogin.click();

        //TODO Check login successfully on UI

        //TODO check cookie after login successfully
        Set<Cookie> cookies = webDriver.manage().getCookies();
    }

    /**
     * Navigate to forgot password
     */
    public ForgotPassPO navigateToForgotPassword(){
        this.eleForgot.click();
        return new ForgotPassPO(webDriver);
    }

    /**
     * Verify Login modal hide
     * @param timeOut
     */
    public void modalHide(int timeOut){
        try{
            WebDriverWait wait = new WebDriverWait(webDriver, timeOut);
            wait.until(ExpectedConditions.visibilityOf(eleLoginModal));
            Assert.assertFalse(this.eleLoginModal.isDisplayed(), "Login modal is not hidden.");
        }catch (TimeoutException e){
            throw new AssertionError(e.getMessage());
        }catch (NoSuchElementException e){
            NXGReports.addStep("Login modal is not found.", LogAs.FAILED, new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
            throw new AssertionError("Login modal is not found.");
        }
    }
}
