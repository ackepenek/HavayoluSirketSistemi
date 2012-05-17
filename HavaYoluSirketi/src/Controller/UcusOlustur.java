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
public class UcusOlustur {

    public void ucusOlustur(YolcuUcagi yolcuUcagi, Sefer sefer, Pilot pilot, Hostes hostes, String tarih, String saat, float businessKoltukFiyati, float ekonomikKoltukFiyati) {
        Ucus ucus = new Ucus();
        ucus.setUcak(yolcuUcagi);
        ucus.setSefer(sefer);
        ucus.setPilot(pilot);
        ucus.setHostes(hostes);
        ucus.setSaat(saat);
        ucus.setTarih(tarih);
        ucus.setBusinessKoltukFiyati(businessKoltukFiyati);
        ucus.setEkonomikKoltukFiyati(ekonomikKoltukFiyati);
        
        Facade.getInstance().put(ucus, Ucus.class);
    }
    
}
