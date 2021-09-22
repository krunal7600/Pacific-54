package TestCases;

import Utilities.BaseClass;
import WebAppFunctions.WebAppFunctions;
import org.testng.annotations.Test;

public class ForgotAndResetPassTestCase extends BaseClass {

    @Test
    public void forgotAndResetPassSuccessTestCase()
    {
        WebAppFunctions webAppFunctions = new WebAppFunctions(webDriver);
        webAppFunctions.ForgotPasswordSuccess();
    }

    @Test
    public void forgotAndResetPassValidationTestCase()
    {
        WebAppFunctions webAppFunctions = new WebAppFunctions(webDriver);
        webAppFunctions.ForgotPasswordValidation();
    }
}
