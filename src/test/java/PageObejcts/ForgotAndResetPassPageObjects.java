package PageObejcts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotAndResetPassPageObjects {

    WebDriver webDriver;

    public ForgotAndResetPassPageObjects(WebDriver webDriver)
    {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    //////////////////////////THIS OBJECTS ONLY FOR THE FORGOT PASSWORD AND RESET NEW PASSWORD//////////////////////////

    @FindBy(xpath = "//a[@class='forgot-link']")
    public WebElement ForgotPassword;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement ResetPasswordEMAIL;

    @FindBy(xpath = "//div[contains(text(),'email')]")
    public WebElement ResetPassUnfilledEmailValidation;

    @FindBy(xpath = "//div[contains(text(),'email')]")
    public WebElement ResetPassEmailValidation;

    @FindBy(xpath = "//button[contains(text(),'Send Link')]")
    public WebElement SendLinkButton;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement ResetPasswordNEWPASSWORD;

    @FindBy(xpath = "//div[contains(text(),'enter a new password')]")
    public WebElement CreateNewPasswordUnfilledValidation;

    @FindBy(xpath = "//div[contains(text(),'12')]")
    public WebElement CreateNewPasswordValidation;

    @FindBy(xpath = "//input[@name='confirmPassword']")
    public WebElement ResetPasswordCONFIRMPASSWORD;

    @FindBy(xpath = "//div[contains(text(),'confirm your new password')]")
    public WebElement ConfirmPasswordUnfilledValidation;

    @FindBy(xpath = "//div[contains(text(),'match')]")
    public WebElement ConfirmPasswordMATCHValidation;

    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    public WebElement ConfirmButton;
}
