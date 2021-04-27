package Models;

public class Villa extends Services implements  Comparable<Villa>{
    private String tieuChuanPhong;
    private String moTaTienNghiKhac;
    private int dienTichHoBoi;
    private int soTang;

    public Villa() {
    }

    public Villa(String tenDichVu, int dienTich,
                 int chiPhi, String kieuthue, int chiPhiThue,
                 String tieuChuanPhong, String moTaTienNghiKhac, int dienTichHoBoi, int soTang) {
        super(tenDichVu, dienTich, chiPhi, kieuthue, chiPhiThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghiKhac = moTaTienNghiKhac;
        this.dienTichHoBoi = dienTichHoBoi;
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

    public int getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(int dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String showInfor() {
        return super.showInfor() + " tieuChuanPhong: " + tieuChuanPhong + " moTaTienNghiKhac: " + moTaTienNghiKhac + " dienTichHoBoi: " + dienTichHoBoi + " soTang: " + soTang;
    }

    @Override
    public int compareTo(Villa o) {
        if(super.gettenDichVu().compareTo(o.gettenDichVu())>0){
            return  1;
        }else  if(super.gettenDichVu().compareTo(o.gettenDichVu())<0){
            return  -1;

        }else return 0;
    }

}
