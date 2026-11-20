import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
 
 
     int tus;
     int bakiye=10000;
     int islem=0;
     int yatirma;
     int cekme;
     int basarilicekme=0;
     int basariliyatirma=0;
     int basarilitoplam=0;
     
              
 
 
     do {  System.out.println("-> MENU <-");
         System.out.println("Bakiye Goruntulemek icin -> 1");
         System.out.println("Para Yatirmak icin -> 2");
         System.out.println("Para Cekmek -> 3");
         System.out.println("Cikis yapmak icin -> 4");
         System.out.println("TIKLAYINIZ.");
         tus=sc.nextInt();
         if (tus==1) { System.out.println("Kullanici Bakiyesi : "+bakiye);
          islem++;
         }
         if (tus==2) { System.out.println("Kac TL yatırmak istediginizi giriniz:");
         yatirma=sc.nextInt();
             if (yatirma<0 || yatirma==0) { System.out.println("Gecerli bir sayı girmelisiniz!");
                 
             }
            
             else { System.out.println("Paraniz Yatiriliyor...");
             bakiye=bakiye+yatirma; 
                 System.out.println("Paraniz Yatirildi!");
                 basariliyatirma++;
             }
             islem++;
         }
 
         if (tus==3) { System.out.println("Kullanici Bakiyesi : "+bakiye);
             System.out.println("Kac TL cekmek istediginizi girin:");
         cekme=sc.nextInt();
             if (cekme>bakiye) { System.out.println(" !! Yetersiz Bakiye !!");
                 
             }
             if (cekme<=bakiye) { basarilicekme++;
                 System.out.println("Isleminiz yapilmistir. Paranizi Alabilirsiniz.");   
                 bakiye=bakiye-cekme;
             }
             islem++;
         }
         if (tus==4) { break;
             
         }
         if (tus>4) { System.out.println("!! Hata !! Gecerli bir tus giriniz.");}
       
       
       
       basarilitoplam=basarilicekme+basariliyatirma;
       
       
       
     }while(tus!=4); 
       
        System.out.println("Son bakiye: "+bakiye);
        System.out.println("Islem sayisi: "+islem);
        System.out.println("Cikis Yapiliyor...");
       
       

        scanner.close();
    }
}
