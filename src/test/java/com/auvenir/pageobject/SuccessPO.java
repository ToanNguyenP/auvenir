package com.auvenir.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by cuong.nguyen on 4/12/2017.
 */
public class SuccessPO extends BaseAuditorOnBoardingPO<SuccessPO> {

    public SuccessPO(WebDriver webDriver){
        super(webDriver);
        super.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    @Override
    public void verifyPageContent(){

    }

    @Override
    public void load(){

    }

    @Override
    public void isLoaded()throws Error{

    }

}
