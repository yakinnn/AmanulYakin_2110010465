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
public class dataguru {
    
    private ArrayList <String> nama;
    private ArrayList <String> tempatLahir;
    private ArrayList <String> tanggalLahir;
    private ArrayList <String> agama;
    private ArrayList <String> jenisKelamin;
    private ArrayList <String> telpon;
    private ArrayList <String> email;
    private ArrayList <String> alamat;
    private ArrayList <String> pendidikan;
    private ArrayList <String> status;
    private ArrayList <String> jabatan;
    
    public dataguru(){ //Constructor
        nama = new ArrayList <String>();
        tempatLahir = new ArrayList <String>();
        tanggalLahir = new ArrayList <String>();
        agama = new ArrayList <String>();
        jenisKelamin = new ArrayList <String>();
        telpon = new ArrayList <String>();
        email = new ArrayList <String>();
        alamat = new ArrayList <String>();
        pendidikan = new ArrayList <String>();
        status = new ArrayList <String>();
        jabatan = new ArrayList <String>();
    };
    
    //method set get nama
    public void insertNama(String isi){
    this.nama.add(isi);
    }
    
    public ArrayList <String> getRecordNama(){
    return this.nama;
    }
    
    //method set get tempatLahir
    public void insertTempatLahir(String isi){
    this.tempatLahir.add(isi);
    }
    
    public ArrayList <String> getRecordTempatLahir(){
    return this.tempatLahir;
    }
    
    //method set get tanggalLahir
    public void insertTanggalLahir(String isi){
    this.tanggalLahir.add(isi);
    }
    
    public ArrayList <String> getRecordTanggalLahir(){
    return this.tanggalLahir;
    }
    
    //method set get agama
    public void insertAgama(String isi){
    this.agama.add(isi);
    }
    
    public ArrayList <String> getRecordAgama(){
    return this.agama;
    }
    
    //method set get jenisKelamin
    public void insertJenisKelamin(String isi){
    this.jenisKelamin.add(isi);
    }
    
    public ArrayList <String> getRecordJenisKelamin(){
    return this.jenisKelamin;
    }
    
    //method set get telpon
    public void insertTelpon(String isi){
    this.telpon.add(isi);
    }
    
    public ArrayList <String> getRecordTelpon(){
    return this.telpon;
    }
    
    //method set get email
    public void insertEmail(String isi){
    this.email.add(isi);
    }
    
    public ArrayList <String> getRecordEmail(){
    return this.email;
    }
    
    //method set get alamat
    public void insertAlamat(String isi){
    this.alamat.add(isi);
    }
    
    public ArrayList <String> getRecordAlamat(){
    return this.alamat;
    }
    
    //method set get pendidikan
    public void insertPendidikan(String isi){
    this.pendidikan.add(isi);
    }
    
    public ArrayList <String> getRecordPendidikan(){
    return this.pendidikan;
    }
    
    //method set get status
    public void insertStatus(String isi){
    this.status.add(isi);
    }
    
    public ArrayList <String> getRecordStatus(){
    return this.status;
    }
    
    //method set get jabatan
    public void insertJabatan(String isi){
    this.jabatan.add(isi);
    }
    
    public ArrayList <String> getRecordJabatan(){
    return this.jabatan;
    }
}
