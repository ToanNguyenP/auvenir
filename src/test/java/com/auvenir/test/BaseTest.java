package com.auvenir.test;

import com.auvenir.pageobject.BasePagePO;
import com.kirwa.nxgreport.NXGReports;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import java.util.concurrent.TimeUnit;

/**
 * Created by toan.nguyenp on 4/11/2017.
 */
public abstract class BaseTest {

    protected WebDriver webDriver;
    protected BasePagePO basePage;

    enum BrowerType{
        CHROME, FIREFOX, IE
    }

    @BeforeClass
    @Parameters({"url", "browser"})
    public void setUp(String url, String browser){

        BrowerType type = BrowerType.valueOf(browser.toUpperCase());

        switch (type){
            case CHROME:
                System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
                webDriver = new ChromeDriver();
                break;
            case FIREFOX:
                break;
            case IE:
                break;
            default:
                break;
        }
        NXGReports.setWebDriver(webDriver);

        webDriver.get(url);

        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown(){
        webDriver.close();
    }
}
