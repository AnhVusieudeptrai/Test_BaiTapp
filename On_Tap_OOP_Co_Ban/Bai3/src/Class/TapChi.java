package Class;

import java.util.Scanner;

public class TapChi extends TaiLieu {
	// thuoc tinh
	private int soPhatHanh348;
	private int thangPhatHanh348;

	// phuong thuc
	// ham khoi tao khong doi so
	public TapChi() {

	}

	// ham khoi tao co doi so
	public TapChi(String maTaiLieu, String tenNXB, int soBanPhatHanh, int soPhatHanh348, int thangPhatHanh348) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.soPhatHanh348 = soBanPhatHanh;
		this.thangPhatHanh348 = thangPhatHanh348;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap so phat hanh: ");
		soPhatHanh348 = sc.nextInt();
		System.out.print("\tNhap thang phat hanh: ");
		thangPhatHanh348 = sc.nextInt();
		sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tSo phat hanh: " + soPhatHanh348);
		System.out.println("\tThang phat hanh: " + thangPhatHanh348);
	}
}
