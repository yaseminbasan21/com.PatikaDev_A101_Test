package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.xmlbeans.SchemaTypeLoader;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.A101Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class A101StepDefinitions {
    A101Page a101Page=new A101Page();
    Faker faker=new Faker();


    @Given("Kullanıcı {string} ana sayfasına gider")
    public void kullanıcıAnaSayfasınaGider(String A101) {
        Driver.getDriver().get(ConfigReader.getProperty("a101Url"));
    }

    @Then("Kullanıcı çerezleri kabul eder")
    public void kullanıcıÇerezleriKabulEder() throws InterruptedException {
        a101Page.cerezleriKabulEtButonu.click();
        Thread.sleep(3000);
    }

    @Then("Kullanıcı Giyim & Aksesuar butonuna tıklar")
    public void kullanıcıGiyimAksesuarButonunaTıklar() {
        a101Page.giyimAksesuarButonu.click();
        ReusableMethods.waitFor(3);

    }

    @And("Kullanıcı Kadın İç Giyim butonuna tıklar")
    public void kullanıcıKadınİçGiyimButonunaTıklar() {
        a101Page.kadınİcGiyimButonu.click();
        ReusableMethods.waitFor(3);
    }

    @And("Kullanıcı Dizaltı Çorap butonuna tıklar")
    public void kullanıcıDizaltıÇorapButonunaTıklar() {
        a101Page.dizAltıCorap.click();
        ReusableMethods.waitFor(3);
    }

    @And("Kullanıcı ilk ürüne tıklar")
    public void kullanıcıIlkÜrüneTıklar() {
        a101Page.ilkUrunCorap.click();
        ReusableMethods.waitFor(3);
        
    }

    @And("Kullanıcı ürün renginin SİYAH olduğunu doğrular")
    public void kullanıcıÜrünRengininSİYAHOlduğunuDoğrular() {
        String expectedRenk="SİYAH";
        String actualRenk=a101Page.ilkUrunRenkSiyah.getText();
        Assert.assertEquals(expectedRenk,actualRenk);
        ReusableMethods.waitFor(3);

    }

    @And("Kullanıcı Sepete ekle butonuna tıklar")
    public void kullanıcıSepeteEkleButonunaTıklar() {
        a101Page.sepeteEkleButonu.click();
        ReusableMethods.waitFor(3);
    }

    @And("Kullanıcı Sepeti Görüntüle butonuna tıklar")
    public void kullanıcıSepetiGörüntüleButonunaTıklar() {
        a101Page.sepetiGoruntuleButonu.click();
        ReusableMethods.waitFor(3);
    }

    @And("Kullanıcı Sepeti Onayla butonuna tıklar")
    public void kullanıcıSepetiOnaylaButonunaTıklar() {
        a101Page.sepetiOnaylaButonu.click();
        ReusableMethods.waitFor(3);
    }

    @And("Kullanıcı ÜYE OLMADAN DEVAM ET butonuna tıklar")
    public void kullanıcıÜYEOLMADANDEVAMETButonunaTıklar() {
        a101Page.uyeOlmadanDevamEtButonu.click();
        ReusableMethods.waitFor(3);
    }

    @And("Kullanıcı E-mail ekranını görür ve geçerli bir mail adresi girer")
    public void kullanıcıEMailEkranınıGörürVeGeçerliBirMailAdresiGirer() {
        Assert.assertTrue(a101Page.eMailEkranı.isDisplayed());
        Driver.waitAndSendText(a101Page.eMailEkranı,faker.internet().emailAddress());
    }

    @And("Kullanıcı Devam et butonuna tıklar")
    public void kullanıcıDevamEtButonunaTıklar() {
        a101Page.devamEtButonu.click();
        ReusableMethods.waitFor(3);
    }

    @And("Kullanıcı Yeni adres oluştur butonuna tıklar")
    public void kullanıcıYeniAdresOluşturButonunaTıklar() {
        a101Page.yeniAdresOlusturButonu.click();
        ReusableMethods.waitFor(3);
    }

    @And("Kullanıcı gerekli bilgileri doldurur ve kaydet butonuna tıklar")
    public void kullanıcıGerekliBilgileriDoldururVeKaydetButonunaTıklar() {
        Driver.waitAndSendText(a101Page.adresBaslıgı,"Ev Adresi");
        Driver.waitAndSendText(a101Page.adButonu,faker.name().firstName());
        Driver.waitAndSendText(a101Page.soyadButonu,faker.name().lastName());
        Driver.waitAndSendText(a101Page.cepTelefonuButonu,faker.number().digits(10));

        Select il=new Select(a101Page.ilButonu);
        ReusableMethods.selectRandomTextFromDropdown(il);
        ReusableMethods.waitFor(3);

        Select ilce=new Select(a101Page.ilceButonu);
        ReusableMethods.selectRandomTextFromDropdown(ilce);
        ReusableMethods.waitFor(3);

        Select mahalle=new Select(a101Page.mahalleButonu);
        ReusableMethods.selectRandomTextFromDropdown(mahalle);
        ReusableMethods.waitFor(3);

        Driver.waitAndSendText(a101Page.adresButonu,faker.address().fullAddress());
        ReusableMethods.waitFor(3);
        a101Page.kaydetButonu.click();
        ReusableMethods.waitFor(3);
    }

    @And("Kullanıcı bir kargo firması seçer")
    public void kullanıcıBirKargoFirmasıSeçer() {
       a101Page.MNGKargoButton.click();
       ReusableMethods.waitFor(3);
    }

    @And("Kullanıcı kaydet ve devam et butonuna tıklar")
    public void kullanıcıKaydetVeDevamEtButonunaTıklar() {
        a101Page.kaydetVeDevamEt.click();
        ReusableMethods.waitFor(3);
    }

    @And("Kullanıcı ödeme ekranına gidildiğini doğrular")
    public void kullanıcıÖdemeEkranınaGidildiğiniDoğrular() {
        Assert.assertTrue(a101Page.kartİleOdemeTitle.isDisplayed());
        String expextedUrl="https://www.a101.com.tr/orders/checkout/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expextedUrl,actualUrl);
    }

    @And("Kullanıcı Siparişi Tamamla butonuna tıklar")
    public void kullanıcıSiparişiTamamlaButonunaTıklar() {
        a101Page.siparisiTamamlaButonu.click();
        ReusableMethods.waitFor(3);
    }

    @And("Kullanıcı Lütfen kart seçin veya kart bilgisi girin. yazısını görür")
    public void kullanıcıLütfenKartSeçinVeyaKartBilgisiGirinYazısınıGörür() {
        Assert.assertTrue(a101Page.kartBilgisiGirinYazısı.isDisplayed());
    }

    @And("Kullanıcı sayfayı kapatır")
    public void kullanıcıSayfayıKapatır() {
        Driver.closeDriver();
    }


    @And("Kullanıcı E-mail ekranını görür ve geçersiz bir {string} girer")
    public void kullanıcıEMailEkranınıGörürVeGeçersizBirGirer(String email) {
        Assert.assertTrue(a101Page.eMailEkranı.isDisplayed());
        a101Page.eMailEkranı.sendKeys(email);
        ReusableMethods.waitFor(3);
    }

    @And("Kullanıcı Geçerli bir e-posta adresi girin. uyarısını görür ve alışverişe devam edemez")
    public void kullanıcıGeçerliBirEPostaAdresiGirinUyarısınıGörürVeAlışverişeDevamEdemez() {
        Assert.assertTrue(a101Page.geçersizEmailYazısı.isDisplayed());
    }
}
