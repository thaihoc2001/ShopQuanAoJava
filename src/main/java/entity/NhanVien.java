package entity;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class NhanVien {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maNhanVien;
	@Column(columnDefinition = "nvarchar(50)", nullable = false)
	private String hoTen;
	@Column(columnDefinition = "nvarchar(100)", nullable = false)
	private String diaChi;
	@Column(columnDefinition = "nvarchar(50)", nullable = false)
	private String soDienThoai;
	@Column(columnDefinition = "nvarchar(50)", nullable = false)
	private String email;
	@Column(columnDefinition = "nvarchar(50)", nullable = false)
	private String chucVu;
	private Date ngaySinh;
	@Column(columnDefinition = "nvarchar(50)", nullable = false)
	private String gioiTinh;
	
	@ManyToOne
	@JoinColumn(name = "maCaLam")
	private LichLamViec lichLamViec;
	
	@OneToOne(mappedBy = "nhanVien", cascade = CascadeType.ALL)
	private TaiKhoan taiKhoan;

	@OneToMany(mappedBy = "nhanVien")
	List<HoaDon> hoaDon;

	public int getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(int maNhanVien) {
		this.maNhanVien = maNhanVien;
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

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public LichLamViec getLichLamViec() {
		return lichLamViec;
	}

	public void setLichLamViec(LichLamViec lichLamViec) {
		this.lichLamViec = lichLamViec;
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

	public NhanVien(int maNhanVien, String hoTen, String diaChi, String soDienThoai, String email,
			String chucVu, Date ngaySinh, String gioiTinh) {
		super();
		this.maNhanVien = maNhanVien;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.email = email;
		this.chucVu = chucVu;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
	}

	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "NhanVien [maNhanVien=" + maNhanVien + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", soDienThoai="
				+ soDienThoai + ", email=" + email + ", chucVu=" + chucVu + ", ngaySinh=" + ngaySinh + ", gioiTinh="
				+ gioiTinh + ", lichLamViec=" + lichLamViec.getTenCaLam() + "]";
	}

	
}
