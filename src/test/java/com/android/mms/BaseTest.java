package com.android.mms;

import com.android.mms.utils.AndroidDevice;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    static AndroidDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        var andDev = new AndroidDevice();
        andDev.setDeviceName("EQ85BAYDMZ5LR44P");
        andDev.setPlatformVersion("6.0");
        andDev.setAppPackage("com.android.mms");
        andDev.setAppActivity("com.android.mms.ui.BootActivity");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/"),
                andDev.getAutomatorOptions(andDev));
    }

    @AfterTest
    public void tearDown() { driver.quit(); }
}
