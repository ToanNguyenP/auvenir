package com.auvenir.test;

import com.auvenir.pageobject.TermsPO;
import org.testng.annotations.Test;

/**
 * Created by toan.nguyenp on 4/11/2017.
 */
public class TermsTest extends BaseTest {

    @Test
    public void verifyPageContentTest(){
        basePage = new TermsPO(webDriver).get();
        basePage.verifyContentPage();
    }
}
