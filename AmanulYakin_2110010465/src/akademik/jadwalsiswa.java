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
public class jadwalsiswa {
    
    private ArrayList <String> jamMasuk;
    private ArrayList <String> hariMasuk;
    
    public jadwalsiswa(){
        jamMasuk = new ArrayList<String>();
        hariMasuk = new ArrayList<String>();
    }
    
    //method set get jamMasuk
    public void insertJamMasuk (String isi){
    this.jamMasuk.add(isi);
    }
    
    public ArrayList <String> getJamMasuk(){
    return this.jamMasuk;
    }
    
    //method set get hariMasuk
    public void insertHariMasuk (String isi){
    this.hariMasuk.add(isi);
    }
    
    public ArrayList <String> getHariMasuk (){
    return this.hariMasuk;
    }
    
}//end class jadwalsiswa
