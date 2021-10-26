package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class HangSanXuat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maHangSX;
	@Column(columnDefinition = "nvarchar(50)",  nullable = false)
	private String tenHangSX;
	
	@OneToMany(mappedBy = "hangSanXuat")
	private List<QuanAo> quanAo;

	public int getMaHangSX() {
		return maHangSX;
	}

	public void setMaHangSX(int maHangSX) {
		this.maHangSX = maHangSX;
	}

	public String getTenHangSX() {
		return tenHangSX;
	}

	public void setTenHangSX(String tenHangSX) {
		this.tenHangSX = tenHangSX;
	}

	public List<QuanAo> getQuanAo() {
		return quanAo;
	}

	public void setQuanAo(List<QuanAo> quanAo) {
		this.quanAo = quanAo;
	}

	public HangSanXuat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HangSanXuat(int maHangSX, String tenHangSX) {
		super();
		this.maHangSX = maHangSX;
		this.tenHangSX = tenHangSX;
	}

	@Override
	public String toString() {
		return "HangSanXuat [maHangSX=" + maHangSX + ", tenHangSX=" + tenHangSX + "]";
	}
	
	
	
}
