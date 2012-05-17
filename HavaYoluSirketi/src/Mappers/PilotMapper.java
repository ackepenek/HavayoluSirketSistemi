package Mappers;

import DomainPackage.Pilot;
import java.sql.ResultSet;

import TechnicalServices.AbstractDBMapper;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PilotMapper extends AbstractDBMapper {

    public PilotMapper(String tableName) {
        super(tableName);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected Object getObjectFromResult(int ID, ResultSet rs) {
        try {
            rs.next();

            Pilot pilot = new Pilot();
            pilot.setPersonelID(ID);
            pilot.setAdi(rs.getString(2));
            pilot.setSoyadi(rs.getString(3));
            pilot.setDogumTarihi(rs.getString(4));
            return pilot;

        } catch (SQLException ex) {
            Logger.getLogger(PilotMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    protected String buildObjectUpdateQuery(Object object) {
        Pilot pilot = (Pilot)object;
        String query="insert into values(NULL,"+
                "'"+ pilot.getAdi() +"'," +
                "'"+ pilot.getSoyadi() +"'," +
                "'"+ pilot.getDogumTarihi() +"'," +
                ")";
        
        return query;
    }
}
