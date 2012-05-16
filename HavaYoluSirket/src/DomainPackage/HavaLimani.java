package DomainPackage;

public class HavaLimani {
	private int havaLimaniId;
	private String sehir;
	private String havalimaniAdi;
	
	public HavaLimani(){
	}
	public HavaLimani(int havalimaniId){
		setHavaLimaniId(havalimaniId);
	}
	public String getHavalimaniAdi() {
		return havalimaniAdi;
	}
	public void setHavalimaniAdi(String havalimaniAdi) {
		this.havalimaniAdi = havalimaniAdi;
	}
	public int getHavaLimaniId() {
		return havaLimaniId;
	}
	public void setHavaLimaniId(int havaLimaniId) {
		this.havaLimaniId = havaLimaniId;
	}
	public String getSehir() {
		return sehir;
	}
	public void setSehir(String sehir) {
		this.sehir = sehir;
	}
	public void havalimaniBilgiGir(String havalimaniAdi,int havalimaniID,String sehir){
		setHavalimaniAdi(havalimaniAdi);
		setHavaLimaniId(havalimaniID);
		setSehir(sehir);
	}
	
}
