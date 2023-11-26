



  Feature: US1001 Testotomasyonu Arama Testi

    Scenario: TC01 Kullanici testotomasyonu sayfasinda arama yapabilmeli

      Given kullanici testotomasyonu anasayfaya gider
      When arama kutusuna phone yazip aratir
      Then arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir