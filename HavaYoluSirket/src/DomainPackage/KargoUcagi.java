package DomainPackage;

public class KargoUcagi extends Ucak {
	private float kargoKapasitesi;

	public float getKargoKapasitesi() {
		return kargoKapasitesi;
	}

	public void setKargoKapasitesi(float kargoKapasitesi) {
		this.kargoKapasitesi = kargoKapasitesi;
	}
	
	public void ucakBilgiGir(float kargoKapasitesi,String ucakAdi,int ucakID,float agirlik){
		setUcakId(ucakID);
		setKargoKapasitesi(kargoKapasitesi);
		setAgirlik(agirlik);
		setUcakAdi(ucakAdi);
		
	}
	

}
