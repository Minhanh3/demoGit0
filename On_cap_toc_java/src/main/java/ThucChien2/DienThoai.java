/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucChien2;

/**
 *
 * @author Manhdepzai
 */
public class DienThoai {

    private String madt, hang;
    private int mausac;
    private String bonho;
    private int gia;

    public DienThoai() {
    }

    public DienThoai(String madt, String hang, int mausac, String bonho, int gia) {
        this.madt = madt;
        this.hang = hang;
        this.mausac = mausac;
        this.bonho = bonho;
        this.gia = gia;
    }

    public String getMadt() {
        return madt;
    }

    public void setMadt(String madt) {
        this.madt = madt;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public int getMausac() {
        return mausac;
    }

    public void setMausac(int mausac) {
        this.mausac = mausac;
    }

    public String getBonho() {
        return bonho;
    }

    public void setBonho(String bonho) {
        this.bonho = bonho;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }


    public String getStatus(int gia) {
        if (this.gia >= 5000) {
            return "Sản phẩm đắt";
        }
        return "Sản phẩm bình thường";
    }
}
