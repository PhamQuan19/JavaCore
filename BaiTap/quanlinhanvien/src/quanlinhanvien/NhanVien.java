package quanlinhanvien;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class NhanVien {
	private int idNv;
	private String hoTen;
	private String sdt;
	private String diachi;
	private Double luong;
	private int thoiGian;
	
	public NhanVien() {
		// TODO Auto-generated constructor stub
	}

	
	
	public NhanVien(int idNv, String hoTen, String sdt, String diachi, Double luong, int thoiGian) {
		super();
		this.idNv = idNv;
		this.hoTen = hoTen;
		this.sdt = sdt;
		this.diachi = diachi;
		this.luong = luong;
		this.thoiGian = thoiGian;
	}



	public int getIdNv() {
		return idNv;
	}

	public void setIdNv(int idNv) {
		this.idNv = idNv;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public Double getLuong() {
		return luong;
	}

	public void setLuong(Double luong) {
		this.luong = luong;
	}

	public int getThoiGian() {
		return thoiGian;
	}

	public void setThoiGian(int thoiGian) {
		this.thoiGian = thoiGian;
	}



	@Override
	public String toString() {
		return "IdNv: " + idNv 
				+ "\n HoTen: " + hoTen 
				+ "\n sdt: " + sdt
				+ "\n diachi: " + diachi 
				+ "\n luong: "+ luong 
				+ "\n thoiGian: " + thoiGian;
	}
	
	public ArrayList<NhanVien> inputData(){
		ArrayList<NhanVien> nhanvienList=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		String ch="";
		do {
			System.out.println("Nhập Id: ");
			int idNhanvien=Integer.parseInt(sc.nextLine());
			System.out.println("Nhập tên: ");
			String hoTen=sc.nextLine();
			System.out.println("Nhập số điện thoại: ");
			String sdt=sc.nextLine();
			System.out.println("Nhập địa chỉ: ");
			String diaChi=sc.nextLine();
			System.out.println("Nhập thời gian làm việc: ");
			int thoiGian=Integer.parseInt(sc.nextLine());
			double luongNv=Luong(thoiGian);
			System.out.println("Nhập lương: "+luongNv);
			System.out.println("Bạn có muốn nhập tiếp? (Yes/No)");
			ch=sc.nextLine();
			NhanVien nvFulltime=new NhanVien(idNhanvien, hoTen, sdt, diaChi, luong, thoiGian);
			nhanvienList.add(nvFulltime);
		}while(ch.equalsIgnoreCase("Yes"));
		
		return nhanvienList;
		
		
	}
	
	public double Luong(int thoiGian) {
		double luong=0;
		luong=(double) thoiGian*120000;
		return luong;
	}
	
	public void outputData(ArrayList<NhanVien> nhanvienList) {
		for (NhanVien nhanVien : nhanvienList) {
			System.out.println(nhanVien);
		}
	}
	
	public static void main(String[] args) {
		NhanVien nvFulltime=new NhanVien();
		ArrayList<NhanVien> list=nvFulltime.inputData();
		nvFulltime.outputData(list);
	}
}
