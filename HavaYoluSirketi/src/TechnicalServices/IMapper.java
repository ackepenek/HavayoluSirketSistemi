package TechnicalServices;

import java.util.List;

public interface IMapper {
	
	public abstract Object get(int ID);
	public abstract int put(Object object);
	public abstract List<Object> getAll();
}
