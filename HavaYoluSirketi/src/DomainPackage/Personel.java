package DomainPackage;

import java.util.Date;

public abstract class Personel {

    private String adi;
    private String soyadi;
    private int personelID;
    private String dogumTarihi;

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public int getPersonelID() {
        return personelID;
    }

    public void setPersonelID(int personelID) {
        this.personelID = personelID;
    }


    public void pilotBilgiGir(String adi, String soyadi, String dogumTarihi, int personelID) {
        setAdi(adi);
        setSoyadi(soyadi);
        setDogumTarihi(dogumTarihi);
        setPersonelID(personelID);
    }
}
