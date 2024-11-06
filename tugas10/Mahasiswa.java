/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas10;

/**
 *
 * @author USER
 */
public class Mahasiswa {
    private String nim, nama, alamat, mataKuliah;
    private Double Nilai1, Nilai2, Nilai3, Nilai4, Nilai5;
    private Double NilaiAkhir;
    public Mahasiswa(String NIM, String Nama, String Alamat, String MataKuliah, Double Nilai1, Double Nilai2, Double Nilai3, Double Nilai4, Double Nilai5){
        this.nim = NIM;
        this.nama = Nama;
        this.alamat = Alamat;
        this.mataKuliah = MataKuliah;
             this.Nilai1 = Nilai1;
             this.Nilai2 = Nilai2;
             this.Nilai3 = Nilai3;
             this.Nilai4 = Nilai4;
             this.Nilai5 = Nilai5;
             this.NilaiAkhir = hitungNilaiAkhir();
    }
    
    public String getAlamat(){
        return alamat;
    }
    public String getNIM(){
        return nim;
    }
    public String getNama(){
        return nama;
    }
    public String getMataKuliah(){
        return mataKuliah;
    }
    public Double getNilaiAkhir(){
        return NilaiAkhir;
    }
    
    private Double hitungNilaiAkhir(){
        return (Nilai1 * 0.1) + (Nilai2 * 0.15) + (Nilai3 * 0.25) + (Nilai4 *  0.15) + (Nilai5 * 0.35);
    }
}
