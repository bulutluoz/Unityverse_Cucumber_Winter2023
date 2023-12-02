
Feature: US1002 Testotomasyonu Arama Testi

  Background:
    Given kullanici testotomasyonu anasayfaya gider


    @smoke
  Scenario: TC04 Kullanici testotomasyonu sayfasinda arama yapabilmeli
    When arama kutusuna phone yazip aratir
    Then arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir

      @e2e
  Scenario: TC05 Kullanici test otomasyonu sayfasinda shoes aratabilmeli
    When arama kutusuna shoes yazip aratir
    Then arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir


        @smoke @regression
  Scenario: TC06 Kullanici test otomasyonu sayfasinda dress aratabilmeli
    When arama kutusuna dress yazip aratir
    Then arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir