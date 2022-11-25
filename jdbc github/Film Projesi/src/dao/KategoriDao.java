package dao;

import entity.Kategori;
import java.util.ArrayList;

/**
 *
 * @author An
 */
public interface KategoriDao {

    public void yeniKategoriEkle(Kategori kategori);
    
    public ArrayList<Kategori> tumKategorileriGetir();
    
}
