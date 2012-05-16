package DomainPackage;

import java.util.ArrayList;
import java.util.List;

public class YolcuUcagi extends Ucak{
	private List<Koltuk> koltukListesi = new ArrayList<Koltuk>();

	public List<Koltuk> getKoltukListesi() {
		return koltukListesi;
	}

	public void setKoltukListesi(List<Koltuk> koltukListesi) {
		this.koltukListesi = koltukListesi;
	}
	
	
}
