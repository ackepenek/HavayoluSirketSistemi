package TechnicalServices;

import DomainPackage.*;
import Mappers.*;

public class Facade {
	private static Facade facade;
	
	public static Facade getInstance(){
		if (facade == null){
			facade = new Facade();
		}
		return facade;
	}
	
	public Object get(int ID, Class objectClass){
		IMapper mapper = findMapper(objectClass);
		return mapper.get(ID);
	}
	
	public Object put(Object object, Class objectClass){
		IMapper mapper = findMapper(objectClass);
		return mapper.put(object);
	}
	
	private IMapper findMapper(Class objectClass){
		if (objectClass == Bilet.class){
			return new BiletMapper("bilet");
		}else if (objectClass == HavaLimani.class){
			return new HavaLimaniMapper("havalimani");
		}else if (objectClass == KargoUcagi.class){
			return new KargoUcagiMapper("kargoucagi");
		}else if (objectClass == MusteriMapper.class){
			return new MusteriMapper("musteri");
		}else if (objectClass == Sefer.class){
			return new SeferMapper("sefer");
		}else if (objectClass == YolcuUcagi.class){
			return new YolcuUcagiMapper("yolcuucagi");
		}
		
		return null;
	}
}
