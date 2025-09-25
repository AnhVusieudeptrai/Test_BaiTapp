package Class;

import java.util.Scanner;

public class Bao extends TaiLieu {
	// thuoc tinh
	private String ngayPhatHanh348;

	// phuong thuc
	// ham khoi tao khong doi so
	public Bao() {

	}

	// ham khoi tao co doi so
	public Bao(String maTaiLieu, String tenNXB, int soBanPhatHanh, String ngayPhatHanh348) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.ngayPhatHanh348 = ngayPhatHanh348;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap ngay phat hanh: ");
		ngayPhatHanh348 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tNgay phat hanh: " + ngayPhatHanh348);
	}
}
