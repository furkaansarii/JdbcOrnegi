package entity;

/**
 *
 * @author An
 */
public class Kategori {

    private Integer kategoriId;
    private String kategoriAdi;

    public Kategori() {
    }

    public Kategori(String kategoriAdi) {
        this.kategoriAdi = kategoriAdi;
    }

    public Kategori(Integer kategoriId, String kategoriAdi) {
        this.kategoriId = kategoriId;
        this.kategoriAdi = kategoriAdi;
    }

    @Override
    public String toString() {
        return kategoriAdi;
    }

    public Integer getKategoriId() {
        return kategoriId;
    }

    public void setKategoriId(Integer kategoriId) {
        this.kategoriId = kategoriId;
    }

    public String getKategoriAdi() {
        return kategoriAdi;
    }

    public void setKategoriAdi(String kategoriAdi) {
        this.kategoriAdi = kategoriAdi;
    }

}
