package hu.petrik.bankiSzolgaltatas;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Szamla> szamlaLista;

    public Bank() {
        szamlaLista = new ArrayList<>();
    }

    public Szamla szamlanyitas(Tulajdonos tulajdonos, int hitelKeret){

        if(hitelKeret == 0){
            MegtakaritasiSzamla mSzamla = new MegtakaritasiSzamla(tulajdonos);
            szamlaLista.add(mSzamla);
            return mSzamla;
        }else{
            HitelSzamla hSzamla = new HitelSzamla(tulajdonos,hitelKeret);
            szamlaLista.add(hSzamla);
            return hSzamla;
        }

    }

    public int getOsszegyenleg(Tulajdonos tulajdonos){
        int ossz = 0;

        for(Szamla sz : szamlaLista){
            if(sz.getTulajdonos()==tulajdonos){
                ossz += sz.getAktualisEgyenleg();
            }
        }

        return ossz;
    }

    public Szamla getLegnagyobbEgyenleguSzamla(Tulajdonos tulajdonos){

        int index = 0;

        int max = szamlaLista.get(0).aktualisEgyenleg;

        for(int i = 1; i < szamlaLista.size(); i++){
            if (szamlaLista.get(i).aktualisEgyenleg > max){
                max = szamlaLista.get(i).aktualisEgyenleg;
                index = i;
            }
        }

        return szamlaLista.get(index);

    }

    public long getOsszhitelkeret(){

        long osszH = 0;

        for (Szamla sz : szamlaLista){
            if(sz instanceof HitelSzamla){
                osszH += ((HitelSzamla) sz).getHitelKeret();
            }
        }

        return osszH;

    }

}
