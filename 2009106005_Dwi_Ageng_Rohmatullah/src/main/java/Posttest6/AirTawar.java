package Posttest6;

public class AirTawar extends Ikan{

    static int ta = 6;
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
    public void readdata(){
        System.out.println(
                    getId() + "    " + getJenisikan() + "\t" + getWarnaikan() + "\t   " + getJumlah() + "\t   Rp " + getHarga() + "\t\t" + getTawar()
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

    static void totaljenis2(){
        System.out.println("\n Total jenis ikan tawar : " + ta );
    }
}