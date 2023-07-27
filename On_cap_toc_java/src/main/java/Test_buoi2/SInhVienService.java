/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test_buoi2;

import java.util.ArrayList;

/**
 *
 * @author Manhdepzai
 */
public class SInhVienService {

    private ArrayList<SInhVien> listsv = new ArrayList<>();

    public ArrayList<SInhVien> fakedata() {
        listsv.add(new SInhVien("SV1", "Manh", 52, "Nctt"));
        listsv.add(new SInhVien("SV1", "Manh", 52, "Nctt"));
        listsv.add(new SInhVien("SV1", "Manh", 52, "Nctt"));
        return listsv;
    }
}
