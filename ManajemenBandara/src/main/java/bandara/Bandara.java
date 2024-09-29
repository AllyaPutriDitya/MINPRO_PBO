/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bandara;

/**
 *
 * @author LENOVO
 */
public class Bandara {
    private String kodePenerbangan;
    private String tujuan;
    private String jadwal;

    private static int totalPenerbangan = 0;

    public Bandara(String kodePenerbangan, String tujuan, String jadwal) {
        this.kodePenerbangan = kodePenerbangan;
        this.tujuan = tujuan;
        this.jadwal = jadwal;
        totalPenerbangan++;
    }

    public String getKodePenerbangan() {
        return kodePenerbangan;
    }

    public void setKodePenerbangan(String kodePenerbangan) {
        this.kodePenerbangan = kodePenerbangan;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public String getJadwal() {
        return jadwal;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }

    public static int getTotalPenerbangan() {
        return totalPenerbangan;
    }

    public void tampilkanInfo() {
        System.out.println("Kode Penerbangan: " + kodePenerbangan);
        System.out.println("Tujuan: " + tujuan);
        System.out.println("Jadwal: " + jadwal);
    }
}