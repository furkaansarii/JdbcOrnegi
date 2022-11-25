package dao;

import entity.Kategori;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author An
 */
public class KategoriDaoImpl implements KategoriDao{

    @Override
    public void yeniKategoriEkle(Kategori kategori) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/filmdb", "root", "123");
            String query = "insert into kategori(kategori_id,kategori_adi) values(?,?)";
            
            PreparedStatement psmt = conn.prepareStatement(query);
            psmt.setInt(1, kategori.getKategoriId());
            psmt.setString(2, kategori.getKategoriAdi());
            
            psmt.executeUpdate();
            System.out.println("Eklenen Kategori Adı:"+kategori.getKategoriAdi());
            
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Kategori> tumKategorileriGetir() {
        ArrayList<Kategori> kategoriler = new ArrayList<>();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbC:mysql://localhost/filmdb", "root", "123");
            String query = "select * from kategori";
            PreparedStatement psmt = conn.prepareStatement(query);
            ResultSet rs = psmt.executeQuery();
            while(rs.next()){
                Kategori kategori = new Kategori(
                        rs.getInt("KATEGORI_ID"), rs.getString("kategori_adi"));
                kategoriler.add(kategori);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kategoriler;
    }
    
}
