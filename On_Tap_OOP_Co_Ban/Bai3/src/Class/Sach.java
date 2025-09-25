package Class;

import java.util.Scanner;

public class Sach extends TaiLieu {
	// thuoc tinh
	private String tacGia348;
	private int soTrang348;

	// phuong thuc
	// ham khoi tao khong doi so
	public Sach() {

	}

	// ham khoi tao co doi so
	public Sach(String maTaiLieu, String tenNXB, int soBanPhatHanh, String tacGia348, int soTrang348) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.tacGia348 = tacGia348;
		this.soTrang348 = soTrang348;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap tac gia: ");
		tacGia348 = sc.nextLine();
		System.out.print("\tNhap so trang: ");
		soTrang348 = sc.nextInt();
		sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\ttac gia: " + tacGia348);
		System.out.println("\tSo trang: " + soTrang348);
	}
}
