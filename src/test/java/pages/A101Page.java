package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class A101Page {
  public A101Page(){
      PageFactory.initElements(Driver.getDriver(),this);
  }

  @FindBy(xpath = "//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
  public WebElement cerezleriKabulEtButonu;

  @FindBy(xpath = "(//a[@title='GİYİM & AKSESUAR'])[1]")
  public WebElement giyimAksesuarButonu;

  @FindBy(xpath ="//a[@class='js-filter-link '][contains(text(),'Kadın İç Giyim')]" )
  public WebElement kadınİcGiyimButonu;

  @FindBy(xpath = "//a[@class='js-filter-link '][contains(text(),'Dizaltı Çorap')]")
  public WebElement dizAltıCorap;

  @FindBy(xpath = " //img[@alt='Penti Kadın 50 Denye Pantolon Çorabı Siyah']")
  public WebElement ilkUrunCorap;

  @FindBy(xpath = "//span[contains(text(),'SİYAH')]")
  public WebElement ilkUrunRenkSiyah;

  @FindBy(xpath = "//button[@class='add-to-basket button green block with-icon js-add-basket']")
  public WebElement sepeteEkleButonu;

  @FindBy(xpath = "//a[@title='Sepeti Görüntüle'][2]")
  public WebElement sepetiGoruntuleButonu;

  @FindBy(xpath = "//a[@class='button green checkout-button block js-checkout-button']")
  public WebElement sepetiOnaylaButonu;

  @FindBy(xpath = "//a[@title='ÜYE OLMADAN DEVAM ET']")
  public WebElement uyeOlmadanDevamEtButonu;

  @FindBy(xpath = "//input[@name='user_email']")
  public WebElement eMailEkranı;

  @FindBy(xpath = "//button[@class='button block green']")
  public WebElement devamEtButonu;

  @FindBy(xpath = "(//a[@title='Yeni adres oluştur'])[1]")
  public WebElement yeniAdresOlusturButonu;

  @FindBy(xpath = "//input[@name='title']")
  public WebElement adresBaslıgı;

  @FindBy(xpath = "//input[@name='first_name']")
  public WebElement adButonu;

  @FindBy(xpath = "//input[@name='last_name']")
  public WebElement soyadButonu;

  @FindBy(xpath = "//input[@name='phone_number']")
  public WebElement cepTelefonuButonu;

  @FindBy(xpath = "//select[@name='city']")
  public WebElement ilButonu;

  @FindBy(xpath = "//select[@name='township']")
  public WebElement ilceButonu;

  @FindBy(xpath = "//select[@name='district']")
  public WebElement mahalleButonu;

  @FindBy(xpath = "//textarea[@class='js-address-textarea']")
  public WebElement adresButonu;

  @FindBy(xpath = "//button[@class='button green address-modal-submit-button js-set-country js-prevent-emoji js-address-form-submit-button']")
  public WebElement kaydetButonu;

  @FindBy(xpath = "//button[@class='button block green js-proceed-button']")
  public WebElement kaydetVeDevamEt;

  @FindBy(xpath = "(//div[@class='radio'])[3]")
  public WebElement SendeoButton;

  @FindBy(xpath = "(//div[@class='radio'])[4]")
  public  WebElement MNGKargoButton;

  @FindBy(xpath = "//div[@class='payment-tab payment-tab-masterpass js-payment-tab active']")
  public WebElement kartİleOdemeTitle;

  @FindBy(xpath = "//span[@class='order-complete']")
  public WebElement siparisiTamamlaButonu;

  @FindBy(xpath = "(//span[@class='error'])[2]")
  public WebElement kartBilgisiGirinYazısı;

  @FindBy(xpath = "//div[@class='error js-error-user_email']")
  public WebElement geçersizEmailYazısı;

























}
