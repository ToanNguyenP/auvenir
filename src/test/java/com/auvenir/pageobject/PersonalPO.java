package com.auvenir.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by cuong.nguyen on 4/12/2017.
 */
public class PersonalPO extends BaseAuditorOnBoardingPO<PersonalPO> {

    public PersonalPO(WebDriver webDriver){
        super(webDriver);
        super.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

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

