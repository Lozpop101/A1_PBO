/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;

/**
 *
 * @author Sezzan
 */

public class Ikan {
    
    private int id;
    private String jenisikan;
    private String warnaikan;
    private int jumlah;
    private int harga;
    
    public Ikan(int id, String jenisikan, String warnaikan, int jumlah, int harga){
        this.id = id;
        this.jenisikan = jenisikan;
        this.warnaikan = warnaikan;
        this.jumlah = jumlah;
        this.harga = harga;
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    
    public String getJenisikan(){
        return jenisikan;
    }
    public void setJenisikan(String jenisikan){
        this.jenisikan = jenisikan;
    }

    public String getWarnaikan(){
        return warnaikan;
    }
    public void setWarnaikan(String warnaikan){
        this.warnaikan = warnaikan;
    }
    
    public int getJumlah(){
        return jumlah;
    }
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    
    public int getHarga(){
        return harga;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }

    public void InfojumharTunggal(){
        System.out.println(" Informasi Penjualan jumlah ikan dan harga tunggal : ");
        System.out.println(" Jumlah : " + jumlah );
        System.out.println(" harga : Rp " + harga );
    }

    public void InfojumharTunggal(int id){
        System.out.println(" Informasi Penjualan jumlah ikan dan harga tunggal : ");
        System.out.println(" no : " + id);
        System.out.println(" Jumlah : " + jumlah );
        System.out.println(" harga : Rp " + harga );
    }

    public void IkanTerjual(){
        System.out.print(jenisikan + ", ");
    }

    public String jenislaut() {
        return ((AirLaut)this).getLaut();
    }

    public String jenistawar() {
        return ((AirTawar)this).getTawar();
    }
}
