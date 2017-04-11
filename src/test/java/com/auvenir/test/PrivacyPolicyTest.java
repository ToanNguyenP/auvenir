package com.auvenir.test;

import com.auvenir.pageobject.PrivacyPolicyPO;
import org.testng.annotations.Test;

/**
 * Created by toan.nguyenp on 4/11/2017.
 */
public class PrivacyPolicyTest extends BaseTest {

    @Test
    public void verifyPageContentTest(){
        basePage = new PrivacyPolicyPO(webDriver).get();
        basePage.verifyContentPage();
    }
}
