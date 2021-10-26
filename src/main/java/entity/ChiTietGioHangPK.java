package entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class ChiTietGioHangPK implements Serializable{
	private static final long serialVersionUID = 3303801155409643030L;
	private int gioHang;
	private int quanAo;
	public ChiTietGioHangPK() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(gioHang, quanAo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChiTietGioHangPK other = (ChiTietGioHangPK) obj;
		return gioHang == other.gioHang && quanAo == other.quanAo;
	}
	
}
