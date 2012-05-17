package Mappers;

import DomainPackage.HavaLimani;
import java.sql.ResultSet;

import TechnicalServices.*;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HavaLimaniMapper extends AbstractDBMapper {

    public HavaLimaniMapper(String tableName) {
        super(tableName);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected Object getObjectFromResult(int ID, ResultSet rs) {
        try {
            rs.next();
            HavaLimani havaLimani = new HavaLimani();
            havaLimani.setHavaLimaniId(ID);
            havaLimani.setHavalimaniAdi(rs.getString(2));
            havaLimani.setSehir(rs.getString(3));
            return havaLimani;
        } catch (SQLException ex) {
            Logger.getLogger(HavaLimaniMapper.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    @Override
    protected String buildObjectUpdateQuery(Object object) {
        HavaLimani havaLimani = (HavaLimani)object;
        String query = "insert into " + this.tableName + " values(NULL,"+
                "'"+havaLimani.getHavalimaniAdi()+"',"+
                "'"+havaLimani.getSehir() + "')";
        return query;
    }

    @Override
    protected List<Object> getAllObjectsFromResult(ResultSet rs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
