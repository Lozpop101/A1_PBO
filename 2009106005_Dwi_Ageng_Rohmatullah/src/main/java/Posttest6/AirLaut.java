package Posttest6;

public class AirLaut extends Ikan{

    static int la = 4;
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

    @Override
    public void readdata(){
        System.out.println(
                    getId() + "    " + getJenisikan() + "\t" + getWarnaikan() + "\t   " + getJumlah() + "\t   Rp " + getHarga() + "\t\t" + getLaut()
            );
    }

    @Override
    public void IkanTerjual(){
        System.out.print(getJenisikan() + ", ");
    }

    @Override
    public void InfojumharTunggal(){
        System.out.println(" Informasi Penjualan jumlah ikan dan harga tunggal : ");
        System.out.println(" Jumlah : " + getJumlah() );
        System.out.println(" harga : Rp " + getHarga() );
    }

    static void totaljenis3(){
        System.out.println("\n Total jenis ikan laut : " + la );
    }
}
