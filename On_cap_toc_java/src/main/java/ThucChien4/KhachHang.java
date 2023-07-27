/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucChien4;

/**
 *
 * @author Manhdepzai
 */
public class KhachHang {
    String makh;
    String tenkh;
    int gioitinh;
    String nhomkh;
    String sdt;

    public KhachHang() {
    }

    public KhachHang(String makh, String tenkh, int gioitinh, String nhomkh, String sdt) {
        this.makh = makh;
        this.tenkh = tenkh;
        this.gioitinh = gioitinh;
        this.nhomkh = nhomkh;
        this.sdt = sdt;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNhomkh() {
        return nhomkh;
    }

    public void setNhomkh(String nhomkh) {
        this.nhomkh = nhomkh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
    
}
