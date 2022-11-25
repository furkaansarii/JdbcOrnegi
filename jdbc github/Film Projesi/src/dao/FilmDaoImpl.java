package dao;

import entity.Film;
import entity.Kategori;
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
public class FilmDaoImpl implements FilmDao{

    @Override
    public ArrayList<Film> butunFilmleriGetir() {
        ArrayList<Film> filmler = new ArrayList<>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/filmdb", "root", "123");
            String query = "select f.film_id,f.film_adi,f.film_yili,k.kategori_adi,y.yonetmen_adi " +
                            "from film f, kategori k, yonetmen y " +
                            "where f.yonetmen_id=y.yonetmen_id and f.categori_id = k.kategori_id";
            PreparedStatement psmt = conn.prepareStatement(query);
            ResultSet rs = psmt.executeQuery();
            
            while(rs.next()){
                Kategori kategori = new Kategori(rs.getString("KATEGORI_ADI"));
                Yonetmen yonetmen = new Yonetmen(rs.getString("YONETMEN_ADI"));
                Film film = new Film(rs.getInt("FILM_ID"),rs.getString("FILM_ADI"), rs.getString("FILM_YILI"), yonetmen, kategori);
                filmler.add(film);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        return filmler;
    }

    @Override
    public void yeniFilmKaydet(Film yeniFilm) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost/filmdb", "root", "123");
            String query = "insert into film(film_id,film_adi,film_yili,categori_id,yonetmen_id) values(?,?,?,?,?)";
            PreparedStatement psmt = conn.prepareStatement(query);
            psmt.setInt(1,yeniFilm.getFilmId());
            psmt.setString(2,yeniFilm.getFilmAdi());
            psmt.setString(3,yeniFilm.getFilmYili());
            psmt.setInt(4,yeniFilm.getKategori().getKategoriId());
            psmt.setInt(5,yeniFilm.getYonetmen().getYonetmenId());
            psmt.executeUpdate();
            conn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
