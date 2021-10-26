package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class XuatXu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maXuatXu;
	@Column(columnDefinition = "nvarchar(50)", nullable = false)
	private String tenNoiXuatXu;
	@Column(columnDefinition = "nvarchar(100)", nullable = false)
	private String diaChi;
	
	@OneToMany(mappedBy = "xuatXu")
	private List<QuanAo> quanAo;

	public int getMaXuatXu() {
		return maXuatXu;
	}

	public void setMaXuatXu(int maXuatXu) {
		this.maXuatXu = maXuatXu;
	}

	public String getTenNoiXuatXu() {
		return tenNoiXuatXu;
	}

	public void setTenNoiXuatXu(String tenNoiXuatXu) {
		this.tenNoiXuatXu = tenNoiXuatXu;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public List<QuanAo> getQuanAo() {
		return quanAo;
	}

	public void setQuanAo(List<QuanAo> quanAo) {
		this.quanAo = quanAo;
	}

	public XuatXu( String tenNoiXuatXu, String diaChi) {
		super();
		this.tenNoiXuatXu = tenNoiXuatXu;
		this.diaChi = diaChi;
	}

	public XuatXu() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "XuatXu [maXuatXu=" + maXuatXu + ", tenNoiXuatXu=" + tenNoiXuatXu + ", diaChi=" + diaChi + "]";
	}
	
	
}
