package hu.petrik.bankiSzolgaltatas;

public class MegtakaritasiSzamla extends Szamla{

    private double kamat;

    public static double alapKamat;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        alapKamat = this.kamat;
    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    public boolean kivesz (int osszeg){
        return false;
        //TODO: megcsinalni,hogy az egyenleg ne legyen 0-nál kisebb
    }

    public void kamatJovairas(){

    }

}
