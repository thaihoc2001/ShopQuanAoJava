package entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class KhachHang {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maKhachHang;
	@Column(columnDefinition = "nvarchar(50)", nullable = false)
	private String hoTen;
	@Column(columnDefinition = "nvarchar(100)", nullable = false)
	private String diaChi;
	private Date ngaySinh;
	@Column(columnDefinition = "nvarchar(50)", nullable = false)
	private String soDienThoai;
	@Column(columnDefinition = "nvarchar(50)", nullable = false)
	private String gioiTinh;
	private String email;
	
	@OneToOne(mappedBy = "khachHang", cascade = CascadeType.ALL)
    private TaiKhoan taiKhoan;
	
	@OneToMany(mappedBy = "khachHang")
	List<HoaDon> hoaDon;
	
	@OneToOne(mappedBy = "khachHang", cascade = CascadeType.ALL)
    private GioHang gioHang;

	public int getMaKhachHang() {
		return maKhachHang;
	}

	public void setMaKhachHang(int maKhachHang) {
		this.maKhachHang = maKhachHang;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TaiKhoan getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	public List<HoaDon> getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(List<HoaDon> hoaDon) {
		this.hoaDon = hoaDon;
	}

	public GioHang getGioHang() {
		return gioHang;
	}

	public void setGioHang(GioHang gioHang) {
		this.gioHang = gioHang;
	}

	public KhachHang(String hoTen, String diaChi, Date ngaySinh, String soDienThoai, String gioiTinh,
			String email) {
		super();
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.ngaySinh = ngaySinh;
		this.soDienThoai = soDienThoai;
		this.gioiTinh = gioiTinh;
		this.email = email;
	}

	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "KhachHang [maKhachHang=" + maKhachHang + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", ngaySinh="
				+ ngaySinh + ", soDienThoai=" + soDienThoai + ", gioiTinh=" + gioiTinh + ", email=" + email + "]";
	}

	
	
}
