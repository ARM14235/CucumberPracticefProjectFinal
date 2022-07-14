
    package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class GoogleSearchPage {

        public GoogleSearchPage(){

            PageFactory.initElements(Driver.getDriver(),this);
        }

        @FindBy(name="q")
        public WebElement searchBox;

        @FindBy(css = "a[class='FLP8od']")
        public WebElement capitalText;

        @FindBy(xpath = "(//a[@class='gb_d'])[1]")
        public WebElement gmailLink;
    }

