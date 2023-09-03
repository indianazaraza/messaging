package com.android.mms.screens;

import com.android.mms.ui.Home;
import io.appium.java_client.android.AndroidDriver;

public class HomeScreen extends BaseScreen{
    private AndroidDriver driver;

    public HomeScreen(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public NewChatScreen newChat(){
        click(byId(Home.newMsgBtn));
        return new NewChatScreen(driver);
    }

    public void deleteChats(){
        click(byClassName(Home.moreOptionsBtn));
        click(byId(Home.deleteAllMsgOption));
        acceptAlert();
    }
}
