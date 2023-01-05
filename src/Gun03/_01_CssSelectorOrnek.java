package Gun03;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelectorOrnek extends BaseStaticDriver {
    public static void main(String[] args) {


        driver.get("https://formsmarts.com/form/yu?mode=h5");


        Bekle(2);
        WebElement business=driver.findElement(By.cssSelector("[id$='4586_0']"));
        business.click();
        Bekle(2);
        WebElement dropDownDiscover=driver.findElement(By.cssSelector("[id='u_1fG_4588']"));
        dropDownDiscover.click();
        Bekle(2);
        WebElement optionOnlineAdvertising=driver.findElement(By.cssSelector("[value='Online Advertising']"));
        optionOnlineAdvertising.click();
        Bekle(2);
        WebElement buttonEveryDay=driver.findElement(By.cssSelector("[id='u_1fG_89585_0']"));
        buttonEveryDay.click();
        Bekle(2);
        WebElement goodRadio=driver.findElement(By.cssSelector("[type='radio'][value'Good']"));
        goodRadio.click();
        Bekle(2);
        WebElement howLongDropdown=driver.findElement(By.cssSelector("[id='u_1fG_4597']"));
        howLongDropdown.click();



        BekleKapat();

    }

}
//id için
//By.id("get-input");
//css Selector
//By.cssSelector("[id='get-input']");
//By.cssSelector("#get-input");