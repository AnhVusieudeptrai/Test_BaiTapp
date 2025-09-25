package Class;

import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	protected String hoTen348;
	protected String ngaySinh348;
	protected String queQuan348;

	// phuong thuc
	// ham khoi tao khong so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen348, String ngaySinh348, String queQuan348) {
		this.hoTen348 = hoTen348;
		this.ngaySinh348 = ngaySinh348;
		this.queQuan348 = queQuan348;
	}

	// ham nhap thong tin
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen348 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		ngaySinh348 = sc.nextLine();
		System.out.print("\tNhap que quan: ");
		queQuan348 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen348);
		System.out.println("\tNgay sinh: " + ngaySinh348);
		System.out.println("\tQue quan: " + queQuan348);
	}
}
