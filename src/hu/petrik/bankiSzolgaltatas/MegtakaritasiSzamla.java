package hu.petrik.bankiSzolgaltatas;

public class MegtakaritasiSzamla extends Szamla{

    private double kamat;

    public static double alapKamat = 10;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        this.kamat = this.alapKamat;
    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    @Override
    public boolean kivesz (int osszeg){
        int kivon = super.getAktualisEgyenleg() - osszeg;
        if (kivon >= 0){
            return true;
        }else{
            return false;
        }
    }

    public void kamatJovairas(){
    super.aktualisEgyenleg = (int) (super.aktualisEgyenleg*(1+(this.kamat/100)));
    }

}
