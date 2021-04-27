package Models;

import java.util.Comparator;

public class Services {
    private String tenDichVu;
    private int dienTich;
    private int chiPhi;
    private String kieuthue;
    private int chiPhiThue;

    public Services() {
    }

    public Services(String tenDichVu, int dienTich, int chiPhi, String kieuthue, int chiPhiThue) {
        this.tenDichVu = tenDichVu;
        this.dienTich = dienTich;
        this.chiPhi = chiPhi;
        this.kieuthue = kieuthue;
        this.chiPhiThue = chiPhiThue;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public int getchiPhi() {
        return chiPhi;
    }

    public void setchiPhi(int chiPhi) {
        this.chiPhi = chiPhi;
    }

    public String getkieuthue() {
        return kieuthue;
    }

    public void setkieuthue(String kieuthue) {
        this.kieuthue = kieuthue;
    }

    public int getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(int chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public String gettenDichVu() {
        return tenDichVu;
    }

    public void settenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String showInfor(){
        return "Services{" +
                "dienTich=" + dienTich +
                ", chiPhi=" + chiPhi +
                ", kieuthue='" + kieuthue + '\'' +
                ", chiPhiThue='" + chiPhiThue + '\'' +
                ", tenDichVu='" + tenDichVu + '\'' ;
    }
}
