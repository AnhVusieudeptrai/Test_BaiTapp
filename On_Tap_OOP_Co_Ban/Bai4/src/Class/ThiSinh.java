package Class;

import java.util.Scanner;

public class ThiSinh {
	// thuoc tinh
	private int soBD348;
	private String hoTen348;
	private String diaChi348;
	private String dienUuTien348;

	// phuong thuc
	// ham khoi tao khong doi so
	public ThiSinh() {

	}

	// ham khoi tao co doi so
	public ThiSinh(int soBD348, String hoTen348, String diaChi348, String dienUuTien348) {
		this.soBD348 = soBD348;
		this.hoTen348 = hoTen348;
		this.diaChi348 = diaChi348;
		this.dienUuTien348 = dienUuTien348;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap so bao danh: ");
		soBD348 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ho ten: ");
		hoTen348 = sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi348 = sc.nextLine();
		System.out.print("\tNhap dien uu tien: ");
		dienUuTien348 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tSo bao danh: " + soBD348);
		System.out.println("\tHo ten: " + hoTen348);
		System.out.println("\tDia chi: " + diaChi348);
		System.out.println("\tDien uu tien: " + dienUuTien348);
	}

	// ham lay ra thong tin ve so bao danh
	public int getSoBD() {
		return soBD348;
	}
}
