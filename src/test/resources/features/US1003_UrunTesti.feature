

Feature: US1003 Kullanici aradigi urunu bulabilmeli

  Scenario: TC07 shoes arama testi
    Given kullanici testotomasyonu anasayfaya gider
    When arama kutusuna shoes yazip aratir
    Then ilk urune click yapar
    And urun isminin shoes icerdigini test eder
    And sayfayi kapatir

  @wip
  Scenario:  TC08 men dress arama testi
    Given kullanici testotomasyonu anasayfaya gider
    When arama kutusuna "baby" yazip aratir
    Then ilk urune click yapar
    And urun isminin "baby" icerdigini test eder
    And sayfayi kapatir