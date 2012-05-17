package DomainPackage;

public class Koltuk {
	private String koltukNo;
	private float fiyat;
	private boolean doluMu = false;
	
	public String getKoltukNo() {
		return koltukNo;
	}
	public void setKoltukNo(String koltukNo) {
		this.koltukNo = koltukNo;
	}
	public float getFiyat() {
		return fiyat;
	}
	public void setFiyat(float fiyat) {
		this.fiyat = fiyat;
	}
	public boolean isDoluMu() {
		return doluMu;
	}
	public void setDoluMu(boolean doluMu) {
		this.doluMu = doluMu;
	}

}
