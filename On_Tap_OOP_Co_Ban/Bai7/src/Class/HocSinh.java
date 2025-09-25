package Class;

import java.util.Scanner;

public class HocSinh extends Nguoi {
	// thuoc tinh
	private String lop348;
	private String khoaHoc348;
	private String kyHoc348;

	// phuong thuc
	// ham khoi tao khong doi so
	public HocSinh() {

	}

	// ham khoi tao co doi so
	public HocSinh(String hoTen348, String lop348, String khoaHoc, String kyHoc348) {
		this.hoTen348 = hoTen348;
		this.lop348 = lop348;
		this.khoaHoc348 = khoaHoc;
		this.kyHoc348 = kyHoc348;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap lop: ");
		lop348 = sc.nextLine();

		System.out.print("\tNhap khoa hoc: ");
		khoaHoc348 = sc.nextLine();

		System.out.print("\tNhap ky hoc: ");
		kyHoc348 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLop: " + lop348);
		System.out.println("\tKhoa hoc: " + khoaHoc348);
		System.out.println("\tKy hoc: " + kyHoc348);
	}

	// ham lay ra thong tin ve lop348
	public String getLop() {
		return lop348;
	}
}
