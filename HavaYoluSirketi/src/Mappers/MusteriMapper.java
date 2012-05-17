package Mappers;

import DomainPackage.Musteri;
import java.sql.ResultSet;

import TechnicalServices.AbstractDBMapper;
import TechnicalServices.IMapper;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MusteriMapper extends AbstractDBMapper {

    public MusteriMapper(String tableName) {
        super(tableName);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected Object getObjectFromResult(int ID, ResultSet rs) {
        try {
            rs.next();
            Musteri musteri = new Musteri(ID);
            musteri.setAdi(rs.getString(2));
            musteri.setAdi(rs.getString(3));
            
            return musteri;
        } catch (SQLException ex) {
            Logger.getLogger(MusteriMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    protected String buildObjectUpdateQuery(Object object) {
        // TODO Auto-generated method stub
        return null;
    }
}
