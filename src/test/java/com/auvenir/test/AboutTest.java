package com.auvenir.test;

import com.auvenir.pageobject.AboutPO;
import org.testng.annotations.Test;

/**
 * Created by toan.nguyenp on 4/11/2017.
 */
public class AboutTest extends BaseTest{

    @Test
    public void verifyPageContentTest(){
        basePage = new AboutPO(webDriver).get();
        basePage.verifyContentPage();
    }
}
