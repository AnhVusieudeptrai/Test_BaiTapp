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
public class NhanVien extends CanBo {
    //Thuoc tinh
    private String congViec348;
    
            
    // Phuong thuc
    //Ham khoi tao khong doi
    public NhanVien(){
        
    }
    //Ham khoi tao co doi
    public NhanVien(String hoTen348,String ngaySinh348,String gioiTinh348,String diaChi348){
        super(hoTen348,ngaySinh348,gioiTinh348,diaChi348);
        this.congViec348=congViec348;
    }
    
    //Ham nhap
    public void nhapThongTin(Scanner sc){
        super .nhapThongTin(sc);
        System.out.print("\tNhap cong viec: ");
        congViec348=sc.nextLine();
    }
    
    //Ham hien thi
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("\tCong viec: "+congViec348);
    }
}


