package DomainPackage;

public class Sefer {
	private int seferID;
	private HavaLimani kalkisHavalimani;
	private HavaLimani inisHavalimani;
	private String seferAdi;
	
	public Sefer(){
	}

	public int getSeferID() {
		return seferID;
	}
	public void setSeferID(int seferID) {
		this.seferID = seferID;
	}
	public HavaLimani getKalkisHavalimani() {
		return kalkisHavalimani;
	}
	public void setKalkisHavalimani(HavaLimani kalkisHavalimani) {
		this.kalkisHavalimani = kalkisHavalimani;
	}
	public HavaLimani getInisHavalimani() {
		return inisHavalimani;
	}
	public void setInisHavalimani(HavaLimani inisHavalimani) {
		this.inisHavalimani = inisHavalimani;
	}
	public String getSeferAdi() {
		return seferAdi;
	}
	public void setSeferAdi(String seferAdi) {
		this.seferAdi = seferAdi;
	}
	
}
