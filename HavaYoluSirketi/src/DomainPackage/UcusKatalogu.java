package DomainPackage;
import java.util.ArrayList;
import java.util.List;


public class UcusKatalogu {
	private List<Ucus> ucusList = new ArrayList<Ucus>();

	public List<Ucus> getUcusList() {
		return ucusList;
	}

	public void setUcusList(List<Ucus> ucusList) {
		this.ucusList = ucusList;
	}
	
	public void addUcus(Ucus u){
		this.ucusList.add(u);
	}

	public Ucus yolcuUcusGetir(int yolcuUcusID) {
		return this.getUcusList().get(yolcuUcusID);
	}

}
