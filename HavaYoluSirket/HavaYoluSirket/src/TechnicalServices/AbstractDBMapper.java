package TechnicalServices;

import java.sql.ResultSet;

import javax.naming.spi.DirStateFactory.Result;

public abstract class AbstractDBMapper extends AbstractPersistenceMapper{
	
	private String tableName;
	
	public AbstractDBMapper(String tableName){
		this.tableName = tableName;
	}
	
	@Override
	protected Object getObjectFromStorage(int ID) {
		ResultSet rs = getDBRecord(ID);
		return getObjectFromResult(ID, rs);
	}
	
	protected abstract Object getObjectFromResult(int ID, ResultSet rs);
	protected abstract String buildObjectUpdateQuery(Object object);
	
	private ResultSet getDBRecord(int ID){
		String query = "select * from " + tableName + " where id=" + ID;
		ResultSet rs = DataConnector.getInstance().query(query);
		return rs;
	}
	
	protected int putObjectToStorage(Object object){
		String query = buildObjectUpdateQuery(object);
		DataConnector.getInstance().update(query);
		return 0;
	}
}
