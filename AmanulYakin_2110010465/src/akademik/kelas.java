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
public class kelas {
    
    private ArrayList <Integer> kelas;
    private ArrayList <Integer> kapasitas;
    
    public kelas(){
        kelas = new ArrayList<Integer>();
        kapasitas = new ArrayList<Integer>();
    }
    
    //method set get kelas
    public void insertKelas (int isi){
    this.kelas.add(isi);
    }
    
    public ArrayList <Integer> getKelas(){
    return this.kelas;
    }
    
    //method set get kapasitas
    public void insertKapasitas (int isi){
    this.kapasitas.add(isi);
    }
    
    public ArrayList <Integer> getKapasitas(){
    return this.kapasitas;
    }
    
}//end class kelas
