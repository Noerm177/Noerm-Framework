package Frame.pages;

import Frame.utility.Init;
//import internetFrame.utility.ServicesMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import java.util.List;


public class HomePage {
    public WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Locates

    @FindBy(how= How.CSS, using = "#shellmenu_1")
    public WebElement officeText;

    @FindBy(id = "shellmenu_2")
    WebElement winText;

    @FindBy(id = "shellmenu_3")
    WebElement surfaceText;

    @FindBy(id = "shellmenu_4")
    WebElement xboxText;

    @FindBy(id = "shellmenu_5")
    WebElement dealsText;

    @FindBy(id = "l1_support")
    WebElement supportText;



    public void getTextOffice() {
         officeText.getAttribute("innerHTML");
    }

    public String getWinText(){
        return  winText.getAttribute("innerHTML");
    }

    public String getSurfaceText(){
        return  surfaceText.getAttribute("innerHTML");
    }

    public String getXboxText(){
        return  xboxText.getAttribute("innerHTML");
    }

    public String getDealsText(){
        return  dealsText.getAttribute("innerHTML");
    }

    public String getSupportText(){
        return  supportText.getAttribute("innerHTML");
    }


}

