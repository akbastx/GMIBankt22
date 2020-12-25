package gmiBank_team22.pages;

import gmiBank_team22.pojos.Admins_pojo;
import gmiBank_team22.utilities.ConfigurationReader;
import gmiBank_team22.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class US_0017_Admin_Page {
    Admins_pojo adminPojo =new Admins_pojo();
    private WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);

    public US_0017_Admin_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='#']")
    private WebElement signInMenu;

    @FindBy(xpath = "(//*[text()='Sign in'])[1]")
    private WebElement firstSingIn;

    @FindBy(name = "username")
    private WebElement userName;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement secondSignIn;

    @FindBy(id = "admin-menu")
    private WebElement adminMenu;

    @FindBy(xpath = "//*[text()='User management'][1]")
    private WebElement userManagement;

    @FindBy(xpath = "//tr[@id='globalmanager1']/td/button/span")
    private WebElement activatedButton;

    @FindBy(xpath = "//*[@role='alert']")
    private WebElement alertMessage;


    @FindBy(xpath = "//dd")
    private List<WebElement> userInfo;

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    private WebElement lastName;

    @FindBy(xpath = "//*[text()='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement deleteMessage;
    @FindBy(xpath = "//div[3]/button[2]/span")
    public WebElement secondDelete;

    public void editUser(){

       firstName.clear();
       firstName.sendKeys(adminPojo.firstName);
       lastName.clear();
       lastName.sendKeys(adminPojo.lastName);
       saveButton.click();


    }

    public void SetViewButton(String userName) {
        String xpath = "//tr[@id='" + userName + "']/td[10]/div/a/span/span";
        WebElement clickView = Driver.getDriver().findElement(By.xpath(xpath));
        Driver.waitAndClick(clickView, 2);


    }

    public void SetEditButton(String userName) {
        String xpath = "//tr[@id='" + userName + "']/td[10]/div/a[2]/span/span";
        WebElement clickEdit = Driver.getDriver().findElement(By.xpath(xpath));
        Driver.waitAndClick(clickEdit, 2);



    }
    public void SetDeleteButton(String Name) {
        String xpath = "//tr[@id='" + Name + "']/td[10]/div/a[3]/span/span";
        WebElement clickFirstDelete = Driver.getDriver().findElement(By.xpath(xpath));
        Driver.waitAndClick(clickFirstDelete, 2);



    }
    public void SetSecondDeleteButton(String name) {
        String xpath = "//tr[@id='"+name+"']/td[4]/button";
        WebElement clickSecondDelete = Driver.getDriver().findElement(By.xpath(xpath));
        Driver.waitAndClick(clickSecondDelete, 5);



    }


    public List<String> UserInfoTable() {

        List<String> infoTable = new ArrayList<String>();

        for (int i = 0; i < userInfo.size(); i++) {
            infoTable.add(userInfo.get(i).getText());

        }
        return infoTable;

    }

    public String getAlertText() {

        Driver.wait(5);
        return alertMessage.getText();
    }

    public void clickActivationText(String message) {
        String xpath = "//tr[@id='" + message + "']/td/button/span";
        WebElement activation = Driver.getDriver().findElement(By.xpath(xpath));
        Driver.waitAndClick(activation, 5);
    }


    public void navigateAdministration() {
        Driver.waitAndClick(adminMenu, 2);
        Driver.waitAndClick(userManagement, 2);
    }

    public void setSignIn() {

        Driver.waitAndClick(signInMenu, 2);
        Driver.waitAndClick(firstSingIn, 1);
        Driver.waitAndSendText(userName, ConfigurationReader.getProperty("adminUserName"), 2);
        Driver.waitAndSendText(password, ConfigurationReader.getProperty("adminPassword"), 2);
        Driver.waitAndClick(secondSignIn, 2);

    }

}