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
        int kivon = getAktualisEgyenleg() - osszeg;
        if (kivon < 0){
            return false;
        }else{
            return true;
        }
    }

    public void kamatJovairas(){

    }

}
