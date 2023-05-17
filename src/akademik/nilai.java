/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package akademik;

/**
 *
 * @author ASUS
 */
public class nilai {
    
    private int uts;
    private int uas;
    private int tugas;
    private int absen;
    
    public nilai(int uts, int uas, int tugas, int absen){
        setNilaiUts(uts);
        setNilaiUas(uas);
        setNilaiTugas(tugas);
        setNilaiAbsen(absen);
    }
    
    //method set
    public void setNilaiUts(int uts){
        this.uts = uts;
    }
    public void setNilaiUas(int uas){
        this.uas = uas;
    }
    public void setNilaiTugas(int tugas){
        this.tugas = tugas;
    }
    public void setNilaiAbsen(int absen){
        this.absen = absen;
    }
    
    //method get
    public int getNilaiUts(){
        return uts;
    }
    public int getNilaiUas(){
        return uas;
    }
    public int getNilaiTugas(){
        return tugas;
    }
    public int getNilaiAbsen(){
        return absen;
    }
    
}
