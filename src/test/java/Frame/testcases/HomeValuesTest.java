package Frame.testcases;

import Frame.pages.HomePage;
import Frame.utility.Init;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static java.util.concurrent.TimeUnit.SECONDS;


public class HomeValuesTest extends Init {
    HomePage homeValue;
    @BeforeTest
        public void setup(){
        super.setUP();
        homeValue = new HomePage(driver);

    }


    @Test
    public void TestValues(){
        HP.getTextOffice();
        //Assert.assertEquals(ActualValue,"Office");
    }

}
