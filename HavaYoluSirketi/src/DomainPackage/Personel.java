package DomainPackage;

import java.util.Date;

public class Personel {
	private String adi;
	private String soyadi;
	private int personelID;
	private Date dogumTarihi;
	
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
	public Date getDogumTarihi() {
		return dogumTarihi;
	}
	public void setDogumTarihi(Date dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}
	public Personel(int personelID){
		setPersonelID(personelID);
	}
	public void pilotBilgiGir(String adi,String soyadi,Date dogumTarihi,int personelID){
		setAdi(adi);
		setSoyadi(soyadi);
		setDogumTarihi(dogumTarihi);
		setPersonelID(personelID);
	}
}
