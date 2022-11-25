package entity;

/**
 *
 * @author An
 */
public class Yonetmen {

    private Integer yonetmenId;
    private String yonetmenAdi;

    public Yonetmen() {
    }

    public Yonetmen(String yonetmenAdi) {
        this.yonetmenAdi = yonetmenAdi;
    }
    
    public Yonetmen(Integer yonetmenId, String yonetmenAdi) {
        this.yonetmenId = yonetmenId;
        this.yonetmenAdi = yonetmenAdi;
    }

    @Override
    public String toString() {
        return yonetmenAdi;
    }
    
    public Integer getYonetmenId() {
        return yonetmenId;
    }

    public void setYonetmenId(Integer yonetmenId) {
        this.yonetmenId = yonetmenId;
    }

    public String getYonetmenAdi() {
        return yonetmenAdi;
    }

    public void setYonetmenAdi(String yonetmenAdi) {
        this.yonetmenAdi = yonetmenAdi;
    }

}
