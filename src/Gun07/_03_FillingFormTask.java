package Gun07;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _03_FillingFormTask extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demo.seleniumeasy.com/ajax-form-submit-demo.html");



        WebElement txtname=driver.findElement(By.name("title"));
        txtname.sendKeys("sema");


        WebElement comment=driver.findElement(By.id("description"));
        comment.sendKeys("Selenium");



        WebElement submit=driver.findElement(By.id("btn-submit"));
        submit.click();


        wait.until(ExpectedConditions.textToBe(By.id("submit-control"),"Form submited Successfully!"));

        WebElement mesaj=driver.findElement(By.id("submit-control"));
        Assert.assertEquals("Form submited Successfully!",mesaj.getText());




        BekleKapat();


    }
}
