package hu.petrik.bankiSzolgaltatas;

public class Kartya extends BankiSzolgaltatas{

    private Szamla szamla;
    private String kartyaSzam;

    Kartya(Tulajdonos tulajdonos, Szamla szamla, String kartyaSzam) {
        super(tulajdonos);
        this.szamla = szamla;
        this.kartyaSzam = kartyaSzam;
    }

    public String getKartyaSzam() {
        return kartyaSzam;
    }

    public boolean vasarlas(int osszeg){
        int kivon = this.szamla.aktualisEgyenleg;
        if(kivon >= osszeg){
            this.szamla.aktualisEgyenleg -= osszeg;
            return true;
        }else{
            return false;
        }
    }


}
