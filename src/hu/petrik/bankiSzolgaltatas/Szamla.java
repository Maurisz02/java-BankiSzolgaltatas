package hu.petrik.bankiSzolgaltatas;

public abstract class Szamla extends BankiSzolgaltatas{

    protected int aktualisEgyenleg;

    public Szamla(Tulajdonos tulajdonos){ super(tulajdonos); }

    public int getAktualisEgyenleg(){
        return this.aktualisEgyenleg;
    }

    public void befizet(int osszeg){
        this.aktualisEgyenleg += osszeg;
    }

    public boolean kivesz(int osszeg){
        return true;
    }

    public Kartya ujKartya(String kartyaszam){
        Kartya k = new Kartya(this.getTulajdonos(),this, kartyaszam);

        return k;
    }


}
