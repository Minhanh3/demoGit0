/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quanlykhachhang;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manhdepzai
 */
public class KhachHangService implements KhachHangInterface {

    private List<KhachHang> khService = new ArrayList<>();

    @Override
    public List<KhachHang> fakedata() {
        khService.add(new KhachHang("KH2", "NG MANH", "Nam", "0369258147", "VIP"));
        khService.add(new KhachHang("KH3", "NG QUAN", "Nữ", "0369258147", "Mới"));
        khService.add(new KhachHang("KH4", "NG HANH", "Nam", "0369258147", "VIP"));
        khService.add(new KhachHang("KH5", "NG HA", "Nữ", "0369258147", "Thân thiết"));
        return khService;
    }

    @Override
    public String them(KhachHang khachHang) {
        return (khachHang != null && khService.add(khachHang)) ? " Thêm Thành Công" : " Thêm Thất bại";
    }

    @Override
    public String ghifile(String file) {
        
        File file = new File(file);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            try (FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                for (KhachHang dt : khService) {
                    oos.writeObject(dt);
                }
            }
            return "Ghi file thành công";
        } catch (Exception e) {
            return "Ghi file thất bại";
        }
    }

    @Override
    public String docfile(String file) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
