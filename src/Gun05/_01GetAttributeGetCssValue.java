package Gun05;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01GetAttributeGetCssValue extends BaseStaticDriver {
    public static void main(String[] args) {


        driver.get("https://www.snapdeal.com/");
        WebElement inputValEnter=driver.findElement(By.id("inputValEnter"));

        System.out.println(inputValEnter.getAttribute("name"));
        System.out.println(inputValEnter.getAttribute("type"));
        System.out.println(inputValEnter.getAttribute("class"));


        System.out.println(inputValEnter.getCssValue("color")); //stayles olan taraf
        System.out.println(inputValEnter.getCssValue("background"));
        System.out.println(inputValEnter.getCssValue("font-size"));
        System.out.println(inputValEnter.getCssValue("height"));















    }
}
