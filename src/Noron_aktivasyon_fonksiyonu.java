

public class Noron_aktivasyon_fonksiyonu extends Noron implements Aktivasyon_fonksiyonu{

    //
    protected double sigmoid;
    public int indis=0;
    /*
    public Noron_aktivasyon_fonksiyonu(){

       // veriSeti=new VeriSeti();
        sonuc_dizisi=new double[5];
    }
*/

    @Override
    public  void Sigmoid(double Fnet) {

        //e=2,71
        sigmoid=1/(1+ Math.pow(2.71,Fnet));
        cıkıs.Sonuc(sigmoid);


    }

}