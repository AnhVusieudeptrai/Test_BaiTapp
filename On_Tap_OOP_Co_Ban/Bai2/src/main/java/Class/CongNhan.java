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
public class CongNhan extends CanBo {
    //thuoc tinh
    private String bac348;
   
    //phuong thuc
    //ham khoi tao khong doi
    public CongNhan(){
    }
    
    //ham khoi tao co doi
    public CongNhan(String hoTen348,String ngaySinh348,String gioiTinh348,String diaChi348,String nganhDaoTao348){
        super(hoTen348,ngaySinh348,gioiTinh348,diaChi348);
        this.bac348=bac348;
    }
    
    //Ham nhap
    public void nhapThongTin(Scanner sc){
      super.nhapThongTin(sc);
      System.out.print("\tNhap bac: ");
      bac348=sc.nextLine();
    }
    
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("\tBac: "+bac348);
    }
}
