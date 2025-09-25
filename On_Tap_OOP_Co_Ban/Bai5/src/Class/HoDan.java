package Class;

import java.util.Date;
import java.util.Scanner;

public class HoDan extends Nguoi {
	// thuoc tinh
	private int soNguoi348;
	private int soNha348;
	private Nguoi[] list; // list la mang danh sach chua cac thanh vien trong ho

	// phuong thuc
	// ham khoi tao khong doi so
	public HoDan() {
		list = new Nguoi[10];
	}

	// ham khoi tao co doi so
	public HoDan(String hoTen, Date ngaySinh, String ngheNghiep, int soNguoi348, int soNha348) {
		super(hoTen, ngaySinh, ngheNghiep);
		this.soNguoi348 = soNguoi348;
		this.soNha348 = soNha348;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap so nguoi: ");
		soNguoi348 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha348 = sc.nextInt();
		sc.nextLine();
		System.out.println("\tNhap thong tin cho tung nguoi trong ho:");
		for (int i = 0; i < soNguoi348; i++) {
			System.out.println("Nguoi thu " + (i + 1) + " la:");
			list[i] = new Nguoi();
			list[i].nhapThongTin(sc);
		}
	}

	// hien thi
	public void hienThiThongTin() {
		System.out.println("\tSo nguoi: " + soNguoi348);
		System.out.println("\tSo nha: " + soNha348);
		System.out.println("\tThong tin cua tung nguoi trong gia dinh:");
		for (int i = 0; i < soNguoi348; i++) {
			System.out.println("Nguoi thu " + (i + 1) + " la:");
			list[i].hienThiThongTin();
		}
	}

	// ham lay ra thanh vien trong ho dan
	public Nguoi[] getList() {
		return list;
	}

	// ham lay ra so thanh vien trong ho gia dinh
	public int getSoNguoi() {
		return soNguoi348;
	}
}
