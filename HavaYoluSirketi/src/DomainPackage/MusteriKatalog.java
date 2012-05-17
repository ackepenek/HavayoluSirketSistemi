package DomainPackage;

import java.util.ArrayList;
import java.util.List;

public class MusteriKatalog {
	private List<Musteri> musteriList = new ArrayList<Musteri>();

	public List<Musteri> getMusteriList() {
		return musteriList;
	}

	public void setMusteriList(List<Musteri> musteriList) {
		this.musteriList = musteriList;
	}
	
	public void addMusteri(Musteri m){
		this.musteriList.add(m);
	}
	
	public Musteri musteriGetir(int yolcuKimlikNo){
		for (Musteri musteri: getMusteriList()){
			if (musteri.getMusteriId() == yolcuKimlikNo)
				return musteri;
		}
		
		return null;
	}
}
