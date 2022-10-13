package hu.petrik.bankiSzolgaltatas;

public class Szamla extends BankiSzolgaltatas{

    protected int aktualisEgyenleg;

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
        Szamla sz = new Szamla(this.getTulajdonos());
        Kartya k = new Kartya(this.getTulajdonos(),sz,kartyaszam);

        return k;
    }

    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

}
