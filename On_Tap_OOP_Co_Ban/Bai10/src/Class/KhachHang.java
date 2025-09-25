package BuildClass;

import java.util.Scanner;

public class KhachHang {
	// Thuoc tinh
	protected String tenChuHo348;
	protected int soNha348;
	protected String maCongTo348;

	// Phuong thuc
	// Ham khoi tao khong doi so
	public KhachHang() {

	}

	// Ham khoi tao co doi so
	public KhachHang(String tenChuHo348, int soNha348, String maCongTo348) {
		this.tenChuHo348 = tenChuHo348;
		this.soNha348 = soNha348;
		this.maCongTo348 = maCongTo348;
	}

	// Ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ten chu ho: ");
		tenChuHo348 = sc.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha348 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ma cong to: ");
		maCongTo348 = sc.nextLine();
	}

	// Hm hien thi
	public void hienThiThongTin() {
		System.out.println("\tTen chu ho: " + tenChuHo348);
		System.out.println("\tSo nha: " + soNha348);
		System.out.println("\tMa cong to: " + maCongTo348);
	}
}
