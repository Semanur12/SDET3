package Gun04;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


/*

  Select class ı
  görünen text ile seçim için->selectByVisibleText
  Valueden seçim için ->selectByValue
  sırasından seçim için ->selecktByIndex


 */
public class _04_SelectClassGiris extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.amazon.com/");

        WebElement menu=driver.findElement(By.id("searchDropdownBox"));
        Select ddmenu=new Select(menu); //alt elemanlara gerek kalmıyor. görünen herşeyi alabiliyorsun.

        ddmenu.selectByVisibleText("Books");

        Bekle(1);
        WebElement srcbutton=driver.findElement(By.id("nav-search-submit-button"));
        srcbutton.click();

        String url=driver.getCurrentUrl(); //Url de amazon var mı varsa hata ver yoksa bişey yapma
        Assert.assertTrue(url.contains("amazon"));





        BekleKapat();



    }
}
