package Buoi2;

import java.util.ArrayList;

public class KhachHangService {

    private ArrayList<KhachHang> listKH = new ArrayList<>();

    public ArrayList<KhachHang> fakedata() {
        listKH.add(new KhachHang("Nguyễn", "Manh", 82, "Hà noi"));
        listKH.add(new KhachHang("Nguyễn", "Minh anh", 22, "Hà Phong"));
        listKH.add(new KhachHang("Nguyễn", "Manh hung", 25, "Hà Ki"));
        return listKH;
    }

}
