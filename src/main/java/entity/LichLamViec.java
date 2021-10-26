package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class LichLamViec {
	@Id
	private String maCaLam;
	@Column(columnDefinition = "nvarchar(50)", nullable = false)
	private String tenCaLam;
	@Column(columnDefinition = "nvarchar(50)", nullable = false)
	private String thoiGian;
	
	@OneToMany(mappedBy = "lichLamViec")
	List<NhanVien> nhanVien;

	public String getMaCaLam() {
		return maCaLam;
	}

	public void setMaCaLam(String maCaLam) {
		this.maCaLam = maCaLam;
	}

	public String getTenCaLam() {
		return tenCaLam;
	}

	public void setTenCaLam(String tenCaLam) {
		this.tenCaLam = tenCaLam;
	}

	public String getThoiGian() {
		return thoiGian;
	}

	public void setThoiGian(String thoiGian) {
		this.thoiGian = thoiGian;
	}

	public List<NhanVien> getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(List<NhanVien> nhanVien) {
		this.nhanVien = nhanVien;
	}

	public LichLamViec(String maCaLam, String tenCaLam, String thoiGian) {
		super();
		this.maCaLam = maCaLam;
		this.tenCaLam = tenCaLam;
		this.thoiGian = thoiGian;
	}

	public LichLamViec() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LichLamViec [maCaLam=" + maCaLam + ", tenCaLam=" + tenCaLam + ", thoiGian=" + thoiGian + "]";
	}
	
	
	
}
