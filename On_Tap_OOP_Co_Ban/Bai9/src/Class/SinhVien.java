package Class;
import java.util.Scanner;
public class SinhVien {
	// thuoc tinh
	protected String hoTen348;
	protected String maSV348;
	protected String ngaySinh348;
	protected String lop348;

	// phuong thuc
	// ham khoi tao khong doi so
	public SinhVien() {

	}

	// ham khoi tao co doi so
	public SinhVien(String hoTen348, String maSV348, String ngaySinh348, String lop348) {
		this.hoTen348 = hoTen348;
		this.maSV348 = maSV348;
		this.ngaySinh348 = ngaySinh348;
		this.lop348 = lop348;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen348 = sc.nextLine();

		System.out.print("\tNhap ma sinh vien: ");
		maSV348 = sc.nextLine();

		System.out.print("\tNhap ngay sinh: ");
		ngaySinh348 = sc.nextLine();

		System.out.print("\tNhap lop: ");
		lop348 = sc.nextLine();
	}
	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen348);
		System.out.println("\tNgay sinh: " + ngaySinh348);
		System.out.println("\tMa sinh vien: " + maSV348);
		System.out.println("\tLop: " + lop348);
	}
}
