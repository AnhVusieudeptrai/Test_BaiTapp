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
public class CanBo {
        //Thuộc tính
    private String hoTen348;
    private String ngaySinh348;
    private String gioiTinh348;
    private String diaChi348;
    
    //Phuong thuc
    //Ham khoi tao khong doi
    public CanBo(){  
    }
    //Ham khoi tao co doi
    public CanBo(String hoTen348, String ngaySinh348, String gioiTinh348, String diaChi348){
        this.hoTen348 = hoTen348;
        this.ngaySinh348=ngaySinh348;
        this.gioiTinh348=gioiTinh348;
        this.diaChi348=diaChi348;
    }
    //Ham nhap
    public void nhapThongTin(Scanner sc){
        System.out.println("\tNhap ho ten: ");
        hoTen348=sc.nextLine();
        System.out.println("\tNhap ngay sinh (dd/MM/yy): ");
        ngaySinh348=sc.nextLine();
        System.out.println("\tNhap gioi tinh: ");
        gioiTinh348=sc.nextLine();
        System.out.println("\tNhap dia chi: ");
        diaChi348=sc.nextLine();
    }
    //Ham hien thi
    public void hienThiThongTin(){
        System.out.printf("\tHo ten: "+hoTen348);
        System.out.printf("\tNgay sinh: "+ngaySinh348);
        System.out.printf("\tGioi tinh: "+gioiTinh348);
        System.out.printf("\tDia chi: "+diaChi348);
    }
    
    //Ham lay thong tin ho ten
    public String getHoTen(){
        return this.hoTen348;
    }
}
