/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Sezzan
 */
public class Main {
    
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Ikan> listData = new ArrayList<Ikan>();
    private static int id = 1;
    private static Ikan ikanda;
    private static int data;
    
    public static void main(String[] args){
        
        ikanda = new Ikan(1, "demo", "warna", 3, 4);
        listData.add(ikanda);
        
        int menu;
        do {
            data = 1;
            System.out.println(" ~~ Kios Ikan Hias Minaria ~~ ");
            System.out.println(">> Daftar Ikan hias yang tersedia :");
            System.out.println("1. Ikan Guppy.  Warna : Hitam, Biru, Neon.  Rp25000/ekor");
            System.out.println("2. Ikan Cupang.  Warna : Merah, Biru, Ungu.  Rp75000/ekor");
            System.out.println("3. Ikan Koi.  Warna : Putih, Hitam, Silver.  Rp120000/ekor");
            System.out.println("4. Ikan Koki.  Warna : Hitam, Putih, Jingga.  Rp37500/ekor");
            System.out.println("===================================");
            System.out.println("===================================");
            System.out.println("=============  Menu  ==============");
            System.out.println("1> Tambah data pesanan");
            System.out.println("2> Menampilkan data pesanan");
            System.out.println("3> Hapus data pesanan");
            System.out.println("4> Ubah data pesanan");
            System.out.println("5> Informasi penjualan jumlah ikan dan harga tunggal");
            System.out.println("6> Informasi Nama Ikan terjual");
            System.out.println("7> Ikan khusus Air Tawar");
            System.out.println("8> Ikan khusus Air laut");
            System.out.println("0> Keluar");
            System.out.println("Masukkan Pilihan Anda");
            menu = input.nextInt(); input.nextLine();
            
                if(menu > 0){
                    menu_kios(menu, data);
                }
        }   
        while(menu != 0);        
        System.out.println("\nTerimakasih telah menggunakan program kami.");
        System.exit(0);
    }
    
    public static void menu_kios(int menu, int data){
        switch(menu){
            case 1:
                tambah_data(data);
                break;
            case 2:
                liat_data();
                input_lagi();
                break;
            case 3:
                hapus_data();
                break;
            case 4:
                ubah_data();
                break;
            case 5:
                infotunggal();
                break;
            case 6:
                infoikan();
                break;
            case 7:
                airtawar();
                break;
            case 8:
                airlaut();
                break;
            default:
                System.out.println("\nPilihan tidak tersedia");
                input_lagi();
        }
    }
    
    public static void airtawar(){
        data = 2;
        int menu2;
        System.out.println(" ~~ Kios Ikan Hias Minaria ~~ ");
        System.out.println(">> Daftar Ikan hias yang tersedia :");
        System.out.println("1. Ikan Louhan.  Warna : Hitam, Biru, Neon.  Rp25000/ekor");
        System.out.println("2. Ikan Manfish.  Warna : Merah, Biru, Ungu.  Rp75000/ekor");
        System.out.println("3. Ikan Platy.  Warna : Putih, Hitam, Silver.  Rp120000/ekor");
        System.out.println("4. Ikan Discus.  Warna : Hitam, Putih, Jingga.  Rp37500/ekor");
        System.out.println("===================================");
        System.out.println("===================================");
        System.out.println("=============  Menu  ==============");
        System.out.println("1> Tambah data pesanan");
        System.out.println("2> Menampilkan data pesanan");
        System.out.println("3> Hapus data pesanan");
        System.out.println("4> Ubah data pesanan");
        System.out.println("5> Informasi penjualan jumlah ikan dan harga tunggal");
        System.out.println("6> Informasi Nama Ikan terjual");
        System.out.println("7> Ikan khusus Air Tawar");
        System.out.println("8> Ikan khusus Air Laut");
        System.out.println("0> Kembali");
        System.out.println("Masukkan Pilihan Anda");
        menu2 = input.nextInt(); input.nextLine();
            
        if(menu2 > 0){
            menu_kios(menu2, data);
        }else{
            
        }
    }

    public static void airlaut(){
        data = 3;
        int menu3;
        System.out.println(" ~~ Kios Ikan Hias Minaria ~~ ");
        System.out.println(">> Daftar Ikan hias yang tersedia :");
        System.out.println("1. Ikan Botana.  Warna : Hitam, Biru, Neon.  Rp25000/ekor");
        System.out.println("2. Ikan Butterfly.  Warna : Merah, Biru, Ungu.  Rp75000/ekor");
        System.out.println("3. Ikan Angelfish.  Warna : Putih, Hitam, Silver.  Rp120000/ekor");
        System.out.println("4. Ikan Banggai.  Warna : Hitam, Putih, Jingga.  Rp37500/ekor");
        System.out.println("===================================");
        System.out.println("===================================");
        System.out.println("=============  Menu  ==============");
        System.out.println("1> Tambah data pesanan");
        System.out.println("2> Menampilkan data pesanan");
        System.out.println("3> Hapus data pesanan");
        System.out.println("4> Ubah data pesanan");
        System.out.println("5> Informasi penjualan jumlah ikan dan harga tunggal");
        System.out.println("6> Informasi Nama Ikan terjual");
        System.out.println("7> Ikan khusus Air Tawar");
        System.out.println("8> Ikan khusus Air Tawar");
        System.out.println("0> Kembali");
        System.out.println("Masukkan Pilihan Anda");
        menu3 = input.nextInt(); input.nextLine();
            
        if(menu3 > 0){
            menu_kios(menu3, data);
        }else{
            
        }
    }

    public static void tambah_data(int data){
        id++;
        System.out.println("\n Penambahan data ~~~");
        System.out.println("\n Masukkan Nama ikan yang ingin dibeli : ");
        String jenisikan = input.nextLine();
        System.out.println("Masukkan Jumlah yang ingin dibeli : ");
        int jumlah = input.nextInt(); input.nextLine();
        System.out.println("Masukkan warna ikan yang ingin dibeli : ");
        String warnaikan = input.nextLine();
        System.out.println("Masukkan Harga : ");
        int harga = input.nextInt();
        
        if(data == 1) {
            ikanda = new Ikan(id, jenisikan, warnaikan, jumlah, harga);
            listData.add(ikanda);
        } else if(data == 2) {
            ikanda = new AirTawar(id, jenisikan, warnaikan, jumlah, harga, "");
            listData.add(ikanda);
        } else if(data == 3){
            ikanda = new AirLaut(id, jenisikan, warnaikan, jumlah, harga, "");
            listData.add(ikanda);
        }
        
        System.out.println("\nData berhasil ditambahkan");
        input.nextLine();
        input_lagi();
    }
    
    public static void liat_data(){
        System.out.println("~~ Liat data penjualan ~~");
        System.out.println("\nNo   Namaikan\tWarnaikan  Jumlah  Harga\tJenisikan");
        
        for (Ikan ikanda : listData){
            System.out.println(
                    ikanda.getId() + "    " + ikanda.getJenisikan() + "\t" + ikanda.getWarnaikan() + "\t   " + ikanda.getJumlah() + "\t   Rp " + ikanda.getHarga()
            );
        }
        System.out.println();
    }
    
    private static void ubah_data(){
        liat_data();
        System.out.println("~~ Mengubah data penjualan ~~");
        
        System.out.println("Masukkan no Penjualan : ");
        int no = input.nextInt(); input.nextLine();
        
        boolean change = false;
        
        for (Ikan ikanda : listData){
            if(ikanda.getId() == no){
                System.out.println("Masukkan Data Nama Ikan baru : ");
                String jenisikan = input.nextLine();
                System.out.println("masukkan Data Warna ikan baru : ");
                String warnaikan = input.nextLine();
                System.out.println("Masukkan Data Jumlah baru : ");
                int jumlah = input.nextInt();
                System.out.println("Masukkan Data Harga baru : ");
                int harga = input.nextInt(); input.nextLine();
                
                ikanda.setJenisikan(jenisikan);
                ikanda.setWarnaikan(warnaikan);
                ikanda.setJumlah(jumlah);
                ikanda.setHarga(harga);
                
                change = true;
                break;
            }
        }
        
        if(change == false){
            System.out.println("\nData penjualan tidak ditemukan");
            input_lagi();
        }else{
            System.out.println("\nData telah diubah");
            input_lagi();
        }
    }
    
    
    private static void hapus_data(){
        liat_data();
        System.out.println("~~ Manghapus data penjualan");
        
        System.out.println("Masukkan no Penjualan : ");
        int no = input.nextInt(); input.nextLine();
        
        boolean hapus = false;
        
        for (Ikan ikanda : listData){
            if(ikanda.getId() == no){
                listData.remove(ikanda);
                hapus = true;
                break;
            }
        }
        if(hapus == false){
            System.out.println("\nData penjualan tidak ditemukan");
            input_lagi();
        }else{
            System.out.println("\nData telah dihapus");
            input_lagi();
        }
    }
    
    public static void input_lagi(){
        System.out.println("Tekan enter untuk kembali");
        input.nextLine();
    }

    public static void infotunggal(){
        liat_data();
        System.out.println("Masukkan no Penjualan : ");
        int no = input.nextInt(); input.nextLine();


        for (Ikan ikanda : listData){
            if(ikanda.getId() == no){
                ikanda.InfojumharTunggal(id);
                break;
            }
        }
        input_lagi();
    }

    public static void infoikan(){
        System.out.print("ikan : ");
        for (Ikan ikanda : listData){
            ikanda.IkanTerjual();
        }
        System.out.println();
        input_lagi();
    }
}

