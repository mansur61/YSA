import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cıkıs {

    Scanner s=new Scanner(System.in);

    public List<Double> cıkıs_verileri=new ArrayList<Double>();

    private VeriSeti veriSeti=new VeriSeti();

    private double sonucu_al;
    private  double cıktı;
    public  int i=0,length;

    public void setSonucAl(double sonuc){this.cıktı=sonuc;}
    public double getSonucAl(){return cıktı;}

    public void Sonuc(double cıkıs){
       this.sonucu_al=cıkıs;
        //System.out.println("sonuc_al :"+ new DecimalFormat().format(sonucu_al));

    }

    public void CıkısVerilerim(int uzunluk){
        length=uzunluk;
        setSonucAl(s.nextDouble());//  (sonucu_al) değerlerini elle giriniz :)
                                    //fakat dinamik olarak ayarlanmalı :)

        Ekle();
    }
    public void Ekle(){
        if(cıkıs_verileri.size()<length){
            cıkıs_verileri.add(getSonucAl());
            CıkısVerilerim(length);
        }
    }




}







