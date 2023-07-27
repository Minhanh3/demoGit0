/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucChien3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Manhdepzai
 */
public class SinhVienService {

    private ArrayList<SinhVien> listsv = new ArrayList<>();

    public ArrayList<SinhVien> fakedata() {
        listsv.add(new SinhVien("SV1", "Manhdz", 1, "2000"));
        listsv.add(new SinhVien("SV2", "Manhdz yy", 0, "2003"));
        listsv.add(new SinhVien("SV3", "Manhdz gg", 0, "2000"));
        return listsv;
    }

    public String them(SinhVien sv) {
        return (sv != null && listsv.add(sv)) ? "Them thanh cong" : "them that bai";
    }
public String xoa(int vitri){
    return (vitri >= 0 && listsv.remove(vitri) != null) ? " Xóa thanh cong" : "Xóa that bại";
}
    public String ghiFile(String path) {
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            try (FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                for (SinhVien sinhVien : listsv) {
                    oos.writeObject(sinhVien);
                }
            }
            return "Ghi File thanh cong";
        } catch (Exception e) {
            return "Ghi File that bai";
        }
    }
    
}
