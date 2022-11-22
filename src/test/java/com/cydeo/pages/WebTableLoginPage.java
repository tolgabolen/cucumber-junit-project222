package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "username")
    public WebElement inputName;

    @FindBy(name = "password")
    public WebElement inputPassword;

    @FindBy (xpath = "//button[.='Login']")
    public  WebElement loginBtn;

    /**
     *
     * @param username
     * @param password
     */
    public void login(String username, String password){
        inputName.sendKeys(username);
        inputPassword.sendKeys(password);
        loginBtn.click();
    }
}
