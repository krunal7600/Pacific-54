package WebAppFunctions;

import PageObejcts.ForgotAndResetPassPageObjects;
import PageObejcts.LoginPageObjects;
import PageObejcts.SignUpPageObjects;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class WebAppFunctions {

    WebDriver driver;

    public WebAppFunctions(WebDriver remoteDriver) {
        driver = remoteDriver;
    }

    public void LoginSuccess() throws InterruptedException {
        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);

        loginPageObjects.LoginEmail.sendKeys("parekhkrunal@gmail.com");
        loginPageObjects.LoginPass.sendKeys("123456789012");
        Thread.sleep(3000);
        loginPageObjects.LoginButton.click();
    }

    public void LoginValidations() throws InterruptedException {
        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);

        loginPageObjects.LoginButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertTrue(loginPageObjects.LoginEmailUnfilledValidation.getText().equals("Please enter an email address."));
        Assert.assertTrue(loginPageObjects.LoginPassUnfilledValidation.getText().equals("Please enter a password."));
        Thread.sleep(3000);
        loginPageObjects.LoginEmail.sendKeys("krunalparekh");
        Assert.assertTrue(loginPageObjects.LoginEmailValidationMSG.getText().equals("Please enter a valid email address."));
        Thread.sleep(3000);

        loginPageObjects.LoginPass.sendKeys("1234567890");
        Assert.assertTrue(loginPageObjects.LoginPassValidation.getText().equals("Please enter a new password between 12 and 64 characters."));
        Thread.sleep(3000);

        loginPageObjects.LoginButton.click();

    }

    public void ForgotPasswordSuccess()
    {
        ForgotAndResetPassPageObjects forgotAndResetPassPageObjects = new ForgotAndResetPassPageObjects(driver);

        forgotAndResetPassPageObjects.ForgotPassword.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        forgotAndResetPassPageObjects.ResetPasswordEMAIL.sendKeys("parekhkrunal@gmail.com");
        forgotAndResetPassPageObjects.SendLinkButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        forgotAndResetPassPageObjects.ResetPasswordNEWPASSWORD.sendKeys("123456789012");
        forgotAndResetPassPageObjects.ResetPasswordCONFIRMPASSWORD.sendKeys("123456789012");
        forgotAndResetPassPageObjects.ConfirmButton.click();
    }

    public void ForgotPasswordValidation()
    {
        ForgotAndResetPassPageObjects forgotAndResetPassPageObjects = new ForgotAndResetPassPageObjects(driver);

        forgotAndResetPassPageObjects.ForgotPassword.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        forgotAndResetPassPageObjects.SendLinkButton.click();
        Assert.assertTrue(forgotAndResetPassPageObjects.ResetPassUnfilledEmailValidation.getText().equals("Please enter an email address."));
        forgotAndResetPassPageObjects.ResetPasswordEMAIL.sendKeys("parekhkrunal");
        Assert.assertTrue(forgotAndResetPassPageObjects.ResetPassEmailValidation.getText().equals("Please enter a valid email address."));
        forgotAndResetPassPageObjects.ResetPasswordEMAIL.sendKeys("parekhkrunal@gmail.com");
        forgotAndResetPassPageObjects.SendLinkButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        forgotAndResetPassPageObjects.ConfirmButton.click();
        Assert.assertTrue(forgotAndResetPassPageObjects.CreateNewPasswordUnfilledValidation.getText().equals("Please enter a new password."));
        Assert.assertTrue(forgotAndResetPassPageObjects.ConfirmPasswordUnfilledValidation.getText().equals("Please confirm your new password."));

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        forgotAndResetPassPageObjects.ResetPasswordNEWPASSWORD.sendKeys("1234567890");
        Assert.assertTrue(forgotAndResetPassPageObjects.CreateNewPasswordValidation.getText().equals("Please enter a new password between 12 and 64 characters."));
        forgotAndResetPassPageObjects.ResetPasswordCONFIRMPASSWORD.sendKeys("123456789");
        Assert.assertTrue(forgotAndResetPassPageObjects.ConfirmPasswordMATCHValidation.getText().equals("Passwords must match."));
    }

    public void SignUpSuccess() throws InterruptedException {
        SignUpPageObjects signUpPageObjects = new SignUpPageObjects(driver);

        signUpPageObjects.SignUpFormOpen.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        signUpPageObjects.FirstName.sendKeys("Krunal");
        signUpPageObjects.LastName.sendKeys("Parekh");
        signUpPageObjects.PhoneNumber.sendKeys("1234567890");
        signUpPageObjects.Email.sendKeys("parekhkruna@gmail.com");
        signUpPageObjects.Password.sendKeys("123456789012");
        signUpPageObjects.ConfirmPassword.sendKeys("123456789012");
        signUpPageObjects.AcceptTerms.click();
        Thread.sleep(3000);
        signUpPageObjects.SignUP.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        signUpPageObjects.OTPConfirmEmail.sendKeys("12345");
    }

    public void SignUpValidation()
    {
        SignUpPageObjects signUpPageObjects = new SignUpPageObjects(driver);

        signUpPageObjects.SignUpFormOpen.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        signUpPageObjects.SignUP.click();
        Assert.assertTrue(signUpPageObjects.FirstNameValidation.getText().equals("Please enter a first name."));
        Assert.assertTrue(signUpPageObjects.LastNameValidation.getText().equals("Please enter a last name."));
        Assert.assertTrue(signUpPageObjects.PhoneNumberValidation.getText().equals("Please enter a phone number."));

        Assert.assertTrue(signUpPageObjects.UnfilledEmailValidation.getText().equals("Please enter an email address."));
        signUpPageObjects.Email.sendKeys("krunalparekh");
        Assert.assertTrue(signUpPageObjects.EmailValidation.getText().equals("Please enter a valid email address."));

        Assert.assertTrue(signUpPageObjects.NewPasswordUnfilledValidation.getText().equals("Please enter a new password."));
        signUpPageObjects.Password.sendKeys("1234567890");
        Assert.assertTrue(signUpPageObjects.NewPasswordValidation.getText().equals("Please enter a new password between 12 and 64 characters."));

        Assert.assertTrue(signUpPageObjects.ConfirmPasswordUnfilledValidationForSignUP.getText().equals("Please confirm your new password."));
        signUpPageObjects.ConfirmPassword.sendKeys("123456789");
        Assert.assertTrue(signUpPageObjects.ConfirmPasswordMATCHValidationForSignUP.getText().equals("Passwords must match"));

        Assert.assertTrue(signUpPageObjects.AcceptTearmsValidation.getText().equals("You must agree with our terms and conditions."));
    }
}
