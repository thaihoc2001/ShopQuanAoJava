package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(ChiTietGioHangPK.class)
public class ChiTietGioHang {
        @Column( nullable = false)
	private int soLuong;
        @Column( nullable = false)
	private double giaTien;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "maGioHang")
	private GioHang gioHang;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "maQuanAo")
	private QuanAo quanAo;

	public ChiTietGioHang() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public double getGiaTien() {
		return giaTien;
	}

	public void setGiaTien(double giaTien) {
		this.giaTien = giaTien;
	}

	public GioHang getGioHang() {
		return gioHang;
	}

	public void setGioHang(GioHang gioHang) {
		this.gioHang = gioHang;
	}

	public QuanAo getQuanAo() {
		return quanAo;
	}

	public void setQuanAo(QuanAo quanAo) {
		this.quanAo = quanAo;
	}

	public ChiTietGioHang(int soLuong, double giaTien) {
		super();
		this.soLuong = soLuong;
		this.giaTien = giaTien;
	}

	@Override
	public String toString() {
		return "ChiTietGioHang [soLuong=" + soLuong + ", giaTien=" + giaTien + "]";
	}

}	
