
package buoi3.pkg2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyHangHoa quanLy = new QuanLyHangHoa();

        int choice = 0;
        while (choice != 4) {
            System.out.println("----- MENU -----");
            System.out.println("1. Them hang hoa");
            System.out.println("2. In danh sach hang hoa");
            System.out.println("3. Danh gia hang hoa");
            System.out.println("4. Thoat");
            System.out.print("Nhap lua chon: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng new line

            switch (choice) {
                case 1:
                    themHangHoa(scanner, quanLy);
                    break;
                case 2:
                    quanLy.inDanhSachHangHoa();
                    break;
                case 3:
                    danhGiaHangHoa(scanner, quanLy);
                    break;
                case 4:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        }

        scanner.close();
    }

    public static void themHangHoa(Scanner scanner, QuanLyHangHoa quanLy) {
        System.out.println("----- THEM HANG HOA -----");
        System.out.println("1. Hang thuc pham");
        System.out.println("2. Hang sanh su");
        System.out.println("3. Hang dien may");
        System.out.print("Chon loai hang hoa: ");
        int loaiHang = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng new line

        System.out.print("Nhap ma hang: ");
        String maHang = scanner.nextLine();
        System.out.print("Nhap ten hang: ");
        String tenHang = scanner.nextLine();
        System.out.print("Nhap so luong ton: ");
        int soLuongTon = scanner.nextInt();
        System.out.print("Nhap đon gia: ");
        double donGia = scanner.nextDouble();

        switch (loaiHang) {
            case 1:
                System.out.print("Nhap ngay san xuat: ");
                String ngaySanXuat = scanner.next();
                System.out.print("Nhap ngay het han: ");
                String ngayHetHan = scanner.next();
                scanner.nextLine(); //
                System.out.print("Nhap nha cung cap: ");
                String nhaCungCap = scanner.nextLine();
                Food hangThucPham = new Food(maHang, tenHang, soLuongTon, donGia, ngaySanXuat, ngayHetHan, nhaCungCap);
                quanLy.themHangHoa(hangThucPham);
                break;
            case 2:
                System.out.print("Nhap nha san xuat: ");
                String nhaSanXuat = scanner.next();
                System.out.print("Nhap ngay nhap kho: ");
                String ngayNhapKho = scanner.next();
                scanner.nextLine(); // Đọc bỏ dòng new line
                Ceramic hangSanhSu = new Ceramic(maHang, tenHang, soLuongTon, donGia, nhaSanXuat, ngayNhapKho);
                quanLy.themHangHoa(hangSanhSu);
                break;
            case 3:
                System.out.print("Nhap thoi gian bao hanh: ");
                int thoiGianBaoHanh = scanner.nextInt();
                System.out.print("Nhap cong suat: ");
                double congSuat = scanner.nextDouble();
                electronic hangDienMay = new electronic(maHang, tenHang, soLuongTon, donGia, thoiGianBaoHanh, congSuat);
                quanLy.themHangHoa(hangDienMay);
                break;
            default:
                System.out.println("Lua chon khong hop le. Khong them hang hoa.");
        }
    }

    public static void danhGiaHangHoa(Scanner scanner, QuanLyHangHoa quanLy) {
        System.out.print("Nhap ma hang hoa can danh gia: ");
        String maHang = scanner.nextLine();
        Product hangHoa = quanLy.timHangHoa(maHang);
        if (hangHoa != null) {
            hangHoa.danhGia();
        } else {
            System.out.println("Khong tim thay hang hoa voi ma " + maHang);
        }
    }
}