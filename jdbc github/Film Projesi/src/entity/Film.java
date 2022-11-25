package entity;

/**
 *
 * @author An
 */
public class Film {

    private Integer filmId;
    private String filmAdi;
    private String filmYili;
    private Yonetmen yonetmen;
    private Kategori kategori;

    public Film() { }

    public Film(Integer filmId, String filmAdi, String filmYili, Yonetmen yonetmen, Kategori kategori) {
        this.filmId = filmId;
        this.filmAdi = filmAdi;
        this.filmYili = filmYili;
        this.yonetmen = yonetmen;
        this.kategori = kategori;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public String getFilmAdi() {
        return filmAdi;
    }

    public void setFilmAdi(String filmAdi) {
        this.filmAdi = filmAdi;
    }

    public String getFilmYili() {
        return filmYili;
    }

    public void setFilmYili(String filmYili) {
        this.filmYili = filmYili;
    }

    public Yonetmen getYonetmen() {
        return yonetmen;
    }

    public void setYonetmen(Yonetmen yonetmen) {
        this.yonetmen = yonetmen;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

}
