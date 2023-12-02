
  Feature: US1007 Kullanici SauceDemo sayfasinda urun satin alir

    Scenario: TC14 Saucedemo sayfasinda sectigimiz urun sepete eklenmeli

      Given kullanici "sauceUrl" anasayfasina gider
      Then saucedemo username kutusuna "standard_user" yazar
      And saucedemo password kutusuna "secret_sauce" yazar
      Then saucedemo login tusuna basar
      And ilk urunun ismini kaydeder ve bu urunun sayfasina gider
      When saucedemo add to Cart butonuna basar
      Then saucedemo alisveris sepetine tiklar
      And sectigi urunun basarili olarak sepete eklendigini test eder
      And sayfayi kapatir
