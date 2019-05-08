package LR1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Dell on 07-04-2015.
 */
public class BaseTestpage extends Baseclasspage {

    public BaseTestpage(WebDriver driver) {
        super(driver);
    }

    public BaseTestpage() {

    }

    @BeforeClass
        public static void startBrowser()
        {
            driver = new FirefoxDriver();
          //  driver.get("http://www.millar-bryce.com");
           driver.get("http://www.laterooms.com/en/r31_hotels-in-france.aspx?k=France&n=1&d=20160215&rt=2-0");          // driver.get("http://www.laterooms.com/");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
        @AfterClass
        public static void stopBrowser(){

               driver.quit();
        }
    }
