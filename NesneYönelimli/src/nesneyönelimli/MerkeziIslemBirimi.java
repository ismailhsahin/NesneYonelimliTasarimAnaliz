/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesneyönelimli;


import java.util.Scanner;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class MerkeziIslemBirimi {
    
    private static MerkeziIslemBirimi MIB;
    
    private MerkeziIslemBirimi(){
        
    }
    public static MerkeziIslemBirimi _MIB(){
        if(MIB == null)
            MIB = new MerkeziIslemBirimi();
        return MIB;
    }


        
    private KullaniciRepositoryPostgreSQL KullaniciRepository = new KullaniciRepositoryPostgreSQL();
    private AgArayüzü komut = new AgArayüzü();
    private Scanner girdi = new Scanner(System.in);
    private String kullaniciAdi;
    private String kullaniciSifre;
    private int secim  = 0;
    
    
        
    public void Dongu() throws Exception{  
        

        System.out.print("Kullanici Adi Giriniz :");
        kullaniciAdi = girdi.next();
        System.out.print("Sifrenizi Giriniz :");
        kullaniciSifre = girdi.next();
        
        if(KullaniciRepository.KullaniciSorgula(kullaniciAdi,kullaniciSifre)){
            
            while(secim != 4){
                System.out.println("1-)Sogutucuyu aç\n2-)Sogutucuyu kapat\n3-)Sıcaklık Göster\n4-)Çıkış");
                secim = girdi.nextInt();
                if(secim == 1){
                    komut.sogutucuAc();

                }
                else if(secim == 2){  
                    System.out.println(komut.sogutucuKapat());
                }
                else if(secim == 3){    
                    System.out.println(komut.SicaklikOkuyucu());
                }
                else if(secim == 4){
                    System.out.println("Çıkış yapıldı...");
                }
                else
                    System.out.println("Lütfen 1 ile 4 arasındaki sayıları kullanınız...");
            }
        }
        else
            System.out.println("Kayıtlı değilsiniz");
    }

    
}
