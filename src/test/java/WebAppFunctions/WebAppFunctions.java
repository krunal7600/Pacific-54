package WebAppFunctions;

import PageObejcts.ForgotAndResetPassPageObjects;
import PageObejcts.LoginPageObjects;
import PageObejcts.SignUpPageObjects;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.SplittableRandom;
import java.util.concurrent.TimeUnit;

public class WebAppFunctions {

    WebDriver driver;

    public WebAppFunctions(WebDriver remoteDriver) {
        driver = remoteDriver;
    }

    public void LoginSuccess()
    {
        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);

        loginPageObjects.LoginEmail.sendKeys("parekhkrunal@gmail.com");
        loginPageObjects.LoginPass.sendKeys("123456789012");
        loginPageObjects.LoginButton.click();
    }

    public void LoginValidations()
    {
        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);

        loginPageObjects.LoginButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String unfilledEmail = loginPageObjects.LoginEmailUnfilledValidation.getText();
        String unfilledPass = loginPageObjects.LoginPassUnfilledValidation.getText();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPageObjects.LoginEmail.sendKeys("krunalparekh");
        String invalidEmail = loginPageObjects.LoginEmailValidationMSG.getText();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPageObjects.LoginPass.sendKeys("1234567890");
        String invalidPass = loginPageObjects.LoginPassValidation.getText();

        System.out.println(unfilledEmail + unfilledPass + invalidEmail + invalidPass);

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
        String unfilledEmail = forgotAndResetPassPageObjects.ResetPassUnfilledEmailValidation.getText();
        forgotAndResetPassPageObjects.ResetPasswordEMAIL.sendKeys("parekhkrunal");
        String invalidEmail = forgotAndResetPassPageObjects.ResetPassEmailValidation.getText();
        forgotAndResetPassPageObjects.ResetPasswordEMAIL.sendKeys("parekhkrunal@gmail.com");
        forgotAndResetPassPageObjects.SendLinkButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        forgotAndResetPassPageObjects.ConfirmButton.click();
        String unfilledNewPass = forgotAndResetPassPageObjects.CreateNewPasswordUnfilledValidation.getText();
        String unfilledConfirmPass = forgotAndResetPassPageObjects.ConfirmPasswordUnfilledValidation.getText();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        forgotAndResetPassPageObjects.ResetPasswordNEWPASSWORD.sendKeys("1234567890");
        String invalidNewPass = forgotAndResetPassPageObjects.CreateNewPasswordValidation.getText();
        forgotAndResetPassPageObjects.ResetPasswordCONFIRMPASSWORD.sendKeys("123456789");
        String invaliConfirmPass = forgotAndResetPassPageObjects.ConfirmPasswordMATCHValidation.getText();

        System.out.println(unfilledEmail + invalidEmail + unfilledNewPass + unfilledConfirmPass + invalidNewPass + invaliConfirmPass);

    }

    public void SignUpSuccess()
    {
        SignUpPageObjects signUpPageObjects = new SignUpPageObjects(driver);

        signUpPageObjects.SignUpFormOpen.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        signUpPageObjects.FirstName.sendKeys("Krunal");
        signUpPageObjects.LastName.sendKeys("Parekh'");
        signUpPageObjects.PhoneNumber.sendKeys("1234567890");
        signUpPageObjects.Email.sendKeys("parekhkruna@gmail.com");
        signUpPageObjects.Password.sendKeys("123456789012");
        signUpPageObjects.ConfirmPassword.sendKeys("123456789012");
        signUpPageObjects.AcceptTerms.click();
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
        String unfilledFirstname = signUpPageObjects.FirstNameValidation.getText();
        //String unfilledLastName = signUpPageObjects.LastNameValidation.getText();
        String unfilledPhoneNumber = signUpPageObjects.PhoneNumberValidation.getText();

        String unfilledEmail = signUpPageObjects.UnfilledEmailValidation.getText();
        signUpPageObjects.Email.sendKeys("krunalparekh");
        String invalidEmail = signUpPageObjects.EmailValidation.getText();

        String unfilledPassword = signUpPageObjects.NewPasswordUnfilledValidation.getText();
        signUpPageObjects.Password.sendKeys("1234567890");
        String invalidPassword = signUpPageObjects.NewPasswordValidation.getText();

        String unfilledConfirmPassword = signUpPageObjects.ConfirmPasswordUnfilledValidationForSignUP.getText();
        signUpPageObjects.ConfirmPassword.sendKeys("123456789");
        String invalidConfirmPassword = signUpPageObjects.ConfirmPasswordMATCHValidationForSignUP.getText();

        String unfilledTearmCondition = signUpPageObjects.AcceptTearmsValidation.getText();
        System.out.println(unfilledFirstname + /*unfilledLastName +*/ unfilledPhoneNumber + unfilledEmail + invalidEmail + unfilledPassword + invalidPassword + unfilledConfirmPassword + invalidConfirmPassword + unfilledTearmCondition);

        Assert.assertTrue(unfilledFirstname.equals("Please enter a first name."));
        Assert.assertTrue(signUpPageObjects.LastNameValidation.getText().equals("Please enter a last name."));
    }
}
