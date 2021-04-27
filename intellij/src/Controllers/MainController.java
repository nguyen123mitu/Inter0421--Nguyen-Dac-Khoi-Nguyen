package Controllers;

import Models.Customer;
import Models.House;
import Models.Room;
import Models.Villa;

import java.lang.reflect.Array;
import java.util.*;

public class MainController {
    public static List<Villa> villaList = new ArrayList<>();
    public static List<House> houseList = new ArrayList<>();
    public static List<Room> roomList = new ArrayList<>();
    public static List<Customer> customerList = new ArrayList<>();
    public static TreeSet<Villa> treeSetVilla = new TreeSet<>();
    public static TreeSet<House> treeSetHouse = new TreeSet<>();
    public static TreeSet<Room> treeSetRoom = new TreeSet<>();
    public static TreeSet<Customer> treeSetCustomer = new TreeSet<>();

    public static Scanner input() {
        Scanner sc = new Scanner(System.in);
        return sc;
    }

    public static void main(String[] args) {
        displayMainMenu();

      //  Arrays.sort(villaList,Comparator.comparing(vi -> ));

    }

    public static void displayMainMenu() {
        while (true) {
            System.out.println("Vui lòng nhập !!");
            System.out.println("1:Add New Services");
            System.out.println("2:Show Services");
            System.out.println("3:Add New Customer");
            System.out.println("4:Show Information of Customer");
            System.out.println("5:Add New Booking");
            System.out.println("6:Show Information of Employee");
            switch (input().nextInt()) {
                case 1:
                    addNewServices();
                    break;
                case 2:
                    showServices();
                    break;
                case 3:
                    addNewCustomer();
                    break;
                case 4:
                    ShowInformationofCustomer();
                    break;
            }
//            case 5:
//                AddNewBooking;
//                break;
//        }
//            case 6:
//                ShowInformationofEmployee();
//                break;
//        }
//            case 7:
//                Exit();
//                break;
//        }


        }
    }

    private static void ShowInformationofCustomer() {
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
    }

//    private static void NameException(){
//        while(true){
//            if(input().)
//        }
//
//    }

    private static void showServices() {
        while (true) {
            System.out.println("Vui lòng nhập !!");
            System.out.println("1:Show All Villa");
            System.out.println("2:Show All House");
            System.out.println("3:Show All Room");
            System.out.println("4:Show All Name Villa Not Duplicate");
            System.out.println("5:Show All Name House Not Duplicate");
            System.out.println("6:Show All Name Room Not Duplicate");
            System.out.println("7:Back To Menu");
            System.out.println("8:Exit");
            switch (input().nextInt()) {
                case 1:
                    showAllVilla();
                    break;
                case 2:
                    showAllHoues();
                    break;
                case 3:
                    showAllRoom();
                    break;
                case 4:
                    showAllNameVillaNotDulicate();
                    break;
                case 5:
                    showAllNameHouseNotDulicate();
                    break;
                case 6:
                    showAllNameRoomNotDulicate();
                    break;
                case 7:
                    displayMainMenu();
                case 8:
                    System.exit(0);
                default:
                    System.out.println("bạn nhập sai chức năng !");
                    System.out.println("Vui lòng nhập lại ");
                    break;
            }
        }
    }

    private static void showAllNameRoomNotDulicate() {
        treeSetRoom.addAll(roomList);
        for (Room room : treeSetRoom) {
            System.out.println(room.showInfor());
        }

    }

    private static void showAllNameHouseNotDulicate() {
        treeSetHouse.addAll(houseList);
        for (House house : treeSetHouse) {
            System.out.println(house.showInfor());
        }

    }

    private static void printf(Villa[] villas) {
        for (Villa villa : villas) {
            System.out.println(villa);
        }
    }

    private static void showAllNameVillaNotDulicate() {
        treeSetVilla.addAll(villaList);
        for (Villa villa : treeSetVilla) {
            System.out.println(villa.showInfor());
        }

    }

    private static void showAllRoom() {
        for (Room room : roomList) {
            System.out.println(room.showInfor());
        }
    }

    private static void showAllHoues() {
        for (House house : houseList) {
            System.out.println(house.showInfor());
        }
    }

    private static void showAllVilla() {
        for (Villa villa : villaList) {
            System.out.println(villa.showInfor());
        }
    }

    public static void addNewServices() {

        while (true) {
            System.out.println("Vui lòng nhập");
            System.out.println("1:Add New Villa");
            System.out.println("2:Add New House");
            System.out.println("3:Add New Room");
            System.out.println("4:Back To Menu");
            System.out.println("5:Exit");
            switch (input().nextInt()) {
                case 1:
                    addNewVilla();
                    break;
                case 2:
                    addNewHouse();
                    break;
                case 3:
                    addNewRoom();
                    break;
                case 4:
                    displayMainMenu();
                case 5:
                    System.exit(0);
                default:
                    System.out.println("bạn nhập sai chức năng !");
                    System.out.println("Vui lòng nhập lại ");
                    break;
            }
        }
    }

    private static void addNewRoom() {
        System.out.println("Nhap Ten Dich Vu: ");
        String nameService = input().nextLine();
        System.out.println("Nhap Dien Tich: ");
        int dienTich = input().nextInt();
        System.out.println("Nhap Chi Phi: ");
        int chiPhi = input().nextInt();
        System.out.println("Nhap Kieu Thue: ");
        String kieuThue = input().nextLine();
        System.out.println("Nhap Chi Phi Thue: ");
        int chiPhiThue = input().nextInt();
        System.out.println("dich Vu Mien Phi Di Kem:");
        String dichVuMienPhiDiKem = input().nextLine();
        Room room = new Room(nameService,
                dienTich, chiPhi, kieuThue, chiPhiThue, dichVuMienPhiDiKem);
        roomList.add(room);
    }

    private static void addNewHouse() {
        System.out.println("Nhap Ten Dich Vu: ");
        String nameService = input().nextLine();
        System.out.println("Nhap Dien Tich: ");
        int dienTich = input().nextInt();
        System.out.println("Nhap Chi Phi: ");
        int chiPhi = input().nextInt();
        System.out.println("Nhap Kieu Thue: ");
        String kieuThue = input().nextLine();
        System.out.println("Nhap Chi Phi Thue: ");
        int chiPhiThue = input().nextInt();
        System.out.println("Tieu Chuan Phong:");
        String tieuChuanPhong = input().nextLine();
        System.out.println("Mo Ta Tien Nghi Khac:");
        String moTaTienNghiKhac = input().nextLine();
        System.out.println("So Tang:");
        int soTang = input().nextInt();
        House house = new House(nameService,
                dienTich, chiPhi, kieuThue, chiPhiThue, tieuChuanPhong, moTaTienNghiKhac, soTang);
        houseList.add(house);
    }

    private static void addNewVilla() {
        System.out.println("nhap bao nhieu Villa:");
        int a = Integer.parseInt(input().nextLine());
        for (int i = 0; i <= a; i++) {
            System.out.println("Nhap Ten Dich Vu: " + i);
            String nameService = input().nextLine();
            System.out.println("Nhap Dien Tich: ");
            int dienTich = input().nextInt();
            System.out.println("Nhap Chi Phi: ");
            int chiPhi = input().nextInt();
            System.out.println("Nhap Kieu Thue: ");
            String kieuThue = input().nextLine();
            System.out.println("Nhap Chi Phi Thue: ");
            int chiPhiThue = input().nextInt();
            System.out.println("Tieu Chuan Phong:");
            String tieuChuanPhong = input().nextLine();
            System.out.println("Mo Ta Tien Nghi Khac:");
            String moTaTienNghiKhac = input().nextLine();
            System.out.println("Dien Tich Ho Boi:");
            int dienTichHoBoi = input().nextInt();
            System.out.println("So Tang:");
            int soTang = input().nextInt();
            Villa villa = new Villa(nameService,
                    dienTich, chiPhi, kieuThue, chiPhiThue, tieuChuanPhong, moTaTienNghiKhac, dienTichHoBoi, soTang);
            villaList.add(villa);
        }
    }

    private static void addNewCustomer() {
        System.out.println("Vui lòng nhập customer");
        int a = Integer.parseInt(input().nextLine()) ;
            for (int i = 0; i <= a; i++) {
                System.out.println("Nhập Họ và Tên :");
                String hoVaTen = input().nextLine();
                System.out.println("Nhập Ngày Sinh :");
                String ngaySinh = input().nextLine();
                System.out.println("Nhập Giới Tính :");
                String gioiTinh = input().nextLine();
                System.out.println("Nhập So CMND :");
                int soCMND = input().nextInt();
                System.out.println("Nhập Số Điện Thoại:");
                int soDienThoai = input().nextInt();
                System.out.println("Nhập Email:");
                String email = input().nextLine();
                System.out.println("Nhập Loại Khách:");
                String loaiKhach = input().nextLine();
                System.out.println("Nhập Địa Chỉ:");
                String diaChi = input().nextLine();
                Customer customer = new Customer(hoVaTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email, loaiKhach, diaChi);
                customerList.add(customer);
            }
        }

    }

