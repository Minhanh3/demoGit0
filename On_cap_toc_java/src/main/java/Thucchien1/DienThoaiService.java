/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thucchien1;

import java.util.ArrayList;

/**
 *
 * @author Manhdepzai
 */
public class DienThoaiService {

    private ArrayList<DienThoai> listdt = new ArrayList<>();

    public ArrayList<DienThoai> fakedata() {
        listdt.add(new DienThoai("Iphone 11", 1, 120000));
        listdt.add(new DienThoai("Iphone 14", 0, 10000));
        listdt.add(new DienThoai("Iphone Xs Max", 1, 20000));
        return listdt;
    }

    //thêm
    public String insertDt(DienThoai dt) {
        return (dt != null && listdt.add(dt)) ? " Thêm Thành công" : " Thêm Thất Bại";
    }

    //sửa
    public String updateKh(int vitri, DienThoai dt) {
        if (vitri >= 0) {
            if (dt != null) {
                listdt.set(vitri, dt);
                return "Cập nhật thành công";
            }
            return "Vui lòng nhập thông tin update";
        }
        return "Update thất bại";
    }
    
    //xóa
    public String remove(int vitri , DienThoai dt){
        if(vitri >= 0 && listdt.remove(vitri)!= null){
            return "Xóa thành công";
        }
        return "Xóa thất bại";
    }

}
