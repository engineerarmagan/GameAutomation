package GamePackage.Test;


import GamePackage.GameTest.BasePage;
import org.jsoup.Connection;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class GameTest extends TestBase {

    @Test
    public void TestCase1() throws IOException, InterruptedException {
        List<WebElement> AllElement=new BasePage().GamePanel;
        BasePage basePage= new BasePage();
        System.out.println("basePage.GreenButton.getCssValue(\"background-color\") = " + basePage.GreenButton.getCssValue("background-color"));

        for (WebElement item : AllElement) {
            System.out.println("item.getAttribute(\"class\") = " + item.getAttribute("class"));
            String rgbFormat = item.getCssValue("background-color");
            System.out.println("rgbFormat = " + rgbFormat);
            if(item.getCssValue("background-color").contains("51")){
                System.out.println("item.getAttribute(\"class\") = " + item.getAttribute("class"));
                basePage.MiddleButton.click();
                Thread.sleep(4000);
            }
            if(item.getCssValue("background-color").contains("250")){
                System.out.println("item.getAttribute(\"class\") = " + item.getAttribute("class"));
                basePage.YellowButton.click();
                Thread.sleep(4000);
            }if(item.getCssValue("background-color").contains("192")){
                System.out.println("item.getAttribute(\"class\") = " + item.getAttribute("class"));
                basePage.BlueButton.click();
                Thread.sleep(4000);
            }if(item.getCssValue("background-color").contains("78")){
                System.out.println("item.getAttribute(\"class\") = " + item.getAttribute("class"));
                basePage.RedButton.click();
                Thread.sleep(4000);
            }if(item.getCssValue("background-color").contains("89")){
                System.out.println("item.getAttribute(\"class\") = " + item.getAttribute("class"));
                basePage.GreenButton.click();
                Thread.sleep(4000);
            }

        }








    }
}
