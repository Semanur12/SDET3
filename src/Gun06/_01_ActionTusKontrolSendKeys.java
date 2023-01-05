package Gun06;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionTusKontrolSendKeys extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demoqa.com/auto-complete");


        WebElement element=driver.findElement(By.id("autoCompleteSingleInput"));

        Actions aksiyonlar=new Actions(driver);


        Action aksiyon=aksiyonlar
                .moveToElement(element) //Kutucuğa gittim
                .click() //içine tıklattım
                .keyDown(Keys.SHIFT) //SHİFT tuşuna bastım
                .sendKeys("a") //küçük a harfini gönderdim fakat, shift basılı olduğu için A görülmeli
                .keyUp(Keys.SHIFT) //SHIFT tuşundan elimizi kaldırıyoruz.
                .sendKeys("hmet") //kalanı küçük harfle yazdım
                .build(); //oluşturdum


        Bekle(2);
        aksiyon.perform();

        Bekle(3);
        BekleKapat();

    }
}
