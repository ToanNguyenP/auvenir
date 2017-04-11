package com.auvenir.pageobject;

import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

/**
 * Created by toan.nguyenp on 4/11/2017.
 */
public class LoginPO extends LoadableComponent<LoginPO> {

    private WebDriver webDriver;

    public LoginPO(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    //TODO need change locator of email input
    @FindBy(id = "email")
    private WebElement eleEmail;
    public WebElement getEleEmail(){ return eleEmail; }

    //TODO need change locator of password input
    @FindBy(id = "pass")
    private WebElement elePassword;
    public WebElement getElePassword() { return elePassword; }

    //TODO need change locator of forgot password link
    @FindBy(id = "forgot")
    private WebElement eleForgot;
    public WebElement getEleForgot() { return eleForgot; }

    //TODO need change locator of login button
    @FindBy(id = "loginbutton")
    private WebElement btnLogin;
    public  WebElement getBtnLogin() { return btnLogin; }

    @Override
    protected void load() {

    }

    @Override
    protected void isLoaded() throws Error {

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
    }
}
