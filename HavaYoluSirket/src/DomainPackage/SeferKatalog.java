package DomainPackage;

import java.util.ArrayList;
import java.util.List;

public class SeferKatalog {
	private List<Sefer> seferList = new ArrayList<Sefer>();

	public List<Sefer> getSeferList() {
		return seferList;
	}

	public void setSeferList(List<Sefer> seferList) {
		this.seferList = seferList;
	}
	
	public void addSefer(Sefer s){
		this.seferList.add(s);
	}

	public Sefer seferGetir(int seferID) {
		return this.getSeferList().get(seferID);
	}
}
