/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DomainPackage.*;
import TechnicalServices.Facade;

/**
 *
 * @author serhat
 */
public class BiletSatis {

    private UcusKatalogu ucusKatalogu;
    private Ucus ucus;
    private Musteri musteri;
    private Bilet bilet;
    
    public BiletSatis(UcusKatalogu ucusKatalogu) {
        this.ucusKatalogu = ucusKatalogu;
    }

    public Ucus ara(Sefer sefer, String tarih, String saat) {
        for (Ucus ucus : ucusKatalogu.getUcusList()) {
            if (ucus.getSefer().getKalkisHavalimani().getHavaLimaniId() == sefer.getKalkisHavalimani().getHavaLimaniId()
                    && ucus.getSefer().getKalkisHavalimani().getHavaLimaniId() == sefer.getKalkisHavalimani().getHavaLimaniId()
                    &&ucus.getSaat().equals(saat) && ucus.getTarih().equals(tarih)) {
                ucus = ucus;
                return ucus;
            }
        }
        return null;
    }
    
    public void bilgiAl(Musteri musteri, String koltukSinifi){
        this.musteri = musteri;
        this.bilet = new Bilet();
        bilet.setMusteri(musteri);
        bilet.setKoltuSinifi(koltukSinifi);
        bilet.setUcus(ucus);
        
        Facade.getInstance().put(bilet, Bilet.class);
    }
}
