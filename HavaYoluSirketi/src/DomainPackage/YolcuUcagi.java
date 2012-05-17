package DomainPackage;

import java.util.ArrayList;
import java.util.List;

public class YolcuUcagi extends Ucak {

    private List<Koltuk> koltukListesi = new ArrayList<Koltuk>();
    private int ekonomikKoltukSayisi;
    private int businessKoltukSayisi;

    public int getBusinessKoltukSayisi() {
        return businessKoltukSayisi;
    }

    public void setBusinessKoltukSayisi(int businessKoltukSayisi) {
        this.businessKoltukSayisi = businessKoltukSayisi;
    }

    public int getEkonomikKoltukSayisi() {
        return ekonomikKoltukSayisi;
    }

    public void setEkonomikKoltukSayisi(int ekonomikKoltukSayisi) {
        this.ekonomikKoltukSayisi = ekonomikKoltukSayisi;
    }

    public List<Koltuk> getKoltukListesi() {
        return koltukListesi;
    }

    public void setKoltukListesi(List<Koltuk> koltukListesi) {
        this.koltukListesi = koltukListesi;
    }

    public int getKoltukSayisi() {
        return koltukListesi.size();
    }

    public boolean businessKoltukEkle(int miktar) {
        int curKoltukSayisi = this.getKoltukSayisi();

        if (miktar % 6 == 0) {
            for (int i = curKoltukSayisi; i < (miktar + curKoltukSayisi); i++) {
                BusinessKoltuk koltuk = new BusinessKoltuk();

                koltukListesi.add(koltuk);
                if (((koltukListesi.size() - 1) % 6) == 0) {
                    koltuk.setKoltukNo(((int) (this.getKoltukSayisi() / 7) + 1) + "A");
                } else if (((koltukListesi.size() - 1) % 6) == 1) {
                    koltuk.setKoltukNo(((int) (this.getKoltukSayisi() / 7) + 1) + "B");
                } else if (((koltukListesi.size() - 1) % 6) == 2) {
                    koltuk.setKoltukNo(((int) (this.getKoltukSayisi() / 7) + 1) + "C");
                } else if (((koltukListesi.size() - 1) % 6) == 3) {
                    koltuk.setKoltukNo(((int) (this.getKoltukSayisi() / 7) + 1) + "D");
                } else if (((koltukListesi.size() - 1) % 6) == 4) {
                    koltuk.setKoltukNo(((int) (this.getKoltukSayisi() / 7) + 1) + "E");
                } else if (((koltukListesi.size() - 1) % 6) == 5) {
                    koltuk.setKoltukNo(((int) (this.getKoltukSayisi() / 7) + 1) + "F");
                }
            }
            return true;
        } else {
            return false;
        }

    }

    public boolean ekonomikKoltukEkle(int miktar) {
        int curKoltukSayisi = this.getKoltukSayisi();
        if (miktar % 6 == 0) {
            for (int i = curKoltukSayisi; i < (miktar + curKoltukSayisi); i++) {
                EkonomikKoltuk koltuk = new EkonomikKoltuk();
                koltukListesi.add(koltuk);
                if (((koltukListesi.size() - 1) % 6) == 0) {
                    koltuk.setKoltukNo(((int) (this.getKoltukSayisi() / 7) + 1) + "A");
                } else if (((koltukListesi.size() - 1) % 6) == 1) {
                    koltuk.setKoltukNo(((int) (this.getKoltukSayisi() / 7) + 1) + "B");
                } else if (((koltukListesi.size() - 1) % 6) == 2) {
                    koltuk.setKoltukNo(((int) (this.getKoltukSayisi() / 7) + 1) + "C");
                } else if (((koltukListesi.size() - 1) % 6) == 3) {
                    koltuk.setKoltukNo(((int) (this.getKoltukSayisi() / 7) + 1) + "D");
                } else if (((koltukListesi.size() - 1) % 6) == 4) {
                    koltuk.setKoltukNo(((int) (this.getKoltukSayisi() / 7) + 1) + "E");
                } else if (((koltukListesi.size() - 1) % 6) == 5) {
                    koltuk.setKoltukNo(((int) (this.getKoltukSayisi() / 7) + 1) + "F");
                }
            }
            return true;

        } else {
            return false;
        }

    }

    public int getYolcuUcakBusinessKoltukSayisi() {
        int businessKoltuk = 0;
        for (Koltuk k : (this.getKoltukListesi())) {
            if (k.getClass().getName().equals("DomainPackage.BusinessKoltuk")) {
                businessKoltuk++;
            }

        }

        return businessKoltuk;
    }

    public int getYolcuUcakEkonomikKoltukSayisi() {
        int ekonomikKoltuk = 0;
        for (Koltuk k : (this.getKoltukListesi())) {
            if (k.getClass().getName().equals("DomainPackage.EkonomikKoltuk")) {
                ekonomikKoltuk++;
            }

        }

        return ekonomikKoltuk;
    }
}
