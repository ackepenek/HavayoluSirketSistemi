package DomainPackage;

import java.util.ArrayList;
import java.util.List;

public class BiletKatalog {
	private List<Bilet> biletListesi = new ArrayList<Bilet>();

	public List<Bilet> getBiletListesi() {
		return biletListesi;
	}

	public void setBiletListesi(List<Bilet> biletListesi) {
		this.biletListesi = biletListesi;
	}
	

}
