package entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class GioHang {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maGioHang;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "maKhachHang")
	private KhachHang khachHang;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "maHoaDon")
	private HoaDon hoaDon;
	
	@OneToMany(mappedBy = "gioHang")
	private List<ChiTietGioHang> chiTietGioHang;

	

	public int getMaGioHang() {
		return maGioHang;
	}



	public void setMaGioHang(int maGioHang) {
		this.maGioHang = maGioHang;
	}



	public KhachHang getKhachHang() {
		return khachHang;
	}



	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}



	public HoaDon getHoaDon() {
		return hoaDon;
	}



	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}



	public List<ChiTietGioHang> getChiTietGioHang() {
		return chiTietGioHang;
	}



	public void setChiTietGioHang(List<ChiTietGioHang> chiTietGioHang) {
		this.chiTietGioHang = chiTietGioHang;
	}

	
	public GioHang() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	@Override
	public String toString() {
		return "GioHang [maGioHang=" + maGioHang + "]";
	}
	
	
}
