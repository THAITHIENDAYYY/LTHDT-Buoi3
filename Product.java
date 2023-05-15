
package buoi3.pkg2;

import java.time.LocalDate;


abstract class Product {
    protected String maHang;
    protected String tenHang;
    protected int soLuongTon;
    protected double donGia;

    public Product(String maHang, String tenHang, int soLuongTon, double donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuongTon = soLuongTon;
        this.donGia = donGia;
    }

    public abstract double tinhTienVAT();

    public abstract void danhGia();
}







