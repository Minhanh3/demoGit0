package Manhnd;

import java.util.ArrayList;

public class KhachHangService {

    private ArrayList<KhachHang> dskh = new ArrayList<>();

    public void insert(KhachHang kh) {
        dskh.add(kh);
    }

    public ArrayList<KhachHang> getDskh() {
        return dskh;
    }

    public void setDskh(ArrayList<KhachHang> dskh) {
        this.dskh = dskh;
    }

}
