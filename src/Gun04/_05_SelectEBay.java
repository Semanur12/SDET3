package Gun04;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _05_SelectEBay extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.ebay.com/");


        WebElement ddmenu=driver.findElement(By.id("gh-cat"));
        Select menu=new Select(ddmenu);

        menu.selectByValue("14339");

        Bekle(1);
        WebElement searchBtn=driver.findElement(By.id("gh-btn"));
        searchBtn.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("ebay"));


        BekleKapat();

    }
}
