package com.android.mms.utils;

import io.appium.java_client.android.options.UiAutomator2Options;

public class AndroidDevice {
    private String deviceName;
    private String platformVersion;
    private String appPackage;
    private String appActivity;

    public String getDeviceName() {
        return deviceName;
    }

    public String getPlatformVersion() {
        return platformVersion;
    }

    public String getAppPackage() {
        return appPackage;
    }

    public String getAppActivity() {
        return appActivity;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    public void setAppPackage(String appPackage) {
        this.appPackage = appPackage;
    }

    public void setAppActivity(String appActivity) {
        this.appActivity = appActivity;
    }

    public UiAutomator2Options getAutomatorOptions(AndroidDevice androidDevice){
        var options = new UiAutomator2Options();
        options.setCapability("autoGrantPermissions", "true");
        options.setDeviceName(androidDevice.getDeviceName());
        options.setPlatformName("Android");
        options.setPlatformVersion(androidDevice.getPlatformVersion());
        options.setAppPackage(androidDevice.getAppPackage());
        options.setAppActivity(androidDevice.getAppActivity());
        return options;
    }
}
