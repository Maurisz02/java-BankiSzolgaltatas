package hu.petrik.bankiSzolgaltatas;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Szamla> szamlaLista = new ArrayList<>();

    public Bank(List<Szamla> szamlaLista) {
        this.szamlaLista = szamlaLista;
    }

    public Szamla szamlanyitas(Tulajdonos tulajdonos, int hitelKeret){

    }

    public int getOsszegyenleg(Tulajdonos tulajdonos){

    }

    public Szamla getLegnagyobbEgyenleguSzamla(Tulajdonos tulajdonos){

    }

    public long getOsszhitelkeret(){

    }

}
