package posttest4;

public class AirTawar extends Ikan{

    private String tawar;
    public AirTawar(int id, String jenisikan, String warnaikan, int jumlah, int harga, String tawar){
        super(id, jenisikan, warnaikan, jumlah, harga);
        this.tawar = tawar;
    }

    public String getTawar(){
        return tawar;
    }

    public void setTawar(String tawar){
        this.tawar = tawar;
    }


@Override
    public void IkanTerjual(){
        System.out.println(getId() + getJenisikan() + getWarnaikan() + getJumlah() + getHarga() + getTawar() + "Maaf fungsi ini sedang error");
    }
}