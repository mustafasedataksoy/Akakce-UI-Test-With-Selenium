package Akakce;

import Utulity.BaseDriver;
import Utulity.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;




public class AkakceSeleniumProjem extends BaseDriver {


    @Test

    public  void addNewAccount(){

        // Creating Account
        WebElement hesapAc=driver.findElement(By.cssSelector("div[id='H_rl_v8'] a:first-child"));
        hesapAc.click();

        WebElement ad=driver.findElement(By.id("rnufn"));
        ad.sendKeys("ismet");

        WebElement soyAd=driver.findElement(By.name("rnufs"));
        soyAd.sendKeys("bol");

        WebElement email=driver.findElement(By.id("rnufe1"));
        email.sendKeys("naci@gmail.com");


        WebElement reEmail=driver.findElement(By.name("rnufe2"));
        reEmail.sendKeys("naci@gmail.com");

        WebElement password=driver.findElement(By.id("rnufp1"));
        password.sendKeys("123456Is");

        WebElement rePassword=driver.findElement(By.id("rnufp2"));
        rePassword.sendKeys("123456Is");

        WebElement cinsiyet=driver.findElement(By.id("rngm"));
        cinsiyet.click();

        WebElement il=driver.findElement(By.cssSelector("select[id='locpr']"));
        Select dropDownMenu=new Select(il);
        dropDownMenu.selectByIndex(11);

        WebElement ilce=driver.findElement(By.cssSelector("select[id='locds']"));
        Select ddm=new Select(ilce);
        ddm.selectByVisibleText("Konyaaltı");

        Tools.Bekle(2);
        WebElement gun=driver.findElement(By.cssSelector("select[id='bd']"));
        Select dropDown=new Select(gun);
        dropDown.selectByIndex(8);


        Tools.Bekle(2);
        WebElement ay=driver.findElement(By.cssSelector("select[id='bm']"));
        Select dm=new Select(ay);
        dm.selectByIndex(7);

        Tools.Bekle(2);
        WebElement yil=driver.findElement(By.cssSelector("select[id='by']"));
        Select dd=new Select(yil);
        dd.selectByIndex(22);

        Tools.Bekle(2);
        WebElement kullanimSozlesme=driver.findElement(By.id("rnufpca"));
        kullanimSozlesme.click();

        Tools.Bekle(2);
        WebElement hesapAcButton=driver.findElement(By.cssSelector("input[id='rfb']"));
        hesapAcButton.click();

        // Verification Account
        WebElement VerificationMsg=driver.findElement(By.xpath("//a[text()='İsmet']"));
        Assert.assertEquals( "İsmet",VerificationMsg.getText());



        // Profil sayfanızı açınız ve Siparişlerim butonuna tıklayınız
        Tools.Bekle(2);
        WebElement ismetBtn=driver.findElement(By.xpath("//a[text()='İsmet']"));
        ismetBtn.click();

        Tools.Bekle(2);
        WebElement siparislerim=driver.findElement(By.linkText("Siparişlerim"));
        siparislerim.click();

        // Siparişinizin olmadığını doğrulayınız
        Tools.Bekle(2);
        WebElement verification=driver.findElement(By.xpath("//div[text()='Kayıtlı siparişiniz bulunmuyor.']"));
        Assert.assertTrue(verification.getText().equals("Kayıtlı siparişiniz bulunmuyor."));


        // Profil sayfanızı açınız ve Mesajlarım butonuna tıklayınız
        Tools.Bekle(2);
        WebElement ismetBtn2=driver.findElement(By.xpath("//a[text()='İsmet']"));
        ismetBtn2.click();

        Tools.Bekle(2);
        WebElement mesajlarim=driver.findElement(By.linkText("Mesajlarım"));
        mesajlarim.click();

        Tools.Bekle(2);
        // Mesajınızın olmadığını doğrulayınız
        WebElement verificationMessage=driver.findElement(By.xpath("//p[text()='Listelenecek mesaj bulunamadı.']"));
        Assert.assertTrue(verificationMessage.getText().contains("Listelenecek mesaj bulunamadı."));

        // Ana sayfaya tekrar dönün,
        WebElement akakceMainPage=driver.findElement(By.cssSelector("div[class='g-4_v8']>a"));
        akakceMainPage.click();

        // Hesabınızı siliniz.
        Tools.Bekle(2);
        WebElement ismetBtn3=driver.findElement(By.xpath("//a[text()='İsmet']"));
        ismetBtn3.click();

        Tools.Bekle(2);
        WebElement hesap=driver.findElement(By.cssSelector("a[id='H_a_v8'][title='Hesabım']"));
        hesap.click();

        Tools.Bekle(2);
        WebElement hesapSil=driver.findElement(By.linkText("Hesabımı Sil"));
        hesapSil.click();

        Tools.Bekle(2);
        WebElement sifre=driver.findElement(By.cssSelector("input[id='p']"));
        sifre.sendKeys("123456Is");

        Tools.Bekle(2);
        WebElement hesabımıSil=driver.findElement(By.cssSelector("input[id='u']"));
        hesabımıSil.click();




    }


}
