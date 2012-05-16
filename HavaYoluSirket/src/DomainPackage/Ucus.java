package DomainPackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ucus {
	private int ucusId;
	private Ucak ucak;
	private Sefer sefer;
	private Pilot pilot;
	private Hostes hostes;
	private Date ucusTarihi;
	
	
	private List<Koltuk> koltukListesi = new ArrayList<Koltuk>();

	
	
	public Ucus(int ucusID) {
		this.ucusId = ucusID;
	}
	
	public Ucus() {
		
	}

	public List<Koltuk> getKoltukListesi() {
		return koltukListesi;
	}

	public void setKoltukListesi(List<Koltuk> koltukListesi) {
		this.koltukListesi = koltukListesi;
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
	public Ucak getUcak() {
		return ucak;
	}
	public void setUcak(Ucak ucak) {
		this.ucak = ucak;
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
