package TechnicalServices;

import java.sql.ResultSet;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

public abstract class AbstractDBMapper extends AbstractPersistenceMapper {

    protected String tableName;

    public AbstractDBMapper(String tableName) {
        this.tableName = tableName;
    }

    @Override
    protected Object getObjectFromStorage(int ID) {
        ResultSet rs = getDBRecord(ID);
        return getObjectFromResult(ID, rs);
    }

    protected abstract Object getObjectFromResult(int ID, ResultSet rs);

    protected abstract String buildObjectUpdateQuery(Object object);

    protected abstract List<Object> getAllObjectsFromResult(ResultSet rs);

    private ResultSet getDBRecord(int ID) {
        String query = "select * from " + tableName + " where id=" + ID;
        ResultSet rs = DataConnector.getInstance().query(query);
        return rs;
    }

    private ResultSet getAllDBRecords() {
        String query = "select * from " + tableName;
        ResultSet rs = DataConnector.getInstance().query(query);
        return rs;
    }

    @Override
    public List<Object> getAllObjectsFromStorage(){
        ResultSet rs = getAllDBRecords();
        return getAllObjectsFromResult(rs);
    }

    protected int putObjectToStorage(Object object) {
        String query = buildObjectUpdateQuery(object);
        DataConnector.getInstance().update(query);
        return 0;
    }
}
