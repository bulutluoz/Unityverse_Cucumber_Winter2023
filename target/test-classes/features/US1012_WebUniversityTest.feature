Feature: Kullanici giris testi


  @wip
  Scenario:TC18 Yanlis bilgilerle giris yapilamamali

    Given kullanici "webUniUrl" anasayfasina gider
    Then login portal'a kadar asagi iner
    And login portal'a tiklar
    And 4 saniye bekler
    And diger window'a gecer
    When username ve password kutularina fake deger yazdirir
    Then login butonuna basar
    And Popup'ta cikan yazinin "validation failed" oldugunu test eder
    Then Ok diyerek Popup'i kapatir
    And Ilk sayfaya geri doner
    Then Ilk sayfaya donuldugunu test eder
    And sayfayi kapatir
