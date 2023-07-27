/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucChien2;

import java.util.ArrayList;

/**
 *
 * @author Manhdepzai
 */
public class DienThoaiService {

    private ArrayList<DienThoai> listdt = new ArrayList<>();

    public ArrayList<DienThoai> fakedata() {
        listdt.add(new DienThoai("DT1", "Apple", 1, "64", 12000));
        listdt.add(new DienThoai("DT3", "Samsung", 1, "256", 200));
        listdt.add(new DienThoai("DT2", "Apple", 1, "128", 1000));
        return listdt;
    }
    
    public String them(DienThoai dt){
        return (dt != null && listdt.add(dt)) ? "Thêm thanh cong" : " Thêm that bai";
    }
}
