package TechnicalServices;

import java.util.List;

public abstract class AbstractPersistenceMapper implements IMapper {

    @Override
    public Object get(int ID) {
        return getObjectFromStorage(ID);
    }

    @Override
    public int put(Object object) {
        return putObjectToStorage(object);
    }

    public List<Object> getAll() {
        return getAllObjectsFromStorage();
    }

    protected abstract Object getObjectFromStorage(int ID);

    protected abstract int putObjectToStorage(Object object);

    public abstract List<Object> getAllObjectsFromStorage();
}
