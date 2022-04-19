package posttest4;

public class AirLaut extends Ikan{
    private String laut;
    public AirLaut(int id, String jenisikan, String warnaikan, int jumlah, int harga, String laut){
        super(id, jenisikan, warnaikan, jumlah, harga);
        this.laut = laut;
    }

    public String getLaut(){
        return laut;
    }

    public void setLaut(String laut){
        this.laut = laut;
    }
}
