package BuildClass;

import java.util.Scanner;

public class BienLai extends KhachHang {
	// Thuoc tinh
	private int chiSoMoi348;
	private int chiSoCu348;
	private double tien348;

	// Phuong thuc
	// Ham khoi tao khong doi so
	public BienLai() {

	}

	// Ham khoi tao co doi so
	public BienLai(int chiSoMoi348, int chiSoCu348, double tien348) {
		this.chiSoMoi348 = chiSoMoi348;
		this.chiSoCu348 = chiSoCu348;
		this.tien348 = tien348;
	}

	public BienLai(String tenChuHo348, int chiSoMoi348, int chiSoCu348, double tien348) {
		this.tenChuHo348 = tenChuHo348;
		this.chiSoMoi348 = chiSoMoi348;
		this.chiSoCu348 = chiSoCu348;
		this.tien348 = tien348;
	}

	// Ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap chi so moi: ");
		chiSoMoi348 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap chi so cu: ");
		chiSoCu348 = sc.nextInt();
		sc.nextLine();
		tien348 = (chiSoMoi348 - chiSoCu348) * 750;
	}

	// Ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tChi so moi: " + chiSoMoi348);
		System.out.println("\tChi so cu: " + chiSoCu348);
		System.out.println("\tTien: : " + tien348);
	}
}
