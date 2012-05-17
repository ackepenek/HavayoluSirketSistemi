package DomainPackage;

public class Ucak {
	private int ucakID;
	private String ucakAdi;
	private float agirlik;
	

	public Ucak(){
	}

	public Ucak(int ucakID){
		setUcakID(ucakID);
	}
	
	
	public int getUcakID() {
		return ucakID;
	}
	public void setUcakID(int ucakID) {
		this.ucakID = ucakID;
	}
	public String getUcakAdi() {
		return ucakAdi;
	}
	public void setUcakAdi(String ucakAdi) {
		this.ucakAdi = ucakAdi;
	}
	public float getAgirlik() {
		return agirlik;
	}
	public void setAgirlik(float agirlik) {
		this.agirlik = agirlik;
	}
	
}
