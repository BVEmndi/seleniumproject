package LR1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Dell on 07-04-2015.
 */
public class Registrationpage extends Baseclasspage{

    public Registrationpage(WebDriver driver)
    { super(driver);}


    public void Regist(String RegistEmail,String RegistPassword)
    {
        driver.findElement(By.id("reg-email")).sendKeys(RegistEmail);
        driver.findElement(By.id("reg-pwd1")).sendKeys(RegistPassword);
        driver.findElement(By.id("reg-tnc")).isSelected();
        driver.findElement(By.id("register-submit")).click();
    }
}
