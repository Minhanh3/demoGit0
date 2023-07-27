/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quanlykhachhang;

/**
 *
 * @author Manhdepzai
 */
public class KhachHang {

    private String maKH;
    private String tenKH;
    private String gioiTinh;
    private String sdt;
    private String nhomKH;

    public KhachHang() {
    }

    public KhachHang(String maKH, String tenKH, String gioiTinh, String sdt, String nhomKH) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
        this.nhomKH = nhomKH;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getNhomKH() {
        return nhomKH;
    }

    public void setNhomKH(String nhomKH) {
        this.nhomKH = nhomKH;
    }

    public int giamgia() {
        if (this.nhomKH == "VIP") {
            return 10;
        }
        if (this.nhomKH == "Thân Thiết") {
            return 5;
        }
        return 8;
    }

    public Object[] toRowTable() {
        return new Object[]{
            maKH, tenKH, gioiTinh, sdt, nhomKH
        };
    }
}
