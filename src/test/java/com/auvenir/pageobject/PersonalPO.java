package com.auvenir.pageobject;

import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen;
import org.codehaus.groovy.runtime.dgmimpl.arrays.CharacterArrayPutAtMetaMethod;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

/**
 * Created by cuong.nguyen on 4/12/2017.
 */
public class PersonalPO extends BaseAuditorOnBoardingPO<PersonalPO> {

    public PersonalPO(WebDriver webDriver){
        super(webDriver);
        super.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    //TODO need to update compatible with locator of First and Last Name
    @FindBy(id = "name")
    private WebElement eleName;
    public WebElement getEleName(){
        return eleName;
    }

    // TODO need to update compatible with locator of EmailAddress
    @FindBy(id = "email")
    private  WebElement eleEmail;
    public WebElement getEleEmail(){
        return eleEmail;
    }

    // TODO need to update compatible with locator of EmailAddress
    @FindBy(id = "confirmEmail")
    private WebElement eleConfirmEmail;
    public WebElement getEleConfirmEmail(){
        return eleConfirmEmail;
    }

    // TODO need to update compatible with locator of Role in Firm
    @FindBy(id = "roleFirm")
    private WebElement eleRoleFirm;
    public WebElement getEleRoleFirm(){
        return eleRoleFirm;
    }

    // TODO need to update compatible with locator of Phone Number
    @FindBy(id = "phoneNumber")
    private WebElement elePhoneNumber;
    public WebElement getElePhoneNumber(){
        return elePhoneNumber;
    }

    // TODO need to update compatible with locator of Hear about Auvenir
    @FindBy(id = "reference")
    private WebElement eleReference;
    public WebElement getEleReference(){
        return eleReference;
    }

    // TODO need to update compatible with locator of checkbox I agree
    @FindBy(id = "chkAgree")
    private WebElement chkAgree;
    public WebElement getChkAgree(){
        return chkAgree;
    }

    // TODO need to update compatible with locator of checkbox I confirm
    @FindBy(id = "chkConfirm")
    private WebElement chkConfirm;
    public WebElement getChkConfirm(){
        return chkConfirm;
    }

    // TODO need to update compatible with locator of button Continue
    @FindBy(id = "continuebutton")
    private WebElement btnContinue;
    public WebElement getBtnContinue(){
        return btnContinue;
    }

    @Override
    public void verifyPageContent(){

    }

    @Override
    protected void load(){

    }

    @Override
    protected void isLoaded() throws Error {

        // Checking First and Last Name element is displayed
        try {
            Assert.assertTrue(eleName.isDisplayed(), "Element First and Last Name is not displayed  ");
            NXGReports.addStep("Element First and Last Name is displayed",LogAs.PASSED,new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
        }catch (NoSuchElementException e){
            NXGReports.addStep("Element First and Last Name is not found",LogAs.FAILED,new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
            throw new AssertionError("Element First and Last Name is not found");
        }

        // Checking Email Address element is displayed
        try{
            Assert.assertTrue(eleEmail.isDisplayed(), "Element Email Address is not displayed  ");
            NXGReports.addStep("Element Email Address is displayed",LogAs.PASSED,new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
        }catch (NoSuchElementException e){
            NXGReports.addStep("Element Email Address is not found",LogAs.FAILED,new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
            throw new AssertionError("Element Email Address is not found");
        }

        // Checking ReEnter Email Address element is displayed
        try{
            Assert.assertTrue(eleConfirmEmail.isDisplayed(), "Element ReEnter Email Address is not displayed  ");
            NXGReports.addStep("Element ReEnter Email Address is displayed",LogAs.PASSED,new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
        }catch (NoSuchElementException e){
            NXGReports.addStep("Element ReEnter Email Address is not found",LogAs.FAILED,new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
            throw new AssertionError("Element ReEnter Email Address is not found");
        }

        //  Checking Role in Firm element is displayed
        try{
            Assert.assertTrue(eleRoleFirm.isDisplayed(), "Element Role in Firm is not displayed  ");
            NXGReports.addStep("Element Role in Firm is displayed",LogAs.PASSED,new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
        }catch (NoSuchElementException e){
            NXGReports.addStep("Element Role in Firm is not found",LogAs.FAILED,new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
            throw new AssertionError("Element Role in Firm is not found");
        }

        // Checking Phone Number element is displayed
        try{
            Assert.assertTrue(elePhoneNumber.isDisplayed(), "Element Phone Number is not displayed  ");
            NXGReports.addStep("Element Phone Number is displayed",LogAs.PASSED,new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
        }catch (NoSuchElementException e){
            NXGReports.addStep("Element Phone Number is not found",LogAs.FAILED,new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
            throw new AssertionError("Element Phone Number is not found");
        }

        // Checking Reference Auvenir element is displayed
        try{
            Assert.assertTrue(eleReference.isDisplayed(), "Element Reference Auvenir is not displayed  ");
            NXGReports.addStep("Element  Reference Auvenir is displayed",LogAs.PASSED,new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
        }catch (NoSuchElementException e){
            NXGReports.addStep("Element  Reference Auvenir  is not found",LogAs.FAILED,new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
            throw new AssertionError("Element  Reference Auvenir  is not found");
        }

    }

    public void registerAuditorPersonal(){
        eleName.sendKeys("Andre Auditor");
        NXGReports.addStep("Input First and Last Name", LogAs.PASSED, new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));

        eleEmail.sendKeys("andy@Audits.com");
        NXGReports.addStep("Input Email Address",LogAs.PASSED,new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));

        eleConfirmEmail.sendKeys("andy@aga.com");
        NXGReports.addStep("Input confirm Email Address",LogAs.PASSED,new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));

        Select selectRoleFirm = new Select(eleRoleFirm);
        selectRoleFirm.selectByVisibleText("Senior Manager");
        NXGReports.addStep("select Role in Firm",LogAs.PASSED,new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));

        elePhoneNumber.sendKeys("416-797-7865");
        NXGReports.addStep("Input Phone Number",LogAs.PASSED,new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));

        Select selectReference = new Select(eleReference);
        selectReference.selectByVisibleText("Referral");
        NXGReports.addStep("Select reference about Auvenir",LogAs.PASSED,new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));

        chkAgree.click();
        chkConfirm.click();

        btnContinue.click();

        // TODO check css or xpath of next page
        try{

            NXGReports.addStep("Register Auditor Personal passed",LogAs.PASSED,new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
        }catch (NoSuchElementException e){
            NXGReports.addStep("Register Auditor Personal failed",LogAs.FAILED,new CaptureScreen(CaptureScreen.ScreenshotOf.BROWSER_PAGE));
            throw new AssertionError("Register Auditor Personal failed");
        }


    }

}

