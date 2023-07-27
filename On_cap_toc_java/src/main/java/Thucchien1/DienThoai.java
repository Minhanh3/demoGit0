/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thucchien1;

/**
 *
 * @author Manhdepzai
 */
public class DienThoai {
    private String tensp;
    private int hang;
    private float gia;

    public DienThoai() {
    }

    public DienThoai(String tensp, int hang, float gia) {
        this.tensp = tensp;
        this.hang = hang;
        this.gia = gia;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getHang() {
        return hang;
    }

    public void setHang(int hang) {
        this.hang = hang;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }
    
    public String getStatuts(double gia){
        if(this.gia >= 10000){
            return "Tốt";
        }
        return "Bình Thường";
    };
}
