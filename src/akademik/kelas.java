/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package akademik;

/**
 *
 * @author ASUS
 */
public class kelas {
    
    private int kelas;
    private int kapasitas;
    
    public kelas(int kelas, int kapasitas){
        setKelas(kelas);
        setKapasitas(kapasitas);
    }
    
    //method set
    public void setKelas(int kelas){
        this.kelas = kelas;
    }
    public void setKapasitas(int kapasitas){
        this.kapasitas = kapasitas;
    }
    
    //method get
    public int getKelas(){
        return kelas;
    }
    public int getKapasitas(){
        return kapasitas;
    }
    
}
