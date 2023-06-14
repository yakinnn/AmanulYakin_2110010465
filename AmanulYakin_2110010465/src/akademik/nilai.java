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
public class nilai {
    
    private ArrayList <Integer> uts;
    private ArrayList <Integer> uas;
    private ArrayList <Integer> tugas;
    private ArrayList <Integer> absen;
    
    public nilai(){
        uts = new ArrayList<Integer>();
        uas = new ArrayList<Integer>();
        tugas = new ArrayList<Integer>();
        absen = new ArrayList<Integer>();
    }
    
    //method set get uts
    public void insertUts (int isi){
    this.uts.add(isi);
    }
    
    public ArrayList <Integer> getUts(){
    return this.uts;
    }
    
    //method set get uas
    public void insertUas (int isi){
    this.uas.add(isi);
    }
    
    public ArrayList <Integer> getUas(){
    return this.uas;
    }
    
    //method set get tugas
    public void insertTugas (int isi){
    this.tugas.add(isi);
    }
    
    public ArrayList <Integer> getTugas(){
    return this.tugas;
    }
    
    //method set get absen
    public void insertAbsen (int isi){
    this.absen.add(isi);
    }
    
    public ArrayList <Integer> getAbsen(){
    return this.absen;
    }
}//end class nilai
