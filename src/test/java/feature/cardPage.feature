Feature: Amazon Card Page

  Scenario: Sepete Urun Ekleme

    Given Uygulama acilir
    When Arama cubuguna "Kitap" yazilir
    When Ara butonuna tiklanir
    When Urun filtrelenir
    When Ikıncı sayfaya gecis
    When Isme gore urun secme
    When Sepete ekleye tiklanir
    When Sepete gidilir
    When Urunun sepette oldugunu kontrol edilir
    Then Urun sepetten cikarilir
    When Urunun sepetten cikarildigi kontrol edilir
