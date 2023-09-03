package com.android.mms.screens;

import com.android.mms.ui.Chat;
import io.appium.java_client.android.AndroidDriver;

import java.util.Objects;

public class NewChatScreen extends BaseScreen{
    private AndroidDriver driver;

    public NewChatScreen(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void typeContactName(String contactName){
        type(byId(Chat.contactNameInput), contactName);
    }

    public void sendMsg(String msg){
        type(byId(Chat.msgInput), msg);
        click(byId(Chat.sendBtn));
    }

    public boolean isDelivered(String msg){
        implicitlyWait(1);
        return Objects.equals(getText(byId(Chat.msgDeliveredView)), msg)
                && isDisplayed(byId(Chat.deliveryIcon));
    }

    public HomeScreen back(){
        click(byId(Chat.backArrowBtn));
        return new HomeScreen(driver);
    }
}
