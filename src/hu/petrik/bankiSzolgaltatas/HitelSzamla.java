package hu.petrik.bankiSzolgaltatas;

public class HitelSzamla extends Szamla {

    private int hitelKeret;

    public HitelSzamla(Tulajdonos tulajdonos, int hitelKeret) {
        super(tulajdonos);
        this.hitelKeret = hitelKeret;
    }

    public int getHitelKeret() {
        return hitelKeret;
    }

    @Override
    public boolean kivesz(int osszeg){
        int kivon = super.getAktualisEgyenleg()-osszeg;

        if(kivon >= 0 - this.hitelKeret){
            super.aktualisEgyenleg -= osszeg;
            return true;
        }else{
            return false;
        }
    }

}
