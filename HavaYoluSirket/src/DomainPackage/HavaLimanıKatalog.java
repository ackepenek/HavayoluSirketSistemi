package DomainPackage;

import java.util.ArrayList;
import java.util.List;

public class HavaLimanıKatalog {
	private List<HavaLimani> havalimaniList = new ArrayList<HavaLimani>();

	public List<HavaLimani> getHavalimaniList() {
		return havalimaniList;
	}

	public void setHavalimaniList(List<HavaLimani> havalimaniList) {
		this.havalimaniList = havalimaniList;
	}
	
	public void addHavalimani(HavaLimani h){
		this.havalimaniList.add(h);
	}
}
