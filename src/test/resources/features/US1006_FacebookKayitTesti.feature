Feature: US1006 Feyk bilgilerle facebook'a kayit yaptirma
  @wip
  Scenario: TC13 Kullanici Faker class'indan bilgilerle facebook'da kayit olusturur

    Given kullanici "facebookUrl" anasayfasina gider
    Then facebook cookies kabul eder
    And facebook'da yeni hesap olustur butonuna basar
    When Faker class'indan bilgilerle facebook kayit formunu doldurur
    Then 3 saniye bekler
    And facebook kayit ol tusuna basar
    Then 3 saniye bekler
    And sayfayi kapatir
