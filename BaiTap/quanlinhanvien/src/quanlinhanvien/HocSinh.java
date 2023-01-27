package quanlinhanvien;

import java.util.ArrayList;
import java.util.Scanner;

public class HocSinh {
	private int idHs;
	private String hoTen;
	private String sdt;
	private String diachi;
	private Double luong;
	private int ngay;
	public int getIdHs() {
		return idHs;
	}
	public void setIdHs(int idHs) {
		this.idHs = idHs;
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
	public int getNgay() {
		return ngay;
	}
	public void setNgay(int ngay) {
		this.ngay = ngay;
	}
	public HocSinh(int idHs, String hoTen, String sdt, String diachi, Double luong, int ngay) {
		super();
		this.idHs = idHs;
		this.hoTen = hoTen;
		this.sdt = sdt;
		this.diachi = diachi;
		this.luong = luong;
		this.ngay = ngay;
	}
	@Override
	public String toString() {
		return "idHs=" + idHs 
				+ "\n hoTen=" + hoTen 
				+ "\n sdt=" + sdt 
				+ "\n diachi=" + diachi 
				+ "\n luong=" + luong
				+ "\n ngay=" + ngay ;
	}
	
	public ArrayList<HocSinh> inputData(){
		ArrayList<HocSinh> hocsinhList=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		String ch="";
		do {
			System.out.println("Nhập Id: ");
			int idHocSinh=Integer.parseInt(sc.nextLine());
			System.out.println("Nhập tên: ");
			String hoTen=sc.nextLine();
			System.out.println("Nhập số điện thoại: ");
			String sdt=sc.nextLine();
			System.out.println("Nhập địa chỉ: ");
			String diaChi=sc.nextLine();
			System.out.println("Nhập số ngày làm việc: ");
			int ngay=Integer.parseInt(sc.nextLine());
			double luongNv=Luong(ngay);
			System.out.println("Nhập lương: "+luongNv);
			System.out.println("Bạn có muốn nhập tiếp? (Yes/No)");
			ch=sc.nextLine();
			HocSinh hsPartime=new HocSinh(idNhanvien, hoTen, sdt, diaChi, luong, ngay);
			hocsinhList.add(hsPartime);
		}while(ch.equalsIgnoreCase("Yes"));
		
		return hocsinhList;
		
		
	}
	
	
	public double Luong(int ngay) {
		double luong=0;
		luong=(double) ngay*150000;
		return luong;
	}
	
	public void outputData(ArrayList<HocSinh> hocsinhList) {
		for (HocSinh o : hocsinhList) {
			System.out.println(o);
		}
	}
	
	public static void main(String[] args) {
		
	}
}
