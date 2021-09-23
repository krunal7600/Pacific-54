package TestCases;

import Utilities.BaseClass;
import WebAppFunctions.WebAppFunctions;
import org.testng.annotations.Test;

public class SignUpTestCase extends BaseClass {

    @Test
    public void signUpSuccessTestCase() throws InterruptedException {
        WebAppFunctions webAppFunctions = new WebAppFunctions(webDriver);
        webAppFunctions.SignUpSuccess();
    }

    @Test
    public void signUpValidationTestCase()
    {
        WebAppFunctions webAppFunctions = new WebAppFunctions(webDriver);
        webAppFunctions.SignUpValidation();
    }
}
