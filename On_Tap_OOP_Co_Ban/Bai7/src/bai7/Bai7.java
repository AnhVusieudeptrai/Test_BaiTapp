/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai7;
import java.util.Scanner;
import Class.QLHS;
/**
 *
 * @author LENOVO
 */
public class Bai7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       		Scanner sc=new Scanner(System.in);
		
		QLHS list=new QLHS();
		
		list.nhapDanhSachHS(sc);
		
		System.out.println("Nhung hoc sinh sinh nam 1985 va que Thai Nguyen la:");
		list.timKiemThongTin(1985, "Thai Nguyen");
		
		System.out.println("Nhung hoc sinh hoc lop 10A1 la:");
		list.timKiemThongTin("10A1");
		
		sc.close();
	}
    }
    

