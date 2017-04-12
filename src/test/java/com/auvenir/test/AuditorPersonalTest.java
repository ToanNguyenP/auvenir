package com.auvenir.test;

import com.auvenir.pageobject.PersonalPO;
import org.junit.Test;

/**
 * Created by cuong.nguyen on 4/12/2017.
 */
public class AuditorPersonalTest extends BaseTest {

    @Test
    public void verifyPageContent(){
        baseAuditorOnBoardingPO = new PersonalPO(webDriver).get();
        baseAuditorOnBoardingPO.verifyPageContent();
    }
}
