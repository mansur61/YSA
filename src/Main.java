import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static VeriSeti veriSeti;
    private static Cıkıs cıkıs;
    private static Noron_toplama_fonksiyonu noron;

    private static  int cıkısVerileriUzunuluguBelirle=0;

    public void VeriKümesiIslemleri(){
        veriSeti.setVeriuzunlugu(30);
        veriSeti.setSatır(5);// Not: Veri Seti ile tam bölünebilen satır sayısı giriniz ki veri seti kümesini
                             //   düzgün görünüz..
        veriSeti.VeriSetiElemenlarınıGir();
        veriSeti.EgitimVeriSetiniGoster();
        veriSeti.TestVerisiniGöster();
        veriSeti.VeriKümesi();
    }

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        HataBulma hata=new HataBulma();
        Main m=new Main();
        Noron_aktivasyon_fonksiyonu ak=new Noron_aktivasyon_fonksiyonu();
        veriSeti=new VeriSeti();
        cıkıs =new Cıkıs();
        noron=new Noron_toplama_fonksiyonu();
        m.VeriKümesiIslemleri();

        hata.setAltsınır(0.0); //alt sınır
        hata.setUstsınır(0.5); // üst sınır
                                // altsınır ve üst sınır bizim eşik snırımız oluyor diyebiliriz..


        noron.toplama(veriSeti.getListDondur(veriSeti.egitimveriseti),veriSeti.getSatır(),"ileri_besleme");
        cıkısVerileriUzunuluguBelirle=veriSeti.testveriseti.size();
       cıkıs.CıkısVerilerim(cıkısVerileriUzunuluguBelirle);

     hata.HataBulma(veriSeti.testveriseti,cıkıs.cıkıs_verileri);// HataBulma class ına ait



    }
}
