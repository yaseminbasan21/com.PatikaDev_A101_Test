Feature: Kullanıcı A101 web sitesine üye olmadan alışveriş yapabilir


  @Test1_PozitifSenaryo
  Scenario:Kullanıcı geçerli bir email ile alışverişini tamamlar
    Given Kullanıcı "a101Url" ana sayfasına gider
    Then Kullanıcı çerezleri kabul eder
    Then Kullanıcı Giyim & Aksesuar butonuna tıklar
    And Kullanıcı Kadın İç Giyim butonuna tıklar
    And Kullanıcı Dizaltı Çorap butonuna tıklar
    And Kullanıcı ilk ürüne tıklar
    And Kullanıcı ürün renginin SİYAH olduğunu doğrular
    And Kullanıcı Sepete ekle butonuna tıklar
    And Kullanıcı Sepeti Görüntüle butonuna tıklar
    And Kullanıcı Sepeti Onayla butonuna tıklar
    And Kullanıcı ÜYE OLMADAN DEVAM ET butonuna tıklar
    And Kullanıcı E-mail ekranını görür ve geçerli bir mail adresi girer
    And Kullanıcı Devam et butonuna tıklar
    And Kullanıcı Yeni adres oluştur butonuna tıklar
    And Kullanıcı gerekli bilgileri doldurur ve kaydet butonuna tıklar
    And Kullanıcı bir kargo firması seçer
    And Kullanıcı kaydet ve devam et butonuna tıklar
    And Kullanıcı ödeme ekranına gidildiğini doğrular
    And Kullanıcı Siparişi Tamamla butonuna tıklar
    And Kullanıcı Lütfen kart seçin veya kart bilgisi girin. yazısını görür
    And Kullanıcı sayfayı kapatır

    @Test2_NegatifSenaryo
    Scenario Outline:Kullanıcı geçersiz bir e-mail ile alışverişe devam edememelidir
    Given Kullanıcı "a101Url" ana sayfasına gider
    Then Kullanıcı çerezleri kabul eder
    Then Kullanıcı Giyim & Aksesuar butonuna tıklar
    And Kullanıcı Kadın İç Giyim butonuna tıklar
    And Kullanıcı Dizaltı Çorap butonuna tıklar
    And Kullanıcı ilk ürüne tıklar
    And Kullanıcı ürün renginin SİYAH olduğunu doğrular
    And Kullanıcı Sepete ekle butonuna tıklar
    And Kullanıcı Sepeti Görüntüle butonuna tıklar
    And Kullanıcı Sepeti Onayla butonuna tıklar
    And Kullanıcı ÜYE OLMADAN DEVAM ET butonuna tıklar
    And Kullanıcı E-mail ekranını görür ve geçersiz bir "<email>" girer
    And Kullanıcı Devam et butonuna tıklar
    And Kullanıcı Geçerli bir e-posta adresi girin. uyarısını görür ve alışverişe devam edemez
    And Kullanıcı sayfayı kapatır

      Examples:
      | email           |
      |yasemin@         |


