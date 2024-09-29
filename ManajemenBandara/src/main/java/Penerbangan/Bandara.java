/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Penerbangan;

/**
 *
 * @author LENOVO
 */
public class Bandara {
    private String kodePenerbangan;
    private String tujuan;
    private String jadwal;

    public Bandara(String kodePenerbangan, String tujuan, String jadwal) {
        this.kodePenerbangan = kodePenerbangan;
        this.tujuan = tujuan;
        this.jadwal = jadwal;
    }

    public String getKodePenerbangan() {
        return kodePenerbangan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }

    public void tampilkanInfo() {
        System.out.println("Kode Penerbangan: " + kodePenerbangan);
        System.out.println("Tujuan: " + tujuan);
        System.out.println("Jadwal: " + jadwal);
    }
}
