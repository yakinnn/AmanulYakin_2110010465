/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package akademik;

/**
 *
 * @author ASUS
 */
public class pelajaran {
    
    private String namaPelajaran;
    private int kkm;
    
    public pelajaran(String namaPelajaran, int kkm){
        setNamaPelajaran(namaPelajaran);
        setKKM(kkm);
    }
    
    //method set
    public void setNamaPelajaran(String namaPelajaran){
        this.namaPelajaran = namaPelajaran;
    }
    public void setKKM(int kkm){
        this.kkm = kkm;
    }
    
    //method get
    public String getNamaPelajaran(){
        return namaPelajaran;
    }
    public int getKKM(){
        return kkm;
    }
    
}
