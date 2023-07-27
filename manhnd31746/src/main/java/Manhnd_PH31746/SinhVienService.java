package Manhnd_PH31746;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manhdepzai
 */
public class SinhVienService {

    private ArrayList<SinhVien> listSV = new ArrayList<>();

    private List<SinhVien> fakedata() {
        listSV.add(new SinhVien("SV1", "Manh", 0, "2000"));

        return listSV;
    }

//    public String insert(SinhVien sv) {
//        return (sv != null && listSV.add(sv)) ? " Thêm thành cồng" : " Thêm thất bại";
//    }
//    
    public String xoa(int index) {
        return (index >= 0 && listSV.remove(index) != null) ? "XÓa thành công" : "Xóa thất bại";

    }

    public String ghifile(String path) {
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            try (
                    FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                for (SinhVien kh : listSV) {
                    oos.writeObject(kh);
                }
            }
            return "Ghi file thành công";
        } catch (Exception e) {
            return "Ghi file thất bại";
        }

    }

    public String docfile(String path) {
        File file = new File(path);
        try {
            if (!file.exists()) {
                return "File không tồn tại";
            }
            try (
                    FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis)) {
                while (fis.available() > 0) {
                    listSV.add((SinhVien) ois.readObject());
                }
            }
            return "Đọc thành công";
        } catch (Exception e) {
            return "Đọc thất bại";
        }

    }
}
