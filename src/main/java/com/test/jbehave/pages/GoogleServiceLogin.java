package com.test.jbehave.pages;

import com.test.jbehave.main.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Oleksandr_Kara on 12-Jun-14.
 */
public class GoogleServiceLogin extends Page {

    final String errorMessageId = "errormsg_0_Passwd";

    @FindBy (id = "identifierId") WebElement userNameElement;
    @FindBy (name = "password") WebElement passwordElement;
    @FindBy (id = "signIn") WebElement enterButtonElement;
    @FindBy (id =errorMessageId) WebElement errorMessageElement;
    @FindBy (xpath="//span[text()='Next']") WebElement nextElement;

    public void enterUserName(String userName) {
        type(userNameElement, userName);
        nextElement.click();
    }

    public void enterPassword(String password) {
        type(passwordElement, password);
    }

    public void pressEnterButton() {
        enterButtonElement.click();
    }

    public boolean isLoginErrorMessage(String errorMessage) {
        if((errorMessageElement.getText().equals(errorMessage)) && errorMessageElement.isDisplayed()) {
            return true;
        }
        else return false;
    }
}
