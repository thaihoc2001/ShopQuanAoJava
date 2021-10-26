package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class LoaiQuanAo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maLoai;
	@Column(columnDefinition = "nvarchar(50)",nullable = false)
	private String tenLoai;
	
	@OneToMany(mappedBy = "loaiQuanAo")
	private List<QuanAo> quanAo;
	
	
	public int getMaLoai() {
		return maLoai;
	}
	public void setMaLoai(int maLoai) {
		this.maLoai = maLoai;
	}
	public String getTenLoai() {
		return tenLoai;
	}
	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}
	public List<QuanAo> getQuanAo() {
		return quanAo;
	}
	public void setQuanAo(List<QuanAo> quanAo) {
		this.quanAo = quanAo;
	}
	public LoaiQuanAo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public LoaiQuanAo(String tenLoai) {
		super();
		this.tenLoai = tenLoai;
	}
	@Override
	public String toString() {
		return "loaiQuanAo [maLoai=" + maLoai + ", tenLoai=" + tenLoai + "]";
	}
	
}
