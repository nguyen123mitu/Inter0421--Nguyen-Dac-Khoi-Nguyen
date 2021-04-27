package Models;

public class Room extends Services implements Comparable<Room> {
    private String dichVuMienPhiDiKem;

    public Room() {
    }

    public Room(String tenDichVu, int dienTich, int chiPhi, String kieuthue, int chiPhiThue, String dichVuMienPhiDiKem) {
        super(tenDichVu, dienTich, chiPhi, kieuthue, chiPhiThue);
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public String getDichVuMienPhiDiKem() {
        return dichVuMienPhiDiKem;
    }

    public void setDichVuMienPhiDiKem(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    @Override
    public String showInfor() {
        return super.showInfor() + "dichVuMienPhiDiKem: " + dichVuMienPhiDiKem;
    }
    @Override
    public int compareTo(Room o) {
        if(super.gettenDichVu().compareTo(o.gettenDichVu())>0){
            return  1;
        }else  if(super.gettenDichVu().compareTo(o.gettenDichVu())<0){
            return  -1;

        }else return 0;
    }

}
