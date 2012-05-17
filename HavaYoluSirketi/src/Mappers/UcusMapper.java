package Mappers;

import DomainPackage.*;
import java.sql.ResultSet;

import TechnicalServices.AbstractDBMapper;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UcusMapper extends AbstractDBMapper {

    public UcusMapper(String tableName) {
        super(tableName);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected Object getObjectFromResult(int ID, ResultSet rs) {
        try {
            rs.next();
            Ucus ucus = new Ucus();

            ucus.setUcusId(ID);

            YolcuUcagi yolcuUcagi = (YolcuUcagi) new YolcuUcagiMapper("yolcuucak").get(Integer.parseInt(rs.getString(2)));
            ucus.setUcak(yolcuUcagi);

            Sefer sefer = (Sefer) new SeferMapper("sefer").get(Integer.parseInt(rs.getString(3)));
            ucus.setSefer(sefer);

            Pilot pilot = (Pilot) new PilotMapper("pilot").get(Integer.parseInt(rs.getString(4)));
            ucus.setPilot(pilot);

            Hostes hostes = (Hostes) new HostesMapper("hostes").get(Integer.parseInt(rs.getString(5)));
            ucus.setHostes(hostes);

            ucus.setTarih(rs.getString(6));
            ucus.setSaat(rs.getString(7));
            ucus.setBusinessKoltukFiyati(Float.parseFloat(rs.getString(8)));
            ucus.setEkonomikKoltukFiyati(Float.parseFloat(rs.getString(9)));

            return ucus;
        } catch (SQLException ex) {
            Logger.getLogger(UcusMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    protected String buildObjectUpdateQuery(Object object) {
        Ucus ucus = (Ucus)object;
        String query = "insert into values(NULL,"+
                "'" + ucus.getUcak().getUcakID() + "'," +
                "'" + ucus.getSefer().getSeferID() + "'," +
                "'" + ucus.getPilot().getPersonelID() + "'," +
                "'" + ucus.getHostes().getPersonelID() + "'," +
                "'" + ucus.getTarih() + "'," +
                "'" + ucus.getSaat() + "'" +
                "'" + ucus.getBusinessKoltukFiyati() + "'" +
                "'" + ucus.getEkonomikKoltukFiyati() + "'" +
                "'" + ucus.getSaat() + "'" 
                +")";
        
        
        return query;
    }
}
