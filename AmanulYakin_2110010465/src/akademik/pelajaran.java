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
public class pelajaran {
    
    private ArrayList <String> namaPelajaran;
    private ArrayList <Integer> kkm;
    
    public pelajaran(){
        namaPelajaran = new ArrayList<String>();
        kkm = new ArrayList<Integer>();
    }
    
    //method set get namaPelajaran
    public void insertNamaPelajaran (String isi){
    this.namaPelajaran.add(isi);
    }
    
    public ArrayList <String> getNamaPelajaran(){
    return this.namaPelajaran;
    }
    
    //method set get kkm
    public void insertKkm (int isi){
    this.kkm.add(isi);
    }
    
    public ArrayList <Integer> getKkm(){
    return this.kkm;
    }
    
}//end class pelajaran
