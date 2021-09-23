package PageObejcts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnBoardingPageObjects {

    WebDriver webDriver;

    public OnBoardingPageObjects(WebDriver webDriver)
    {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    ///////////////////////////////THIS OBJECTS ONLY FOR THE ONBOARDING PAGE OF PACIFIC54 PROJECT///////////////////////

    @FindBy(xpath = "//div[contains(text(),'Please choose at least a location before continuing.')]")
    public WebElement PopUpErrorMSG;

    @FindBy(xpath = "//button[@class='Toastify__close-button Toastify__close-button--light']")
    public WebElement PopUpErrorMSGCancel;
}
