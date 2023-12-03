
  Feature: US1008 Kullanici element gorununceye kadar bekler

    Scenario: TC15 Kullanici elementler gorunur oluncaya kadar bekleyebilmeli

      Given kullanici "heroUrl" anasayfasina gider
      When kullanici Add Element butonuna basar
      And Delete butonu’nun gorunur oldugunu test eder
      Then Delete tusuna basar
      And Add Remove Elements yazisinin gorunur oldugunu test eder
      And 2 saniye bekler
      And sayfayi kapatir
