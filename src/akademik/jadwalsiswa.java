/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package akademik;

/**
 *
 * @author ASUS
 */
public class jadwalsiswa {
    
    private String jamMasuk;
    private String hariMasuk;
    
    public jadwalsiswa(String jamMasuk, String hariMasuk){
        setJamMasuk(jamMasuk);
        setHariMasuk(hariMasuk);
    }
    
    //method set
    public void setJamMasuk(String jamMasuk){
        this.jamMasuk = jamMasuk;
    }
    public void setHariMasuk(String hariMasuk){
        this.hariMasuk = hariMasuk;
    }
    
    //method get
    public String getJamMasuk(){
        return jamMasuk;
    }
    public String getHariMasuk(){
        return hariMasuk;
    }
    
}
