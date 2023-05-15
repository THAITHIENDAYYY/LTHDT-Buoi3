
package buoi3.pkg2;

class electronic extends Product {
    private int thoiGianBaoHanh;
    private double congSuat;

    public electronic(String maHang, String tenHang, int soLuongTon, double donGia, int thoiGianBaoHanh, double congSuat) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
    }

    @Override
    public double tinhTienVAT() {
        return donGia * soLuongTon * 0.1;
    }

    @Override
    public void danhGia() {
        System.out.println("----- ĐÁNH GIÁ HÀNG ĐIỆN MÁY -----");
        System.out.println("Ma hang: " + maHang);
        System.out.println("Ten hang: " + tenHang);
        System.out.println("So luong ton: " + soLuongTon);
        System.out.println("Đon gia: " + donGia);
        System.out.println("Tien VAT: " + tinhTienVAT());
        if (soLuongTon < 3) {
            System.out.println("So luong ton it.");
            System.out.println("Đanh gia: Ban duoc");
        } else {
            System.out.println("So luong ton nhieu.");
            System.out.println("Đanh gia: Khong danh gia");
        }
        System.out.println("---------------------------------");
    }

    
}