/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class KhachTro extends Nguoi{
    private int soNgayTro348;
    private String loaiPhong348;
    private double giaPhong348;
    
    public KhachTro(){
       
    }
    public KhachTro(String hoTen348,int CMND348,int soNgayTro348,String loaiPhong348,Double giaPhong348 ){
        this.hoTen348=hoTen348;
        this.CMND348=CMND348;
        this.soNgayTro348=soNgayTro348;
        this.loaiPhong348=loaiPhong348;
        this.giaPhong348=giaPhong348;
    }
    // ham nhap
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);

        System.out.print("\tNhap so ngay tro: ");
        soNgayTro348 = sc.nextInt(); 
        sc.nextLine();

        System.out.print("\tNhap loai phong: ");
        loaiPhong348 = sc.nextLine();

        System.out.print("\tNhap gia phong: ");
        giaPhong348 = sc.nextDouble(); 
        sc.nextLine();
    }

    // ham hien thi
    public void hienThiThongTin() {
        super.hienThiThongTin();

        System.out.println("\tSo ngay tro: " + soNgayTro348);
        System.out.println("\tLoai phong: " + loaiPhong348);
        System.out.println("\tGia phong: " + giaPhong348);
    }
    public int getSoNgayTro(){
        return soNgayTro348;
    }
    public Double getGiaPhong(){
        return giaPhong348;
    }
}
