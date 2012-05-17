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
import com.sun.jmx.remote.internal.ArrayQueue;
import java.util.ArrayList;
import java.util.List;

public class Register {

    private UcusOlustur ucusOlustur;
    private BiletSatis biletSatis;
    private SeferKatalog seferKatalog;
    private UcusKatalogu ucusKatalogu;
    private Ucus ucus;
    ;
    //UcusEkleme
    
    public void ucusOlusturBaslat(int yolcuUcakID, int seferID, int pilotID, int hostesID,
            String tarih, String saat, float businessKoltukFiyati, float ekonomikKoltukFiyati) {
        
        ucusOlustur = new UcusOlustur();

        YolcuUcagi yolcuUcagi = (YolcuUcagi) Facade.getInstance().get(yolcuUcakID, YolcuUcagi.class);
        Sefer sefer = (Sefer) Facade.getInstance().get(seferID, Sefer.class);
        Pilot pilot = (Pilot) Facade.getInstance().get(pilotID, Pilot.class);
        Hostes hostes = (Hostes) Facade.getInstance().get(hostesID, Hostes.class);

        ucusOlustur.ucusOlustur(yolcuUcagi, sefer, pilot, hostes, tarih, saat, businessKoltukFiyati, ekonomikKoltukFiyati);
    }

    //BiletSatis
    public void biletSatisBaslat() {
        biletSatis = new BiletSatis(ucusKatalogu);
    }

    public void ara(int baslangicID, int bitisID, String tarih, String saat) {
        getAllSefer();
        Sefer sefer = seferKatalog.getSeferList(baslangicID, bitisID);
        ucus = biletSatis.ara(sefer, tarih, saat);
    }
    
    public void bilgiAl(int musteriID, String koltukSinifi){
        Musteri musteri = (Musteri)Facade.getInstance().get(musteriID, Musteri.class);
        biletSatis.bilgiAl(musteri, koltukSinifi);
    }
    
    
    private List<Sefer> getAllSefer(){
        List<Object> list = Facade.getInstance().getAll(Sefer.class);
        seferKatalog = new SeferKatalog();
        for (Object object : list) {
            seferKatalog.addSefer((Sefer)object);
        }
        return seferKatalog.getSeferList();
        
    }
    
    private List<Ucus> getAllUcus(){
        List<Object> list = Facade.getInstance().getAll(Ucus.class);
        ucusKatalogu = new UcusKatalogu();
        for (Object object : list) {
            ucusKatalogu.addUcus((Ucus)object);
        }
        return ucusKatalogu.getUcusList();
    }
}
