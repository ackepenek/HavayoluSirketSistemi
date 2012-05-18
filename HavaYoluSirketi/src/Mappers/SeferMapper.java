package Mappers;

import DomainPackage.HavaLimani;
import DomainPackage.Sefer;
import java.sql.ResultSet;

import TechnicalServices.AbstractDBMapper;
import TechnicalServices.IMapper;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SeferMapper extends AbstractDBMapper {

    public SeferMapper(String tableName) {
        super(tableName);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected Object getObjectFromResult(int ID, ResultSet rs) {
        try {
            rs.next();
            Sefer sefer = new Sefer();
            sefer.setSeferID(ID);

            HavaLimani kalkis = (HavaLimani) new HavaLimaniMapper("havalimani").get(Integer.parseInt(rs.getString(2)));
            sefer.setKalkisHavalimani(kalkis);

            HavaLimani inis = (HavaLimani) new HavaLimaniMapper("havalimani").get(Integer.parseInt(rs.getString(3)));
            sefer.setInisHavalimani(inis);

            return sefer;

        } catch (SQLException ex) {
            Logger.getLogger(SeferMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    protected String buildObjectUpdateQuery(Object object) {
        Sefer sefer = (Sefer) object;
        String query = "insert into sefer values(NULL,"
                + "'" + sefer.getKalkisHavalimani().getHavaLimaniId() + "',"
                + "'" + sefer.getInisHavalimani().getHavaLimaniId() + "')";
        return query;
    }

    @Override
    protected List<Object> getAllObjectsFromResult(ResultSet rs) {
        List<Object> seferList = new ArrayList<Object>();
        try {
            while (rs.next()) {
                Sefer sefer = new Sefer();
                sefer.setSeferID(Integer.parseInt(rs.getString(1)));

                HavaLimani kalkis = (HavaLimani) new HavaLimaniMapper("havalimani").get(Integer.parseInt(rs.getString(2)));
                sefer.setKalkisHavalimani(kalkis);

                HavaLimani inis = (HavaLimani) new HavaLimaniMapper("havalimani").get(Integer.parseInt(rs.getString(3)));
                sefer.setInisHavalimani(inis);
                
                seferList.add(sefer);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SeferMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return seferList;
    }
}
