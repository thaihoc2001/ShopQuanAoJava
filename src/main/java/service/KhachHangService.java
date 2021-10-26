package service;

import java.util.List;

import entity.KhachHang;

public interface KhachHangService {
	public boolean addKhachHang(KhachHang khachHang);
	public boolean updateKhachHang(KhachHang khachHang);
	public boolean deleteKhachHang(int id);
	public KhachHang getKhachHangByID(int id);
	public List<KhachHang> getListKhachHang();
	public KhachHang getKhachHangByName(String name);
}
