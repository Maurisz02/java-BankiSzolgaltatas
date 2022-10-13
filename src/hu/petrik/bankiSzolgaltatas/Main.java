package hu.petrik.bankiSzolgaltatas;

public class Main {

    public static void main(String[] args) {

        Bank b1 = new Bank();
        Tulajdonos t1 = new Tulajdonos("Maurisz");
        Tulajdonos t2 = new Tulajdonos("JambleBee");

        MegtakaritasiSzamla mSzamla = (MegtakaritasiSzamla) b1.szamlanyitas(t1,0);
        HitelSzamla hSzamla = (HitelSzamla) b1.szamlanyitas(t2, 30000);

        mSzamla.befizet(20000);
        hSzamla.befizet(40000);

        System.out.println(mSzamla.aktualisEgyenleg);
        System.out.println(hSzamla.aktualisEgyenleg);

        mSzamla.kamatJovairas();
        System.out.println(b1.getOsszegyenleg(t1));

    }
}
