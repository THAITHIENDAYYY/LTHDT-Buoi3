
package buoi3.pkg2;

class Ceramic extends Product {
    private String nhaSanXuat;
    private String ngayNhapKho;

    public Ceramic(String maHang, String tenHang, int soLuongTon, double donGia, String nhaSanXuat, String ngayNhapKho) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.nhaSanXuat = nhaSanXuat;
        this.ngayNhapKho = ngayNhapKho;
    }

    @Override
    public double tinhTienVAT() {
        return donGia * soLuongTon * 0.1;
    }

    @Override
    public void danhGia() {
        System.out.println("----- ĐÁNH GIÁ HÀNG SÀNH SỨ -----");
        System.out.println("Ma hang: " + maHang);
        System.out.println("Ten hang: " + tenHang);
                System.out.println("So luong ton: " + soLuongTon);
        System.out.println("Don gia: " + donGia);
        System.out.println("Tien VAT: " + tinhTienVAT());
        if (soLuongTon > 50 && ngayNhapKho.compareTo("10 ngay truoc") > 0) {
            System.out.println("Hang sanh su co so luong ton lon va thoi gian luu kho lau.");
            System.out.println("Đanh gia: Ban cham");
        } else {
            System.out.println("Hang sanh su khong co đanh gia đac biet.");
            System.out.println("Đanh gia: Khong đanh gia");
        }
        System.out.println("----------------------------------");
    }

  
}
