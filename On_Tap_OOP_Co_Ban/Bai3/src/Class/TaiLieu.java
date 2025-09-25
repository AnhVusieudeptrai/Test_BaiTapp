package Class;

import java.util.Scanner;

public class TaiLieu {
	// thuoc tinh
	private String maTaiLieu348;
	private String tenNXB348;
	private int soBanPhatHanh348;

	// phuong thuc
	// ham khoi tao khong doi so
	public TaiLieu() {

	}

	// ham khoi tao co doi so
	public TaiLieu(String maTaiLieu348, String tenNXB348, int soBanPhatHanh348) {
		this.maTaiLieu348 = maTaiLieu348;
		this.tenNXB348 = tenNXB348;
		this.soBanPhatHanh348 = soBanPhatHanh348;
	}

	// nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ma tai lieu: ");
		maTaiLieu348 = sc.nextLine();
		System.out.print("\tNhap ten nha xuat ban: ");
		tenNXB348 = sc.nextLine();
		System.out.print("\tNhap so ban phat hanh: ");
		soBanPhatHanh348 = sc.nextInt();
		sc.nextLine();
	}

	// hien thi
	public void hienThiThongTin() {
		System.out.println("\tMa tai lieu: " + maTaiLieu348);
		System.out.println("\tTen nha xuat ban: " + tenNXB348);
		System.out.println("\tSo ban phat hanh: " + soBanPhatHanh348);
	}

	// ham lay ra ma tai lieu
	public String getMaTaiLieu() {
		return maTaiLieu348;
	}
}
