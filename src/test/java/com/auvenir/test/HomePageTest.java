package com.auvenir.test;

import com.auvenir.pageobject.HomePO;
import org.testng.annotations.Test;

/**
 * Created by toan.nguyenp on 4/11/2017.
 */
public class HomePageTest extends BaseTest{

   // private HomePO homePO = null;

    @Test(priority = 1)
    public void loginTest(){
        basePage = new HomePO(webDriver).get();
        basePage.getHeaderPO().getLoginPO().login();
    }

    @Test(priority = 2)
    public void verifyPageContentTest(){
        basePage.verifyContentPage();
    }
}
