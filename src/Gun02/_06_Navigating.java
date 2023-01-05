package Gun02;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06_Navigating extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        //Tarayıcının linklere tıklandığında gidip geldiği sayfaları
        //saklar ve aşağıdaki komutlarla ileri geri yönlendirilebilir.

        Bekle(2);
        WebElement element=driver.findElement(By.linkText("Alerts (JavaScript)"));
        element.click();
        Bekle(2);


        driver.navigate().back();
        Bekle(2);


        driver.navigate().forward();


        BekleKapat();











    }

}
