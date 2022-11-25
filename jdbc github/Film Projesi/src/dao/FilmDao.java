package dao;

import entity.Film;
import java.util.ArrayList;

/**
 *
 * @author An
 */
public interface FilmDao {
    
    public ArrayList<Film> butunFilmleriGetir();

    public void yeniFilmKaydet(Film film);
            
}
