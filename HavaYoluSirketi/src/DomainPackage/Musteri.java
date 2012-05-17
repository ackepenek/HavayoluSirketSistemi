package DomainPackage;

import java.util.GregorianCalendar;

public class Musteri {
	private int musteriId;
	private String adi;
	private String soyadi;
	
	
	public int getMusteriId() {
		return musteriId;
	}
	public void setMusteriId(int musteriId) {
		this.musteriId = musteriId;
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
	public Musteri(int musteriID) {
		setMusteriId(musteriID);
	}
	
	public void musteriBilgiGir(String adi,String soyadi,GregorianCalendar dogumTarihi,int musteriID, int musteriTipi){
		setAdi(adi);
		setSoyadi(soyadi);
		setMusteriId(musteriID);
		
		
	}
	
	
}
