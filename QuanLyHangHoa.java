
package buoi3.pkg2;

import java.util.List;
import java.util.ArrayList;
class QuanLyHangHoa {
    private List<Product> danhSachHangHoa;

    public QuanLyHangHoa() {
        danhSachHangHoa = new ArrayList<>();
    }

    public void themHangHoa(Product hangHoa) {
        danhSachHangHoa.add(hangHoa);
        System.out.println("Da them hang hoa vao danh sach.");
    }

    public void inDanhSachHangHoa() {
        if (danhSachHangHoa.isEmpty()) {
            System.out.println("Danh sach hàng hoa trong.");
        } else {
            System.out.println("----- DANH SACH HANG HOA -----");
            for (Product hangHoa : danhSachHangHoa) {
                if (hangHoa instanceof Food) {
                    System.out.println("Loai hang: Thuc pham");
                }
                else if (hangHoa instanceof Ceramic) {
                    System.out.println("Loai hang: Sanh su");
                } else if (hangHoa instanceof electronic) {
                    System.out.println("Loai hang: Dien may");
                }

                System.out.println("Ma hang: " + hangHoa.maHang);
                System.out.println("Ten hang: " + hangHoa.tenHang);
                System.out.println("So luonng ton: " + hangHoa.soLuongTon);
                System.out.println("Don gia: " + hangHoa.donGia);
                System.out.println("--------------------------------");
            }
        }
    }

    public Product timHangHoa(String maHang) {
        for (Product hangHoa : danhSachHangHoa) {
            if (hangHoa.maHang.equals(maHang)) {
                return hangHoa;
            }
        }
        return null;
    }
}
