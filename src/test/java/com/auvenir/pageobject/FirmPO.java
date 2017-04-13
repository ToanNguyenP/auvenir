package com.auvenir.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by cuong.nguyen on 4/12/2017.
 */
public class FirmPO extends BaseAuditorOnBoardingPO<FirmPO>{

    public FirmPO(WebDriver webDriver){
        super(webDriver);
        super.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    // TODO need to update locator of Element Firm Name
    @FindBy(id = "firmName")
    private WebElement eleFirmName;
    public WebElement getEleFirmName(){ return eleFirmName; }

    // TODO need to update locator of checkbox rule changed Name
    @FindBy(id = "changedName")
    private WebElement chkChangedName;
    public WebElement getChkChangedName(){ return chkChangedName; }

    // TODO need to update locator of Firm website
    @FindBy(id = "firmWebsite")
    private WebElement eleFirmWebsite;
    public WebElement getEleFirmWebsite(){return eleFirmWebsite; }

    // TODO need to update locator of Full Address
    @FindBy(id = "fullAddress")
    private WebElement eleFullAddress;
    public WebElement getEleFullAddress(){return eleFullAddress; }

    // TODO need to update locator of Zip Code
    @FindBy(id = "zipCode")
    private WebElement eleZipCode;
    public WebElement getEleZipCode(){return eleZipCode; }

    // TODO need to update locator of City
    @FindBy(id = "city")
    private WebElement eleCity;
    public WebElement getEleCity(){return eleCity; }

    // TODO need to update locator of State
    @FindBy(id = "state")
    private WebElement eleState;
    public WebElement getEleState(){return eleState; }


    // TODO need to update locator of Member I.D
    @FindBy(id = "memberID")
    private WebElement eleMemberID;
    public WebElement getEleMemberID(){return eleMemberID; }


    @Override
    public void verifyPageContent(){

    }

    @Override
    protected void load(){

    }

    @Override
    protected void isLoaded() throws Error{

    }

}
