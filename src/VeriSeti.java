import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class VeriSeti
{
    protected Noron_toplama_fonksiyonu nöron;
    protected  int tut=0,a=0;
    public double sigmoid,fNet=0.0;
    private int verikumesiuzunlugu,satır_saysı;
    private int data;
    Random rnd=new Random();


    public void setSatır(int satır_saysı){this.satır_saysı=satır_saysı;}
    public int getSatır(){return satır_saysı;}

    public void setVeriuzunlugu(int verikumesiuzunlugu){this.verikumesiuzunlugu=verikumesiuzunlugu;}
    public int getVeriuzunlugu(){return verikumesiuzunlugu;}

    public void setVeriSetiOrnegi(int data){this.data=data;}
    public int getVeriSetiOrnegi(){return data;}

    public void setTestVeriOrnegi(int data){this.data=data;}
    public int getTestVeriOrnegi(){return data;}



    Scanner s=new Scanner(System.in);

   public  List<Integer> egitimveriseti=new ArrayList<Integer>();
   public  List<Integer> testveriseti=new ArrayList<Integer>();
   public  List<Integer> VeriKümesi=new ArrayList<Integer>();



    public List<Integer> getListDondur(List<Integer> v){

        return v;
    }

   public void VeriSetineVeriOrnegiEkle() {
       egitimveriseti.add(getVeriSetiOrnegi());

   }

    public void EgitimVeriSetiniGoster(){
        System.out.println("Eğitim Verisi ");
       for(int i=0;i<egitimveriseti.size();i++){
           System.out.print("  "+egitimveriseti.get(i));
           tut++;
           if(tut==(getSatır()+1)){
               tut=0;
               System.out.println();
           }
       }
    }
    public void TestVerisiOrnegiEkle(){
           testveriseti.add(getTestVeriOrnegi());
    }

    public void TestVerileriniGir(){

        for(int i=0;i<getSatır();i++){
                setTestVeriOrnegi(s.nextInt());
                TestVerisiOrnegiEkle();

        }

    }
    public void TestVerisiniGöster(){
        System.out.println("Test Verisi ");
        for(int i=0;i<testveriseti.size();i++){
            System.out.println(testveriseti.get(i));
        }
    }


   public void VeriKümesi(){
       System.out.println("Veri Kümesi");

       for(int i=0;i<egitimveriseti.size();i++){
           System.out.print("  "+egitimveriseti.get(i));
           tut++;
           if(tut==(getSatır()+1)){
               System.out.print("  "+testveriseti.get(a));
               a++;
               tut=0;
               System.out.println();
           }
       }

    }
    public int veriSetiUzunulugu(){

        return egitimveriseti.size();
    }

    public void VeriSetiElemenlarınıGir(){

        for(int i=0;i<getVeriuzunlugu();i++){
            setVeriSetiOrnegi(s.nextInt());
            VeriSetineVeriOrnegiEkle();
            if(i>=getVeriuzunlugu()-1){
                System.out.println("Eğitim verisini girdiniz..Şimdi Test verisini griniz");
                TestVerileriniGir();
            }
        }
    }

}
