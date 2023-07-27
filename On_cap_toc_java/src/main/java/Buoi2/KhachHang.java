/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi2;

import javax.print.DocFlavor;

/**
 *
 * @author Manhdepzai
 */
public class KhachHang {

    private String ho;
    private String ten;
    private int tuoi;
    private String diachi;

    public KhachHang() {
    }

    public KhachHang(String ho, String ten, int tuoi, String diachi) {
        this.ho = ho;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

}
