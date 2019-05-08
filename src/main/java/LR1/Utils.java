package LR1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

/**
 * Created by Dell on 07-04-2015.
 */
  public class Utils extends Baseclasspage {

    public Utils(WebDriver driver) {
        super(driver);
    }

    public static int generateRandomNo() {
        Random r1 = new Random();
        int randomNumber = r1.nextInt();
        return randomNumber;
    }

    public static boolean isTextPresent(String text) {
        System.out.println("text=[" + text + "]");
        System.out.println("text=[" + text + "]");
        return driver.findElement(By.tagName("body")).getText().contains(text);

    }

    public static void selectFromDropDown(By by, String text) {
        Select sel = new Select(driver.findElement(by));
        sel.selectByVisibleText(text);
    }
}
