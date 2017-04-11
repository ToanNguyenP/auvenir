package com.auvenir.test;

import com.auvenir.pageobject.ContactPO;
import org.testng.annotations.Test;

/**
 * Created by toan.nguyenp on 4/11/2017.
 */
public class ContactTest extends BaseTest {

    @Test
    public void verifyPageContentTest(){
        basePage = new ContactPO(webDriver).get();
        basePage.verifyContentPage();
    }
}
