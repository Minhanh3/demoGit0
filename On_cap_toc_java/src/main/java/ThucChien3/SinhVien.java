/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucChien3;

import java.io.Serializable;

/**
 *
 * @author Manhdepzai
 */
public class SinhVien implements Serializable{
    private String masv;
    private String tensv;
    private int gioitinh;
    private String namsinh;

    public SinhVien() {
    }

    public SinhVien(String masv, String tensv, int gioitinh, String namsinh) {
        this.masv = masv;
        this.tensv = tensv;
        this.gioitinh = gioitinh;
        this.namsinh = namsinh;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getTensv() {
        return tensv;
    }

    public void setTensv(String tensv) {
        this.tensv = tensv;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }
    
    public int tinhTuoi(int namSinh){
       int tuoi = 2023 - namSinh;
       return tuoi;
    };
}
