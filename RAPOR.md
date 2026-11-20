# Rapor

**Ad Soyad:** Merza Züleyha Kulus
**Numara:** 690

## 1. Algoritma Açıklaması
Basit atm simulasyonudur. Kullanicidan tus girmesini isteyip bakiye goruntuleme,para cekme,para yatirma ve cikis islemlerini yapar ve hesaplamalari yapar. Kullanici ekrana cikis icin olan 4 tusuna basana kadar programi surdurur. İslemler bittiginde cikis yaparken ekrana islem sayisi ve bakiyeyi gosterir.

## 2. Girdi - İşlem - Çıktı

**Girdiler:**
 tus - cekme/yatirma 

**İşlemler:**
para cekme (bakiye-cekme) para yatirma( bakiye+yatirma) bakiye goruntuleme,islem sayisi 

**Çıktılar:**
bakiye , islem sayisi , hata mesaji , sonuc mesaji , son bakiye

## 3. Sözde Kod (Pseudocode)

```
1. basla
2. bakiye = 10000, islem = 0, tus, yatirma, cekme, basarilicekme = 0, basariliyatirma = 0, basarilitoplam = 0 yap
3. menuyu ekrana yaz (1 bakiye, 2 yatirma, 3 cekme, 4 cikis)
4. tusu gir
5. tus 1 ise bakiyeyi yaz ve islemi 1 artir
6. tus 2 ise kac tl yatirilacagini sor ve yatirma degerini gir
7. yatirma 0 veya kucukse gecerli sayi girin yaz degilse bakiyeye ekle, para yatirildi yaz, basariliyatirma 1 artir
8. tus 2 ise islemi 1 artir
9. tus 3 ise bakiyeyi goster, kac tl cekilecegini sor ve cekme degerini gir
10. cekme bakiyeden buyukse yetersiz bakiye yaz
11. cekme bakiyeden kucuk veya esitse basarilicekme 1 artir, paranizi alabilirsiniz yaz, bakiyeden dus
12. tus 3 ise islemi 1 artir
13. tus 4 ise 17. adima git
14. tus 4 ten buyukse hata gecerli tus girin yaz
15. basarilitoplam = basarilicekme + basariliyatirma yap
16. tus 4 degilse 3. adima geri don
17. son bakiyeyi, islem sayisini ve cikis yapiliyor yaz
18. bitir

```

## 4. Akış Şeması

![Akış Şeması](docs/akis-semasi.png)

## 5. Test Senaryoları (en az 8)


| No | Yapılan işlem / girdi | Beklenen sonuç | Programın sonucu | Doğru mu? |
|---|---|---|---|---|
| 1 | 1 , 2 - 200, 4 | bakiye:10000 paraniz yatirildi son bakiye:10200 islem sayisi:2 | aynisi | evet |
| 2 | 1 3 - 20000,4 | bakiye:10000 !yetersizbakiye! sonbakiye 10000 islem sayisi:2 | aynisi | evet |
| 3 | 2 - 500 ,3- 10500 4 | para yatirildi,bakiye 10500 cekildi paraniz bakiye:0 islem:3 | aynisi | evet |
| 4 | 5, 4 | hata gecerli bir tus giriniz son bakiye:10000 islem sayisi:0 | aynisi | evet |
| 5 | 2 - 0, 4 | gecerli bir sayi girmelisiniz son bakiye:10000 islem sayisi:1 | aynisi | evet |
| 6 | 4 | son bakiye:10000 islem sayisi:0 cikis yapiliyor | aynisi | evet |
| 7 | 3 - 15000, 4 | bakiye:10000 yetersiz bakiye son bakiye:10000 islem sayisi:1 | aynisi | evet |
| 8 | 2 - 1000, 3 - 4000, 1, 4 | paraniz yatirildi paranizi alabilirsiniz bakiye:7000 son bakiye:7000 islem sayisi:3 | aynisi | evet |

