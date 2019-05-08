package LR1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Dell on 07-04-2015.
 */
public class Searchpage extends Baseclasspage{

    public Searchpage(WebDriver driver)
    { super(driver);}

    public void search(String destination)
    {
        driver.findElement(By.id("txtSearch")).sendKeys(destination);
        // now selecting from the list of hotels starting with france name
        //driver.findElement(By.xpath("//div[@id='autocomplete']/ul/li[1]")); //*[@id='search-bar-form']/div[2]/button
    driver.findElement(By.xpath("//select[@name='d']")).sendKeys("Mon 15 Dec 2016");
        driver.findElement(By.xpath("//select[@name='n']")).sendKeys("1 Night");
        driver.findElement(By.xpath("//select[@name='rt-adult']")).sendKeys("3");
        driver.findElement(By.xpath("//select[@name='rt-child']")).sendKeys("2");
        /* Assert.assertEquals(date, "datepicker-switch"); */
       // html/body/section[5]/div[1]/div/form/div[7]/button
       // driver.findElement(By.xpath("html/body/section[5]/div[1]/div/form/div[7]/button")).click();
      driver.findElement(By.xpath("html/body/section[2]/div[1]/div/form/div[7]/button")).click();
       // Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Hotels in France"));
}

}
//.//*[@id='search-bar-form']/div[2]/button
    //    html/body/section[2]/div[1]/div/div/div/form/div[3]/div[1]/select