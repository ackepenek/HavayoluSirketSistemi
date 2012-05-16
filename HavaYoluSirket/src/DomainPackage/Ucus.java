package DomainPackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ucus {
	private int ucusId;
	private YolcuUcagi ucak;
	private Sefer sefer;
	private Pilot pilot;
	private Hostes hostes;
	private Date ucusTarihi;

	private List<Koltuk> koltuklar = new ArrayList<Koltuk>();


	public Ucus(int ucusID) {
		this.ucusId = ucusID;
	}

	public Ucus() {

	}

	public List<Float> getFiyatList() {
		List<Float> fiyatList = new ArrayList<Float>();
		for (Koltuk k : koltuklar) {
			if (k.getClass().getName() == "DomainPackage.UcusEkonomikKoltuk") {
				fiyatList.add(k.getFiyat());
				break;
			}
		}

		for (Koltuk k : koltuklar) {
			if (k.getClass().getName() == "DomainPackage.UcusBusinessKoltuk") {
				fiyatList.add(k.getFiyat());
				break;
			}
		}

		return fiyatList;

	}



	public Date getUcusTarihi() {
		return ucusTarihi;
	}

	public void setUcusTarihi(Date ucusTarihi) {
		this.ucusTarihi = ucusTarihi;
	}

	public int getUcusId() {
		return ucusId;
	}

	public void setUcusId(int ucusId) {
		this.ucusId = ucusId;
	}

	public YolcuUcagi getUcak() {
		return ucak;
	}

	public void setUcak(YolcuUcagi ucak) {
		this.ucak = ucak;
		for (Koltuk k : ucak.getKoltukListesi()) {
			if (k.getClass().getName() == "DomainPackage.BusinessKoltuk") {
				BusinessKoltuk ubk = new BusinessKoltuk();
				ubk.setKoltukNo(k.getKoltukNo());
				this.koltuklar.add(ubk);
			} else if (k.getClass().getName() == "DomainPackage.EkonomikKoltuk") {
				EkonomikKoltuk uek = new EkonomikKoltuk();
				uek.setKoltukNo(k.getKoltukNo());
				this.koltuklar.add(uek);
			}
		}
	}

	public List<Koltuk> getKoltuklar() {
		return koltuklar;
	}

	public List<Koltuk> getUygunKoltuklar() {
		List<Koltuk> koltukListesi = new ArrayList<Koltuk>();
		for (Koltuk i : getKoltuklar())
			if (!i.isDoluMu())
				koltukListesi.add(i);

		return koltukListesi;
	}
	
	
	public Sefer getSefer() {
		return sefer;
	}

	public void setSefer(Sefer sefer) {
		this.sefer = sefer;
	}

	public Pilot getPilot() {
		return pilot;
	}

	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}

	public Hostes getHostes() {
		return hostes;
	}

	public void setHostes(Hostes hostes) {
		this.hostes = hostes;
	}

}
