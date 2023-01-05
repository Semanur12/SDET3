package Gun05;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;




public class _05_ActionClickTest extends BaseStaticDriver {
    public static void main(String[] args) {


        driver.get("https://demoqa.com/buttons");

        WebElement element=driver.findElement(By.xpath("//button[text()='Click Me']"));
        Bekle(2);
        Actions aksiyonlar=new Actions(driver);
        System.out.println("Aksiyon öncesi aksiyonlar sınıfı oluşturuldu.");

        Action aksiyon=aksiyonlar.moveToElement(element).click().build(); //Elementin üzerine git click i hazırla
        //build=hazırla
        System.out.println("Aksiyon hazırlandı.");

        Bekle(2);
        aksiyon.perform();
        System.out.println("Aksiyon gerçekleşti");













    }
}
