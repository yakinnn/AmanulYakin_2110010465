/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package akademik;
import java.util.ArrayList;


/**
 *
 * @author ASUS
 */
public class datasiswa {
    private ArrayList <Integer> nis;
    private ArrayList <String> namaSiswa;
    private ArrayList <String> tempatLahir;
    private ArrayList <String> tanggalLahir;
    private ArrayList <String> agama;
    private ArrayList <String> jenisKelamin;
    private ArrayList <String> alamatSiswa;
    private ArrayList <String> telponSiswa;
    private ArrayList <String> asalSekolah;
    
    //Constructor
    public datasiswa(){
        nis = new ArrayList<Integer>();
        namaSiswa = new ArrayList<String>();
        tempatLahir = new ArrayList<String>();
        tanggalLahir = new ArrayList<String>();
        agama = new ArrayList<String>();
        jenisKelamin = new ArrayList<String>();
        alamatSiswa = new ArrayList<String>();
        telponSiswa = new ArrayList<String>();
        asalSekolah = new ArrayList<String>();
    }
    
    //method set get nis
    public void insertNis (int isi){
    this.nis.add(isi);
    }
    
    public ArrayList <Integer> getNis(){
    return this.nis;
    }
    
    //method set get namaSiswa
    public void insertNamaSiswa (String isi){
    this.namaSiswa.add(isi);
    }
    
    public ArrayList <String> getNamaSiswa(){
    return this.namaSiswa;
    }
    
    //method set get tempatLahir
    public void insertTempatLahir (String isi){
    this.tempatLahir.add(isi);
    }
    
    public ArrayList <String> getTempatLahir(){
    return this.tempatLahir;
    }
    
    //method set get tanggalLahir
    public void insertTanggalLahir (String isi){
    this.tanggalLahir.add(isi);
    }
    
    public ArrayList <String> getTangalLahir(){
    return this.tanggalLahir;
    }
    
    //method set get agama
    public void insertAgama (String isi){
    this.agama.add(isi);
    }
    
    public ArrayList <String> getAgama(){
    return this.agama;
    }
    
    //method set get jenisKelamin
    public void insertJenisKelamin (String isi){
    this.jenisKelamin.add(isi);
    }
    
    public ArrayList <String> getJenisKelamin(){
    return this.jenisKelamin;
    }
    
    //method set get alamatSiswa
    public void insertAlamatSiswa (String isi){
    this.alamatSiswa.add(isi);
    }
    
    public ArrayList <String> getAlamatSiswa(){
    return this.alamatSiswa;
    }
    
    //method set get telponSiswa
    public void insertTelponSiswa (String isi){
    this.telponSiswa.add(isi);
    }
    
    public ArrayList <String> getTelponSiswa(){
    return this.telponSiswa;
    }
    
    //method set get asalSekolah
    public void insertAsalSekolah (String isi){
    this.asalSekolah.add(isi);
    }
    
    public ArrayList <String> getAsalSekolah(){
    return this.asalSekolah;
    }    
    
    
} //end class siswa
