package Gun04;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import org.junit.Assert;

public class _03_XpathSenaryo extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.saucedemo.com/");

        Bekle(1);
        WebElement usernameInput=driver.findElement(By.xpath("//input[@id='user-name']"));
        usernameInput.sendKeys("standard_user");
        Bekle(1);
        WebElement passwordInput=driver.findElement(By.xpath("//input[@id='password']"));
        passwordInput.sendKeys("secret_sauce");
        Bekle(1);
        WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();
        Bekle(1);
        WebElement BackpackElement=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        BackpackElement.click();
        Bekle(1);
        WebElement addToCart=driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']"));
        addToCart.click();
        Bekle(1);
        WebElement BackToProducts=driver.findElement(By.xpath("//button[text()='Back to products']"));
        BackToProducts.click();
        Bekle(1);




        WebElement boltTshirt=driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        boltTshirt.click();
        Bekle(1);
        WebElement addToCart2=driver.findElement(By.xpath("//*[@name='add-to-cart-sauce-labs-bolt-t-shirt']"));
        addToCart2.click();
        Bekle(1);
        WebElement sepet=driver.findElement(By.xpath("//*[@class='shopping_cart_link']"));
        sepet.click();
        Bekle(1);
        WebElement checkout=driver.findElement(By.xpath("//*[@id='checkout']"));
        checkout.click();
        Bekle(1);
        WebElement firstName=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstName.sendKeys("sema");
        Bekle(1);
        WebElement LastName=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        LastName.sendKeys("simsek");
        Bekle(1);
        WebElement zipcode=driver.findElement(By.xpath("//input[@name='postalCode']"));
        zipcode.sendKeys("12345");
        Bekle(1);
        WebElement btnContinue=driver.findElement(By.xpath("//input[@id='continue']"));
        btnContinue.click();


        double toplam=0;
        List<WebElement> ucretler=driver.findElements(By.xpath("//*[@class='inventory_item_price']"));
        for (WebElement e:ucretler) {
            System.out.println("e.getText() = " + e.getText());
            toplam += Double.parseDouble(e.getText().substring(1));

        }

        System.out.println("toplam = " + toplam);

        WebElement webaltToplam=driver.findElement(By.xpath("//*[@class='summary_subtotal_label']"));
        System.out.println(webaltToplam.getText());
        double altToplam=Double.parseDouble(webaltToplam.getText().substring(13));
        System.out.println("altToplam = " + altToplam);

        if (toplam==altToplam)
            System.out.println("test passed");

        else
            System.out.println("test failed");

        Assert.assertTrue(toplam==altToplam);

        BekleKapat();

    }
}
