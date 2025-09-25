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
public class PhanSo {
    //Thuộc tính (bao đóng)
    private int tuSo348;
    private int mauSo348;
    
    
    //Phương thức
    //Hàm khởi tạo không đối
    public PhanSo(){
        tuSo348 = 0;
        mauSo348 = 1;
    }
    
    //Hàm khởi tạo có đối
    public PhanSo(int tuSo348,int mauSo348){
        this.tuSo348 = tuSo348;
        this.mauSo348 = mauSo348;
    }
    
    //Hàm nhập phân số
    public void NhapPS(Scanner sc){
        int a348;
        int b348;
        
        do{
            System.out.println("\nNhap vao tu so: ");
            a348 = sc.nextInt();
            
            System.out.println("\nNhap vao mau so: ");
            b348 = sc.nextInt();
            
            //Check
            if(b348 == 0){
                System.out.println("\nLoi! Mau so khong duoc bang 0.Nhap lai!");
            }else{
                tuSo348 = a348;
                mauSo348 =b348;
            }
        }
        while(b348 == 0);
    }
    
        //Hàm xuất
       public void Xuat(){
        if(tuSo348 * mauSo348 < 0){
            System.out.println("\t-" +Math.abs(tuSo348) + "/" +Math.abs(mauSo348));
        }else{
            System.out.println("\t"+Math.abs(tuSo348) + "/" +Math.abs(mauSo348));
        }
       }
       
       //Hàm cộng
       public PhanSo CongPS(PhanSo ps2){
           int a348 = tuSo348*ps2.mauSo348 + ps2.tuSo348*mauSo348;
           int b348 = mauSo348 * ps2.mauSo348;
           
           return new PhanSo(a348,b348);
       }
       
       //Hàm nhân
       public PhanSo NhanPS(PhanSo ps2){
           int a348 = tuSo348*ps2.tuSo348;
           int b348 = mauSo348*ps2.mauSo348;
           
           return new PhanSo(a348,b348);
       }
       
       //Hàm chia 
       public PhanSo ChiaPS(PhanSo ps2){
           int a348 = tuSo348*ps2.mauSo348;
           int b348 = mauSo348*ps2.tuSo348;
           
           return new PhanSo(a348,b348);
       }
       
       //Hàm tìm USCLN
       private int timUSCLN(int a348 , int b348){
           int r348 = a348%b348;
           
           while(r348!=0){
               a348=b348;
               b348=r348;
               r348=a348%b348;
           }
           return b348;
       }
       
       //Hàm kiểm tra phân số tối giản hay chưa
       public boolean kiemTraToiGian(){
           if(timUSCLN(tuSo348,mauSo348) == 1){
               return true;
           }
           return false;
       }
       
       //Hàm tối giản 
       public void toiGianPS(){
           int x348 = timUSCLN(tuSo348,mauSo348);
           
           tuSo348/=x348;
           mauSo348/=x348;
       }
    }

