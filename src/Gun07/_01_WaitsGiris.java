package Gun7;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class _01_WaitsGiris extends BaseStaticDriver {
    public static void main(String[] args) {


        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement btn=driver.findElement(By.cssSelector("[onclick='timedText()']"));
        btn.click();

        WebElement webDriverText=driver.findElement(By.xpath("//p[text()='WebDriver']"));

        BekleKapat();


    }
}
