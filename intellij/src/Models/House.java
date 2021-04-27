package Models;

import java.util.Comparator;

public class House extends Services implements Comparable<House> {
    private String tieuChuanPhong;
    private String moTaTienNghiKhac;
    private int soTang;

    public House() {
    }

    public House(String tenDichVu, int dienTich, int chiPhi, String kieuthue, int chiPhiThue, String tieuChuanPhong, String moTaTienNghiKhac, int soTang) {
        super(tenDichVu, dienTich, chiPhi, kieuthue, chiPhiThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghiKhac = moTaTienNghiKhac;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getMoTaTienNghiKhac() {
        return moTaTienNghiKhac;
    }

    public void setMoTaTienNghiKhac(String moTaTienNghiKhac) {
        this.moTaTienNghiKhac = moTaTienNghiKhac;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String showInfor() {
        return super.showInfor() + "tieuChuanPhong: " + tieuChuanPhong + "moTaTienNghiKhac: " + moTaTienNghiKhac + "soTang: " + soTang;
    }
    @Override
    public int compareTo(House o) {
        if(super.gettenDichVu().compareTo(o.gettenDichVu())>0){
            return  1;
        }else  if(super.gettenDichVu().compareTo(o.gettenDichVu())<0){
            return  -1;

        }else return 0;
    }

}
