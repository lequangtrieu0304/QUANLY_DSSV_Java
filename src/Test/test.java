package Test;

import java.util.Scanner;

import main.DanhSachSinhVien;
import main.SinhVien;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DanhSachSinhVien dssv = new DanhSachSinhVien();
		int luaChon = 0;
		do {
			System.out.println("---MENU---");
			System.out.println("Chọn chức năng");
			System.out.println(
					"1. Thêm Sinh Viên.\n"
				   +"2. In danh sách sinh viên.\n"
				   +"3. Kiểm tra danh sách rỗng hay không.\n"
				   +"4. Lấy ra số lượng sinh viên trong danh sách. \n"
				   +"5. Làm rỗng danh sách sinh viên. \n"
				   +"6. Kiểm tra sinh viên có tồn tại trên danh sách hay không, dựa trên mã sinh viên. \n"
				   +"7. Xóa 1 sinh viên ra khỏi danh sách dựa trên mã sinh viên. \n"
				   +"8. Tìm kiếm tất cả sinh viên dựa trên tên được nhập từ bàn phím.\n"
				   +"9. Xuất ra danh sách sinh viên có điểm từ thấp đến cao.\n"
				   +"0. Thoát chương trình");
			luaChon = sc.nextInt();
			sc.nextLine();
			if(luaChon == 1) {
				System.out.println("Nhập mã sinh viên: "); String maSinhVien = sc.nextLine();
				System.out.println("Nhập họ và tên: "); String hoVaTen = sc.nextLine();
				System.out.println("Nhập năm sinh: "); int namSinh = sc.nextInt();
				System.out.println("Nhập điểm trung bình: "); float diemTrungBinh = sc.nextFloat();
				SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
				dssv.themSinhVien(sv);
				
			}else if(luaChon == 2) {
				dssv.inDanhSachSinhVien();
				
			}else if(luaChon == 3) {
				System.out.println("Kiểm tra danh sách rỗng: "+ dssv.kiemTraDanhSachRong());
				
			}else if(luaChon == 4) {
				System.out.println("Lấy số lượng sinh viên: "+ dssv.laySoLuongSinhVien());
				
			}else if(luaChon == 5) {
				dssv.lamTrongDanhSach();
				
			}else if(luaChon == 6) {
				System.out.println("Nhập mã sinh viên: "); String maSinhVien = sc.nextLine();
				SinhVien sv = new SinhVien(maSinhVien);
				System.out.println("Sinh có trong danh sách: "+ dssv.kiemTraTonTai(sv));
			}else if(luaChon == 7) {
				System.out.println("Nhập mã sinh viên: "); String maSinhVien = sc.nextLine();
				SinhVien sv = new SinhVien(maSinhVien);
				System.out.println("Xóa sinh viên: " + dssv.xoaSinhVien(sv));
			}else if(luaChon == 8) {
				System.out.println("Nhập mã sinh viên: "); String hoVaTen = sc.nextLine();
				dssv.timSinhVien(hoVaTen);
			}else if(luaChon == 9) {
				dssv.sapXepGiamDanTheoDiem();
				dssv.inDanhSachSinhVien();
			}
		}while(luaChon != 0);
	}
}
