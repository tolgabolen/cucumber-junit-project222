package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VytrackPage {

   public VytrackPage(){
       PageFactory.initElements(Driver.getDriver(), this);
   }

   @FindBy(xpath = "//a[.='Forgot your password?']")
    public WebElement forgotButton;
}
