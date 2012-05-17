package TechnicalServices;

public abstract class AbstractPersistenceMapper implements IMapper{

	@Override
	public Object get(int ID) {
		return getObjectFromStorage(ID);
	}

	@Override
	public int put(Object object) {
		return putObjectToStorage(object);
	}
	
	protected abstract Object getObjectFromStorage(int ID);
	protected abstract int putObjectToStorage(Object object);
	
}
