package com.auvenir.test;

import com.auvenir.pageobject.CookieNoticePO;
import org.testng.annotations.Test;

/**
 * Created by toan.nguyenp on 4/11/2017.
 */
public class CookiesNoticeTest extends BaseTest {

    @Test
    public void verifyPageContentTest(){
        basePage = new CookieNoticePO(webDriver).get();
        basePage.verifyContentPage();
    }
}

