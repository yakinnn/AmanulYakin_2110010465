/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package akademik;


/**
 *
 * @author ASUS
 */
public class datasiswa {
    private int nis;
    private String namaSiswa;
    private String tempatLahir;
    private String tanggalLahir;
    private String agama;
    private String jenisKelamin;
    private String alamatSiswa;
    private String telponSiswa;
    private String asalSekolah;
    
    //Constructor overload
    public datasiswa(int nis, String namaSiswa, String tempatLahir, String tanggalLahir, String agama, String jenisKelamin, String alamatSiswa, String telponSiswa, String asalSekolah){
        setNIS(nis);
        setNamaSiswa(namaSiswa);
        setTempatLahir(tempatLahir);
        setTanggalLahir(tanggalLahir);
        setAgama(agama);
        setJenisKelamin(jenisKelamin);
        setAlamat(alamatSiswa);
        setTelpon(telponSiswa);
        setAsalSekolah(asalSekolah);
    }
    
    //method set
    public void setNIS(int nis){
        this.nis = nis;
    }
    public void setNamaSiswa(String namaSiswa){
        this.namaSiswa = namaSiswa;
    }
    public void setTempatLahir(String tempatLahir){
        this.tempatLahir = tempatLahir;
    }
    public void setTanggalLahir(String tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }
    public void setAgama(String agama){
        this.agama = agama;
    }
    public void setJenisKelamin(String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
    public void setAlamat(String alamatSiswa){
        this.alamatSiswa = alamatSiswa;
    }
    public void setTelpon(String telponSiswa){
        this.telponSiswa = telponSiswa;
    }
    public void setAsalSekolah(String asalSekolah){
        this.asalSekolah = asalSekolah;
    }
    
    //method get
    public int getNIS(){
        return nis;
    }
    public String getNamaSiswa(){
        return namaSiswa;
    }
    public String getTempatLahir(){
        return tempatLahir;
    }
    public String getTanggalLahir(){
        return tanggalLahir;
    }
    public String getAgama(){
        return agama;
    }
    public String getJenisKelamin(){
        return jenisKelamin;
    }
    public String getAlamat(){
        return alamatSiswa;
    }
    public String getTelpon(){
        return telponSiswa;
    }
    public String getAsalSekolah(){
        return asalSekolah;
    }
    
} //end class siswa
