package LR1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Dell on 07-04-2015.
 */
public class Loginpage extends Baseclasspage{

    public Loginpage(WebDriver driver)
    {super(driver);}
    public void login(String Loginusername,String Loginpassword)
    {
        driver.findElement(By.id("login-username")).sendKeys(Loginusername);
        driver.findElement(By.id("login-password")).sendKeys(Loginpassword);
        driver.findElement(By.id("login-submit")).click();
    }



}
