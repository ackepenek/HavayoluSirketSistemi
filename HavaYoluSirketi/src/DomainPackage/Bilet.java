package DomainPackage;

public class Bilet {

    private int biletId;
    private Ucus ucus;
    private Musteri musteri;
    private String koltuSinifi;

    public String getKoltuSinifi() {
        return koltuSinifi;
    }

    public void setKoltuSinifi(String koltuSinifi) {
        this.koltuSinifi = koltuSinifi;
    }

    public Bilet(int biletID) {
        this.setBiletId(biletID);
    }

    public Bilet() {
    }

    public int getBiletId() {
        return biletId;
    }

    public void setBiletId(int biletId) {
        this.biletId = biletId;
    }

    public Ucus getUcus() {
        return ucus;
    }

    public void setUcus(Ucus ucus) {
        this.ucus = ucus;
    }

    public Musteri getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }
}
