package Mappers;

import DomainPackage.YolcuUcagi;
import java.sql.ResultSet;

import TechnicalServices.AbstractDBMapper;
import TechnicalServices.IMapper;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class YolcuUcagiMapper extends AbstractDBMapper {

    public YolcuUcagiMapper(String tableName) {
        super(tableName);

    }

    @Override
    protected Object getObjectFromResult(int ID, ResultSet rs) {
        try {
            rs.next();

            YolcuUcagi yolcuUcagi = new YolcuUcagi();
            yolcuUcagi.setUcakID(ID);
            yolcuUcagi.setUcakAdi(rs.getString(2));
            yolcuUcagi.setAgirlik(Float.parseFloat(rs.getString(3)));
            yolcuUcagi.setBusinessKoltukSayisi(Integer.parseInt(rs.getString(4)));
            yolcuUcagi.setEkonomikKoltukSayisi(Integer.parseInt(rs.getString(5)));

            return yolcuUcagi;
        } catch (SQLException ex) {
            Logger.getLogger(YolcuUcagiMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    protected String buildObjectUpdateQuery(Object object) {
        YolcuUcagi yolcuUcagi = (YolcuUcagi)object;
        String query="insert into values(NULL,"+
                "'"+yolcuUcagi.getUcakAdi()+"',"+
                "'"+yolcuUcagi.getAgirlik()+"',"+
                "'"+yolcuUcagi.getBusinessKoltukSayisi()+"',"+
                "'"+yolcuUcagi.getEkonomikKoltukSayisi()+"')";
        return query;
    }
}
