/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Nguoi {
    protected String hoTen348;
    protected Date ngSinh348;
    protected int CMND348;
    
    public Nguoi(){
    
    }
    public Nguoi( String hoTen348,Date ngSinh348,int CMND348 ){
        this.hoTen348=hoTen348;
        this.ngSinh348=ngSinh348;
        this.CMND348=CMND348;
    }
    public void nhapThongTin(Scanner sc)       {
        System.out.print("\t Nhap ho ten:");  
        hoTen348=sc.nextLine();
        System.out.print("\t Nhap ngay sinh:");
        String strDate=sc.nextLine();
        ngSinh348=strToDate(strDate);
        System.out.print("\t Nhap CMND:");
        CMND348=sc.nextInt();
    }   
    private Date strToDate(String strDate){
        Date date= null;
        SimpleDateFormat spf= new SimpleDateFormat("dd-MM-yyyy");
        try{
            date=spf.parse(strDate);
        } catch (ParseException e){
            System.out.println("Loi dinh dang ngay thang!!");
        }
        return date;
    }
    public void hienThiThongTin() {
    System.out.println("\tHo ten: " + hoTen348);
    System.out.println("\tNgay sinh: " + ngSinh348);
    System.out.println("\tHo ten: " + hoTen348);
    }   
    public int getCMND348(){
        return CMND348;
    }
}
