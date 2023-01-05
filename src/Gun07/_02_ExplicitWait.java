package Gun07;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _02_ExplicitWait extends BaseStaticDriver {
    public static void main(String[] args) {


        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement btn=driver.findElement(By.cssSelector("[onclick='timedText()']"));
        btn.click();


        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
        //Bu locaterdaki eleman görünene kadar bekle.


        WebElement webDriverText=driver.findElement(By.xpath("//p[text()='WebDriver']"));
        System.out.println("webDriverText.getText() = " + webDriverText.getText());



        BekleKapat();












    }
}
