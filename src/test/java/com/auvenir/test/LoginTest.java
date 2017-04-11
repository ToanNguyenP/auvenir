package com.auvenir.test;

import com.auvenir.pageobject.HeaderPO;
import com.auvenir.pageobject.HomePO;
import com.auvenir.pageobject.LoginPO;
import org.testng.annotations.Test;

/**
 * Created by toan.nguyenp on 4/11/2017.
 */
public class LoginTest extends BaseTest{

    private LoginPO loginPO = null;

    @Test
    public void loginTest(){
        loginPO = new LoginPO(webDriver).get();
        loginPO.login();
    }
}
