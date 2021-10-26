package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class QuanAo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maQuanAo;
	@Column(columnDefinition = "nvarchar(50)", nullable = false)
	private String tenQuanAo;
        @Column(nullable = false)
	private double giaTien;
        @Column(nullable = false)
	private int soLuong;
	@Column(columnDefinition = "nvarchar(50)", nullable = false)
	private String hinhAnh;
	
	@OneToMany(mappedBy = "quanAo")
	private List<ChiTietGioHang> chiTietGioHang;
	
	@ManyToOne
	@JoinColumn(name = "maLoai")
	private LoaiQuanAo loaiQuanAo;
	
	@ManyToOne
	@JoinColumn(name = "maXuatXu")
	private XuatXu xuatXu;
	
	@ManyToOne
	@JoinColumn(name = "maHangSX")
	private HangSanXuat hangSanXuat;
	
	@OneToMany(mappedBy = "quanAo")
	private List<ChiTietHoaDon> chiTietHoaDon;

	public int getMaQuanAo() {
		return maQuanAo;
	}

	public void setMaQuanAo(int maQuanAo) {
		this.maQuanAo = maQuanAo;
	}

	public String getTenQuanAo() {
		return tenQuanAo;
	}

	public void setTenQuanAo(String tenQuanAo) {
		this.tenQuanAo = tenQuanAo;
	}

	public double getGiaTien() {
		return giaTien;
	}

	public void setGiaTien(double giaTien) {
		this.giaTien = giaTien;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	public List<ChiTietGioHang> getChiTietGioHang() {
		return chiTietGioHang;
	}

	public void setChiTietGioHang(List<ChiTietGioHang> chiTietGioHang) {
		this.chiTietGioHang = chiTietGioHang;
	}

	public LoaiQuanAo getLoaiQuanAo() {
		return loaiQuanAo;
	}

	public void setLoaiQuanAo(LoaiQuanAo loaiQuanAo) {
		this.loaiQuanAo = loaiQuanAo;
	}

	public XuatXu getXuatXu() {
		return xuatXu;
	}

	public void setXuatXu(XuatXu xuatXu) {
		this.xuatXu = xuatXu;
	}

	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public List<ChiTietHoaDon> getChiTietHoaDon() {
		return chiTietHoaDon;
	}

	public void setChiTietHoaDon(List<ChiTietHoaDon> chiTietHoaDon) {
		this.chiTietHoaDon = chiTietHoaDon;
	}

	public QuanAo(String tenQuanAo, double giaTien, int soLuong, String hinhAnh) {
		super();
		this.tenQuanAo = tenQuanAo;
		this.giaTien = giaTien;
		this.soLuong = soLuong;
		this.hinhAnh = hinhAnh;
	}

	public QuanAo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "QuanAo [maQuanAo=" + maQuanAo + ", tenQuanAo=" + tenQuanAo + ", giaTien=" + giaTien + ", soLuong="
				+ soLuong + ", hinhAnh=" + hinhAnh + "]";
	}
	
	
	
}
