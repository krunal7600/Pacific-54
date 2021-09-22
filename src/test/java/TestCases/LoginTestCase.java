package TestCases;

import Utilities.BaseClass;
import WebAppFunctions.WebAppFunctions;
import org.testng.annotations.Test;

public class LoginTestCase extends BaseClass {

    @Test
    public void loginSuccessTestCase()
    {
        WebAppFunctions webAppFunctions = new WebAppFunctions(webDriver);
        webAppFunctions.LoginSuccess();
    }

    @Test
    public void loginValidationTestCase()
    {
        WebAppFunctions webAppFunctions = new WebAppFunctions(webDriver);
        webAppFunctions.LoginValidations();
    }
}
