package com.crowdar.examples.steps;

import com.crowdar.examples.services.LoginFichapService;
import com.crowdar.examples.services.LoginService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFichapSteps {
    @Given("The fichap app is loaded correctly")
    public void isLoginPageVisible() throws InterruptedException {
        LoginFichapService.isViewLoaded();
    }

    @When("The user does the login process with '(.*)' and '(.*)'")
    public void theUserDoesTheLoginProcessWithEmailAndPassword(String email,String password) throws InterruptedException {
        LoginFichapService.doLoginProcess(email, password);
    }

    @Then("The modal message is '(.*)'")
    public void theModalMessageIsMessage(String message) throws InterruptedException {
        LoginFichapService.verifyMessage(message);
    }

    @Then("The failed message is {string}")
    public void theFailedMessageIsMessage(String message) throws InterruptedException {
        LoginFichapService.verifyFailedMessage(message);
    }
}
