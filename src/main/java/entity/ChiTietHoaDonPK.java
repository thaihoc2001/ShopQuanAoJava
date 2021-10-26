package entity;

import java.io.Serializable;
import java.util.Objects;

public class ChiTietHoaDonPK implements Serializable{
	private static final long serialVersionUID = 3303801155409643030L;
	private int hoaDon;
	private int quanAo;
	public ChiTietHoaDonPK() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(hoaDon, quanAo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChiTietHoaDonPK other = (ChiTietHoaDonPK) obj;
		return hoaDon == other.hoaDon && quanAo == other.quanAo;
	}
	
	
}
