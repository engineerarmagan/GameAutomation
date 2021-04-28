package GamePackage.GameTest;


import GamePackage.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage {
    public BasePage(){    PageFactory.initElements(Driver.get(),this);


    }
    @FindBy(xpath = "//div[@id='top-bar']")
    public WebElement levelText;

    @FindBy(xpath = "//button[normalize-space()='Restart']")
    public WebElement RestartButton;

    @FindBy(xpath = "//div[@id='yellow']")
    public WebElement YellowButton;

    @FindBy(xpath = "//div[@id='red']")
    public WebElement RedButton;

    @FindBy(xpath = "//div[@id='green']")
    public WebElement GreenButton;

    @FindBy(xpath = "//div[@id='middle']")
    public WebElement MiddleButton;

    @FindBy(xpath = "//div[@id='blue']")
    public WebElement BlueButton;

    @FindBy(xpath = "//span[@class='slider round']]")
    public WebElement StrictMode;

    @FindBy(xpath = "//div[@class='game-button']")
    public List<WebElement> GamePanel;


}
