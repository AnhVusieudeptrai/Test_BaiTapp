package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	private String hoTen348;
	private Date ngaySinh348;
	private String ngheNghiep348;

	// phuong thuc
	// ham khoi tao khong doi so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen348, Date ngaySinh348, String ngheNghiep348) {
		this.hoTen348 = hoTen348;
		this.ngaySinh348 = ngaySinh348;
		this.ngheNghiep348 = ngheNghiep348;
	}

	// nhap cac thong tung nguoi trong ho gia dinh
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen348 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		String strDate = sc.nextLine();
		ngaySinh348 = strToDate(strDate);
		System.out.print("\tNhap nghe nghiep: ");
		ngheNghiep348 = sc.nextLine();
	}

	// ham thuc hien chuyen string sang date
	private Date strToDate(String strDate) {
		Date date = null;

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date = sdf.parse(strDate);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return date;
	}

	// hien thi ra tung nguoi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen348);
		System.out.println("\tNgay sinh: " + dateToString(ngaySinh348));
		System.out.println("\tNghe nghiep: " + ngheNghiep348);
	}

	// ham chuyen dinh dang tu date sang String
	private String dateToString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		String strDate = sdf.format(date);

		return strDate;
	}

	// ham lay thong tin ve ngay sinh
	public Date getNgaySinh() {
		return ngaySinh348;
	}
}
