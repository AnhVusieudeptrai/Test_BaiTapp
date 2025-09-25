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
public class KySu extends CanBo {
    //thuoc tinh
    private String nganhDaoTao348;
    //phuong thuc
    //Ham khoi tao khong doi
    public KySu(){
        
    }
    
    //Ham khoi tao co doi
    public KySu(String hoTen348,String ngaySinh348,String gioiTinh348,String diaChi348,String nganhDaoTao348){
        super(hoTen348,ngaySinh348,gioiTinh348,diaChi348);
        this.nganhDaoTao348=nganhDaoTao348;
    }
    
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.print("\tNhap nhanh dao tao: ");
        nganhDaoTao348=sc.nextLine();
    }
    
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("\tNganh dao tao: "+nganhDaoTao348);
        
    }
}
