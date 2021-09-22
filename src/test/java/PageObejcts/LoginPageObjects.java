package PageObejcts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
    WebDriver webDriver;

    public LoginPageObjects(WebDriver webDriver)
    {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    ///////////////////////////////THIS OBJECTS ONLY FOR THE LOGIN PAGE OF PACIFIC54 PROJECT////////////////////////////

    @FindBy(xpath = "//input[@name='email']")
    public WebElement LoginEmail;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement LoginPass;

    @FindBy(xpath = "//div[contains(text(),'email')]")
    public WebElement LoginEmailUnfilledValidation;

    @FindBy(xpath = "//div[contains(text(),'email')]")
    public WebElement LoginEmailValidationMSG;

    @FindBy(xpath = "//div[contains(text(),'password')]")
    public WebElement LoginPassUnfilledValidation;

    @FindBy(xpath = "//div[contains(text(),'password')]")
    public WebElement LoginPassValidation;

    @FindBy(xpath = "//input[@class='jss4']")
    public WebElement LoginKeepMeSignedInCHECKBOX;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    public WebElement LoginButton;

    }
