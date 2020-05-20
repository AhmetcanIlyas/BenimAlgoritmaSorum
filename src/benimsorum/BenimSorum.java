/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package benimsorum;
/**
 *
 * @author ahmet
 */
import java.util.Scanner;

class cıktı {
    
    public double a;
    public double x;
    public double y (){
    return x*a;   
    }
    
    

}
public class BenimSorum {
   
    private static double sonuc;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner klavye = new Scanner(System.in); 
        int a, i, secim=0;
        System.out.println("Bir Sayi Dizisi Oluşturalim");
        System.out.println("Dizide Kac Tane Sayi Olsun? ");
        a = klavye.nextInt();
        System.out.println("Dizi Sayilarini Yazmaya Baslayalim");
        int dizi[] = new int[a];
        for(i=0; i<=a-1; i++){
        System.out.println(i+1 + ". sayiyi giriniz");
        dizi[i] = klavye.nextInt();
        }
        System.out.println("Toplama - 1 \nCıkartma - 2 \nCarpma - 3 \nBolme - 4 \nAritmetik Ortalama - 5");
        System.out.println("Olusturdugumuz Dizinin Elemanlarina Hangi Islemi Yapalim Sec?");

        secim = klavye.nextInt();
        if(secim>5){
            for (;secim>=5;) {
                    System.out.println("Hatali Secim! Tekrar Giriniz");
                    secim = klavye.nextInt();
                    }
        }
        switch (secim){
            
            case 1 :
                for( double son : dizi) {
                sonuc = sonuc+son;
                }
                System.out.println("Dizi Elemanlarının Toplamı:"+sonuc);    
                break;
            
            case 2 :
                for( double son : dizi) {
                sonuc = sonuc-son;
                }
                System.out.println("Dizi Elemanlarının Farkı:"+sonuc);    
                break;
            
            case 3 :
                sonuc=1;
                for( double son : dizi) {
                sonuc = sonuc*son;
                }
                System.out.println("Dizi Elemanlarının Carpımı:"+sonuc);    
                break;
            
            case 4 :
                sonuc=1;
                for( double son : dizi) {
                sonuc = sonuc/son;
                }
                System.out.println("Dizi Elemanlarının 1'e Bolumu"+sonuc);    
                break;
            
            case 5 :
                for( double son : dizi) {
                sonuc = sonuc+son;
                }
                double aritOrt=sonuc/a;
                System.out.println("Dizi Elemanlarının Aritmetik Ortalamasi:"+aritOrt);    
                break;
            
            default : 
                System.out.println("Hatali Secim Yaptin!!!");

                    
            break;
        }
        
        System.out.println("Simdi Baska Birsey Yapalim Bir Sayı Gir");
        double x=klavye.nextDouble();
        cıktı Cıktı=new cıktı();
        Cıktı.x=x;
        Cıktı.a=a;
        System.out.println("Elimizdeki Dizinin Eleman Sayısının Girdiğin Sayi Ile Carpimi : " + Cıktı.y());
    }
    
    
}
