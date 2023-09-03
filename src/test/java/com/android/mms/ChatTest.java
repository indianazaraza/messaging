package com.android.mms;

import com.android.mms.screens.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChatTest extends BaseTest{

    @Test
    public void verifyCreateChat(){
        var home = new HomeScreen(driver);
        var newChat= home.newChat();
        String contactName = "001", msg= "hola";
        newChat.typeContactName(contactName);
        newChat.sendMsg(msg);
        Assert.assertTrue(newChat.isDelivered(msg));
    }
}
