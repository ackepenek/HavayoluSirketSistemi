/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author serhat
 */

import DomainPackage.*;
import TechnicalServices.Facade;

public class Register {

    private UcusOlustur ucusOlustur;

    ;
    //UcusEkleme
    
    public void ucusOlusturBaslat(int yolcuUcakID, int seferID, int pilotID, int hostesID,
            String tarih, String saat, float businessKoltukFiyati, float ekonomikKoltukFiyati) {
        ucusOlustur = new UcusOlustur();
        
        YolcuUcagi yolcuUcagi = (YolcuUcagi) Facade.getInstance().get(yolcuUcakID, YolcuUcagi.class);
        Sefer sefer = (Sefer) Facade.getInstance().get(seferID, Sefer.class);
        Pilot pilot = (Pilot) Facade.getInstance().get(pilotID, Pilot.class);
        Hostes hostes = (Hostes) Facade.getInstance().get(hostesID, Hostes.class);
    }
}
