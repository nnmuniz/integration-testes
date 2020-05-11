package com.br.IntegrationTests.pageObjects;

import com.br.IntegrationTests.helper.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    @FindBy(xpath = "")
    public WebElement userName;

    @FindBy(xpath = "")
    WebElement password;

    @FindBy(xpath = "")
    WebElement loginButton;
    WaitHelper waitHelper;

    public LoginPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
        waitHelper = new WaitHelper(driver);
    }

    public void enterUserName(String userName) {
        this.userName.sendKeys(userName);
    }

    public void enterPassword(String password) {
        this.password.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

}
