package Frame.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import static java.util.concurrent.TimeUnit.SECONDS;


public class Init {

    private static final String URL = "https://www.microsoft.com/en-us/";

    private static final long IMPLICIT_TIME = 5;

    /**web driver setup**/


    public void setUP() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(IMPLICIT_TIME, SECONDS);
        driver.manage().window().maximize();
    }

    /** Quit driver**/

    @AfterTest()
    public void teardown() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.quit();
    }
}
