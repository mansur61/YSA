import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Noron {


    Cıkıs  cıkıs=new Cıkıs();
    protected int ata=0,tut=0;
    protected double  fNet=0.0 ,agırlık=0.0;
    protected int bias;
    public VeriSeti veriSeti=new VeriSeti();

    public void setBias(int bias){this.bias=bias; }
    public  int getBias(){return bias;}
    protected double sonuc_dizisi[];

}


