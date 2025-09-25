package Class;

import java.util.Scanner;

public class CBGV extends Nguoi {
	// thuoc tinh
	private double luongCung348;
	private double thuong348;
	private double phat348;
	private double luongThucLinh348;

	// phuong thuc
	// ham khoi tao khong doi so
	public CBGV() {

	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap luong cung: ");
		luongCung348 = sc.nextDouble();
		sc.nextLine();

		System.out.print("\tNhap thuong: ");
		thuong348 = sc.nextDouble();
		sc.nextLine();

		System.out.print("\tNhap phat: ");
		phat348 = sc.nextDouble();
		sc.nextLine();

		// tinh luong
		luongThucLinh348 = luongCung348 + thuong348 - phat348;
	}

	// ham hien thi thong tin
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLuong cung: " + luongCung348);
		System.out.println("\tThuong: " + thuong348);
		System.out.println("\tPhat: " + phat348);
		System.out.println("\tLuong thuc linh: " + luongThucLinh348);
	}

	// ham lay ra thong tin ve luong thuc linh
	public double getLuongThucLinh() {
		return luongThucLinh348;
	}
}
