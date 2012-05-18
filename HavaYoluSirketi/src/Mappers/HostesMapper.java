package Mappers;

import DomainPackage.Hostes;
import DomainPackage.Pilot;
import java.sql.ResultSet;

import TechnicalServices.AbstractDBMapper;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HostesMapper extends AbstractDBMapper {

    public HostesMapper(String tableName) {
        super(tableName);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected Object getObjectFromResult(int ID, ResultSet rs) {
        try {
            rs.next();

            Hostes hostes = new Hostes();
            hostes.setPersonelID(ID);
            hostes.setAdi(rs.getString(2));
            hostes.setSoyadi(rs.getString(3));
            hostes.setDogumTarihi(rs.getString(4));
            return hostes;

        } catch (SQLException ex) {
            Logger.getLogger(PilotMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    protected String buildObjectUpdateQuery(Object object) {
        Hostes hostes = (Hostes) object;
        String query = "insert into values(NULL,"
                + "'" + hostes.getAdi() + "',"
                + "'" + hostes.getSoyadi() + "',"
                + "'" + hostes.getDogumTarihi() + "',"
                + ")";

        return query;
    }

    @Override
    protected List<Object> getAllObjectsFromResult(ResultSet rs) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
