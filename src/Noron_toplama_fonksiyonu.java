import java.text.DecimalFormat;
import java.util.List;

public class Noron_toplama_fonksiyonu extends  Noron implements Toplama_fonksiyonu{


    public Noron_aktivasyon_fonksiyonu aktivasyon_fonksiyonu=new Noron_aktivasyon_fonksiyonu();
    public Noron_toplama_fonksiyonu(){}

    public void toplama(List<Integer> egitimverisi, int uzunluk, String path) {


        if(path=="ileri_besleme"){
            for(int i=0;i< egitimverisi.size();i++){
                agırlık=Math.random();
                fNet =fNet+(egitimverisi.get(i)*agırlık);
                tut++;
                if(tut==(uzunluk+1)){
                    tut=0;

                    System.out.println();
                    System.out.println("Fneet: "+new DecimalFormat().format(fNet));
                    aktivasyon_fonksiyonu.Sigmoid(fNet);
                    fNet=0;

                }
            }
        }else {
            System.out.println("Geri Besleme :)");
            for(int i=0;i< egitimverisi.size();i++){
                agırlık=Math.random();
                fNet =fNet+(egitimverisi.get(i)*agırlık);
                tut++;
                if(tut==(uzunluk+1)){
                    tut=0;

                    System.out.println();
                    System.out.println("Fneet: "+new DecimalFormat().format(fNet));
                    aktivasyon_fonksiyonu.Sigmoid(fNet);
                    fNet=0;

                }
            }

        }


    }

}
