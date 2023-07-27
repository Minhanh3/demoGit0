/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.on_cap_toc_java;

/**
 *
 * @author Manhdepzai
 */
public class SanPham {
    String ma;
    String ten;
    int gia;
    int soluong;
    double thanhtien;

    public SanPham() {
    }

    public SanPham(String ma, String ten, int gia, int soluong, double thanhtien) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.soluong = soluong;
        this.thanhtien = thanhtien;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(double thanhtien) {
        this.thanhtien = thanhtien;
    }
    
    
}
