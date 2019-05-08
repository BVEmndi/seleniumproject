package LR1;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * Created by Dell on 07-04-2015.
 */
public class RegressionPack extends BaseTestpage {

String destination="France";
    //String Loginusername="tiru45@gmail.com",Loginpassword="admin123";
   // String RegistEmail="tiru45@gmail.com",RegistPassword="Passadmin123";

    public RegressionPack() {   super();}
        protected RegressionPack(WebDriver driver) {        super(driver);
        }
    @Test
    public void RP() {
        Searchpage src = new Searchpage(driver);
       src.search(destination);
      //  Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Hotels in France"));

       // Loginpage L= new Loginpage(driver);
      //  L.login(Loginusername,Loginpassword);

     //   Registrationpage R=new Registrationpage(driver);
      //  R.Regist(RegistEmail,RegistPassword);

    }
}