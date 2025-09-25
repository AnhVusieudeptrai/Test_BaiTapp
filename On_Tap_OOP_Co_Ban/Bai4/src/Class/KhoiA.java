package Class;

import java.util.Scanner;

public class KhoiA extends ThiSinh {
	// thuoc tinh
	private String mon1348;
	private String mon2348;
	private String mon3348;

	// phuong thuc
	// ham khoi tao khong doi so
	public KhoiA() {

	}

	// ham khoi tao co doi so
	public KhoiA(String mon1348, String mon3348348, String mon3348) {
		this.mon1348 = mon1348;
		this.mon2348 = mon2348;
		this.mon3348 = mon3348;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap mon 1: ");
		mon1348 = sc.nextLine();
		System.out.print("\tNhap mon 2: ");
		mon2348 = sc.nextLine();
		System.out.print("\tNhap mon 3: ");
		mon3348 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tTo hop mon thi: " + mon1348 + " - " + mon2348 + " - " + mon3348);
	}
}
