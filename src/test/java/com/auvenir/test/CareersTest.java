package com.auvenir.test;

import com.auvenir.pageobject.CareersPO;
import org.testng.annotations.Test;

/**
 * Created by toan.nguyenp on 4/11/2017.
 */
public class CareersTest extends BaseTest{

    @Test
    public void verifyPageContentTest(){
        basePage = new CareersPO(webDriver).get();
        basePage.verifyContentPage();
    }
}
