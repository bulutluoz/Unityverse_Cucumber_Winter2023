
@wip
Feature: US1003 Kullanici aradigi urunu bulabilmeli

  Scenario: TC07 Urun testi
    Given kullanici testotomasyonu anasayfaya gider
    When arama kutusuna shoes yazip aratir
    Then ilk urune click yapar
    And urun isminin shoes icerdigini test eder
    And sayfayi kapatir