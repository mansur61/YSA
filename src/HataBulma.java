import java.util.List;

public class HataBulma {

    public Cıkıs c;
    private Noron_toplama_fonksiyonu  n=new Noron_toplama_fonksiyonu();

    public HataBulma(){c=new Cıkıs();}

    private VeriSeti veriSeti=new VeriSeti();
    public double altsınır;
    public double ustsınır;
    public double durum=0.0;
    public int sayac1=0;
    public int sayac2=0;
    // NOT: altsınır ve ustsınır bize eşik değerini verir aslında teorik olarak..
    public void setUstsınır(double Usınır){this.ustsınır=Usınır;}
    public double getUsınır(){return ustsınır;}

   public void setAltsınır(double Asınr){this.altsınır=Asınr;}
   public double getAsınır(){return altsınır;}


    public void HataBulma(List<Integer> s, List<Double> c) {

        for(int i=0;i<s.size();i++){
            durum=(int)(s.get(i)-c.get(i));

            if(durum<0){
                durum=durum*(-1);

            }
            else{
                durum=durum*(+1);

            }

            if(getAsınır()<=durum || durum < getUsınır()){
                sayac1++;

            }
            else if(getAsınır() > durum || getUsınır()< durum){
                sayac2++;

            }


        }
        if(sayac1 > sayac2){
            //sistem eğitiildi.. sayac1 > sayac2 ,geldi..
            System.out.println(" sistem eğitiildi....");


        }else  if(sayac1 == sayac2){
           //sistem yarıyarıya öğrendi..yani %50 cevap verir.. tekrar geri besleme yap..sayac1 ==sayac2 ,geldi
           n.toplama(veriSeti.egitimveriseti,veriSeti.egitimveriseti.size(),"geri");
        }
        else{
            //sistem eğitilmedi .. geri besleme yap..
            System.out.println("Sistem eğitilmedi tekrar geri besleme yap");
            n.toplama(veriSeti.egitimveriseti,veriSeti.egitimveriseti.size(),"geri");


        }

    }

}
