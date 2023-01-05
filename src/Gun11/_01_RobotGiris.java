package Gun11;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

/*
  Interview soruları

  1-Windows popupları nasıl kontrol edersiniz? -Robot Classla
  2-Dosya yükleme işlemini ne ile yaparsınız? -Robot Classla
 */

public class _01_RobotGiris extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {

        driver.get("https://demo.guru99.com/test/upload");

        Robot rbt=new Robot();

        for (int i=0;i<13;i++) { //2 kere tab ile OPEN butonuna ulaştık
            rbt.keyPress(KeyEvent.VK_TAB); //tuşa basıldı down
            rbt.keyRelease(KeyEvent.VK_TAB); //tuş bırakıldı up

            Bekle(2);

        }


        rbt.keyPress(KeyEvent.VK_ENTER); //tuşa basıldı down //Enter a bastık açılan pencere kapandı
        rbt.keyRelease(KeyEvent.VK_ENTER); //tuş bırakıldı up

            //CTRL+C
            //Stringi hafızaya-clipboard a kopyalama kodu
            // StringSelection stringSelection=new StringSelection("C:\\Users\\TechnoStudy\\Desktop\\ornek.txt");
            // Toolkit.getDefaultToolkit().getSystemClipboard().getContents(stringSelection , null);
            //Verilen stringi clipboard a set ediyor.

        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);  //Bu iki tuş şuan da basılmış vaziyette,hafızda ki yapıştırıldı

        Bekle(1);

        rbt.keyPress(KeyEvent.VK_CONTROL); // tuşlar serbest bırakıldı
        rbt.keyPress(KeyEvent.VK_V);



        for (int i=0;i<13;i++) {
            rbt.keyPress(KeyEvent.VK_TAB); //tuşa basıldı down
            rbt.keyRelease(KeyEvent.VK_TAB); //tuş bırakıldı up

            Bekle(2);

        }


        rbt.keyPress(KeyEvent.VK_ENTER); //tuşa basıldı down
        rbt.keyRelease(KeyEvent.VK_ENTER); //tuş bırakıldı up


        WebElement submitbutton=driver.findElement(By.id("submitbutton"));
        submitbutton.click();








        //  BekleKapat();




    }

}
