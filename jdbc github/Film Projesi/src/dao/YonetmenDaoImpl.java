package dao;

import entity.Yonetmen;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author An
 */
public class YonetmenDaoImpl implements YonetmenDao{

    @Override
    public ArrayList<Yonetmen> tumYonetmenleriGetir() {
        ArrayList<Yonetmen> yonetmenler = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost/filmdb", "root", "123");
            String query = "select * from yonetmen";
            PreparedStatement psmt = conn.prepareStatement(query);
            ResultSet rs = psmt.executeQuery();
            while(rs.next()){
                Yonetmen yonetmen = new Yonetmen(
                rs.getInt("YONETMEN_ID"),rs.getString("YONETMEN_ADI"));
                yonetmenler.add(yonetmen);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return yonetmenler;
    }
    
}
