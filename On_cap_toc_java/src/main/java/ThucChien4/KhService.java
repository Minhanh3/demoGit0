/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucChien4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Manhdepzai
 */
public class KhService {

    private ArrayList<KhachHang> listkh = new ArrayList<>();

    public ArrayList<KhachHang> fakedata() {
        listkh.add(new KhachHang("KH1", "Manh", 1, "Than thiet", "02586"));
        listkh.add(new KhachHang("KH2", "Manh", 1, "vip", "02586"));
        listkh.add(new KhachHang("KH3", "Manh", 0, "Moi", "02586"));
        return listkh;
    }
    
    public String them(KhachHang kh){
        return (kh != null && listkh.add(kh)) ? "Them thanh cong" : "Them that bai";
    }
    
    public String ghifile(String path){
        File file = new File(path);
        
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            try(FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                for (KhachHang khachHang : listkh) {
                    oos.writeObject(khachHang);
                }
            }
            return "Doc thanh cong";
        } catch (Exception e) {
            return "Doc that bai";
        }
    
    }
}
