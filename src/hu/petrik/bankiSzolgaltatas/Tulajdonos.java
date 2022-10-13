package hu.petrik.bankiSzolgaltatas;

public final class Tulajdonos {

    private String nev;

    Tulajdonos(String nev){
        this.nev = nev;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }
}
