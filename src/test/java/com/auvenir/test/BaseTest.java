package com.auvenir.test;

import com.auvenir.pageobject.BaseAuditorOnBoardingPO;
import com.auvenir.pageobject.BasePagePO;
import com.kirwa.nxgreport.NXGReports;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
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
    protected BaseAuditorOnBoardingPO baseAuditorOnBoardingPO;
    protected int a;

    enum BrowserType{
        CHROME, FIREFOX, IE
    }

    @BeforeClass
    @Parameters({"url", "browser"})
    public void setUp(String url, String browser){

        BrowserType type = BrowserType.valueOf(browser.toUpperCase());

        switch (type){
            case CHROME:
                System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
                webDriver = new ChromeDriver();
                break;
            case FIREFOX:
                System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
                DesiredCapabilities cap = DesiredCapabilities.firefox();
                //cap.setCapability("marionette", true);
                webDriver = new FirefoxDriver(cap);
                break;
            case IE:
                System.setProperty("webdriver.ie.driver", "drivers\\IEDriverServer_32.exe");
                DesiredCapabilities capFF = new DesiredCapabilities();
                capFF.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
                webDriver = new InternetExplorerDriver(capFF);
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
        webDriver.quit();
    }
}
