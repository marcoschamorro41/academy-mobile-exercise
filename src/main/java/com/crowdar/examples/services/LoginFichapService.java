package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import org.testng.Assert;

public class LoginFichapService {

    public static void isViewLoaded() throws InterruptedException {

        MobileActionManager.waitVisibility("loginFichapView.whiteScreen");
        Thread.sleep(50000);
        //validar si algun elemento esta visible
        Assert.assertTrue(MobileActionManager.isVisible("LoginFichapView.signInButton"));
    }


    public static void doLoginProcess(String email, String password) throws InterruptedException {
        MobileActionManager.setInput("loginFichapView.emailInput",email);
        MobileActionManager.setInput("loginFichapView.passwordInput",password);
        MobileActionManager.click("LoginFichapView.signInButton");

    }

    public static void verifyMessage(String message) throws InterruptedException {
        //MobileActionManager.waitVisibility("LoginFichapView.MessageText");
        Assert.assertEquals(MobileActionManager.getText("LoginFichapView.MessageText"),message);
    }

    public static void verifyFailedMessage(String message) throws InterruptedException {
        //MobileActionManager.waitVisibility("LoginFichapView.MessageText");
        Assert.assertEquals(MobileActionManager.getText("LoginFichapView.failedMessage"),message);
    }

}
