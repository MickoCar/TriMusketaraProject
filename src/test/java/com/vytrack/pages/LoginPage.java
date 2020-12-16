package com.vytrack.pages;

import com.vytrack.utils.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "prependedInput")
    private WebElement userName;

    @FindBy(id = "prependedInput2")
    private WebElement password;

    @FindBy(id = "_submit")
    private WebElement loginButton;

    public void login(String usernameInput,String passwordInput){
        userName.sendKeys(usernameInput);
        password.sendKeys(passwordInput);
        loginButton.click();
    }

    public void login(){
        String userNameInput = ConfigurationReader.getProperty("username");
        String passwordInput = ConfigurationReader.getProperty("password");
        userName.sendKeys(userNameInput);
        password.sendKeys(passwordInput);
        loginButton.click();

    }
}
