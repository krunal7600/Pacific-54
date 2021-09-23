package PageObejcts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPageObjects {

    WebDriver webDriver;

    public SignUpPageObjects(WebDriver webDriver)
    {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    ///////////////////////////THIS OBJECTS ONLY FOR THE SIGNUP PAGE OF PACIFIC54 PROJECT///////////////////////////////

    @FindBy(xpath = "//a[contains(text(),'Sign Up')]")
    public WebElement SignUpFormOpen;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement FirstName;

    @FindBy(xpath = "//div[contains(text(),'first name')]")
    public WebElement FirstNameValidation;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement LastName;

    @FindBy(xpath = "//div[contains(text(),'last name')]")
    public WebElement LastNameValidation;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement PhoneNumber;

    @FindBy(xpath = "//div[contains(text(),'phone number')]")
    public WebElement PhoneNumberValidation;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement Email;

    @FindBy(xpath = "//div[contains(text(),'email')]")
    public WebElement UnfilledEmailValidation;

    @FindBy(xpath = "//div[contains(text(),'email')]")
    public WebElement EmailValidation;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement Password;

    @FindBy(xpath = "//div[contains(text(),'enter a new password')]")
    public WebElement NewPasswordUnfilledValidation;

    @FindBy(xpath = "//div[contains(text(),'12')]")
    public WebElement NewPasswordValidation;

    @FindBy(xpath = "//input[@name='confirmPassword']")
    public WebElement ConfirmPassword;

    @FindBy(xpath = "//div[contains(text(),'confirm your new password')]")
    public WebElement ConfirmPasswordUnfilledValidationForSignUP;

    @FindBy(xpath = "//div[contains(text(),'match')]")
    public WebElement ConfirmPasswordMATCHValidationForSignUP;

    @FindBy(xpath = "//input[@name='acceptTerms']")
    public WebElement AcceptTerms;

    @FindBy(xpath = "//div[contains(text(),'You must agree with our terms and conditions.')]")
    public WebElement AcceptTearmsValidation;

    @FindBy(xpath = "//button[contains(text(),'Sign Up')]")
    public WebElement SignUP;

    @FindBy(xpath = "//li[@class='form-otp']/div/div/input")
    public WebElement OTPConfirmEmail;

    @FindBy(xpath = "//button[contains(text(),'Verify my email & continue')]")
    public WebElement VerifyEmailANDContinue;

    @FindBy(xpath = "//input[@id='customized-hook-demo']")
    public WebElement abc;

    @FindBy(xpath = "//input[@id='customized-hook-demo']//ul[contain(text(),'Dictum nulla sea')]")
    public WebElement abc1;
}
