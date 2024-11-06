/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas10;

/**
 *
 * @author USER
 */
import java.util.ArrayList;
public class Inputdata {
    ArrayList<Mahasiswa> lismahasiswa;
    private final ArrayList listmahasiswa;
    public Inputdata(){
        listmahasiswa = new ArrayList();
    }
    public void insertData(String NIM, String Nama, String Alamat, String MataKuliah, Double Nilai1, Double Nilai2, Double Nilai3, Double Nilai4, Double Nilai5){
        Mahasiswa mhs = new Mahasiswa(NIM, Nama, Alamat, MataKuliah, Nilai1, Nilai2, Nilai3, Nilai4, Nilai5);
        listmahasiswa.add(mhs);
    }
    public ArrayList<Mahasiswa> getALL(){
        return listmahasiswa;
    }
    public void deleteData(int index){
        listmahasiswa.remove(index);
    }
}
