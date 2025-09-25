package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	protected String hoTen348;
	protected Date ngaySinh348;
	protected String queQuan348;

	// phuong thuc
	// ham khoi tao khong doi so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen348, Date ngaySinh348, String queQuan348) {
		this.hoTen348 = hoTen348;
		this.ngaySinh348 = ngaySinh348;
		this.queQuan348 = queQuan348;
	}

	// ham nhap vao thong tin
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen348 = sc.nextLine();

		System.out.print("\tNhap ngay sinh: ");
		String strDate = sc.nextLine();
		ngaySinh348 = strToDate(strDate);

		System.out.print("\tNhap que quan: ");
		queQuan348 = sc.nextLine();
	}

	private Date strToDate(String strDate) {
		Date date = null;

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			date = sdf.parse(strDate);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return date;
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen348);
		System.out.println("\tNgay sinh: " + ngaySinh348);
		System.out.println("\tQue quan: " + queQuan348);
	}

	// ham lay ra que quan
	public String getQueQuan() {
		return queQuan348;
	}

	// ham lay ra thong tin ve ngay sinh
	public Date getNgaySinh() {
		return ngaySinh348;
	}
}
