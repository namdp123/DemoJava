package demoenum;
enum Dongvat {Trau, cho, bo, ga;}
public class DemoEnum {
enum Season {Xuan(3), Ha(6), Thu(9), Dong(12); 
	private int value;
	private Season(int value) {
		this.value = value;
		}
	}
enum thongtin {
	NV001("NV001","Nguyen Thi Anh","Nu"),
	NV002("NV002","Tran Duc Hung","Nam"),
	NV003("NV003","Ho Minh Tu","Nam");
	private String maNV;
	private String hoTen;
	private String gioiTinh;
	private thongtin(String maNV, String hoTen, String gioiTinh) {
		this.setMaNV(maNV);
		this.setHoTen(hoTen);
		this.setGioiTinh(gioiTinh);
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Season season = Season.Xuan;
		Dongvat dv = Dongvat.Trau;
		System.out.println(season);
		System.out.println(dv);
		
		//Duyet cac phan tu trong enum
		System.out.println();
		for(Season s : Season.values()) {
			System.out.println(s);
		}
		
		
		// khoi tao gia tri dac biet cho hang so
		System.out.println();
		for ( Season s : Season.values()) {
			System.out.println(s +" "+s.value);
		}
		
		for(thongtin tt : thongtin.values()) {
			System.out.println("MaNV "+ tt.getMaNV() +" Ho Ten "+ tt.getHoTen() +" Gioi Tinh "+tt.getGioiTinh());
		}
		
		//so sanh cac phan tu trong enum
		Season x = Season.Xuan;
		Season h = Season.Ha;
		//su dung phuong thuc equals()
		if(x.equals(Season.Xuan)) {
			System.out.println("Mua xuan");
		}
		
		// su dung toan tu ==
		if (h ==  Season.Ha) {
			System.out.println("Mua ha");
		}

	}

}
