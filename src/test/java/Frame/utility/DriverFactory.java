package Frame.utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.apache.log4j.Logger.getLogger;

public class DriverFactory {
    private static Logger logger = getLogger(DriverFactory.class.getName());

    /** define browser **/
    public WebDriver getDriver(){

        /*
        String browser = System.getProperty("browser");
        if (browser == null)
            browser = "chrome";
            logger.info("# Webdriver instance for browser: " + browser);

        if (browser.equalsIgnoreCase("chrome"))
            return new ChromeDriver();
        else if (browser.equalsIgnoreCase("ie"))
            return new InternetExplorerDriver();
        else {
            return new FirefoxDriver();
        }*/
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

}
