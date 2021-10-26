package service;

import java.util.List;

import entity.ChiTietGioHang;

public interface ChiTietGioHangService {
	public boolean addChiTietGioHang(ChiTietGioHang ChiTietGioHang);
	public boolean updateChiTietGioHang(ChiTietGioHang ChiTietGioHang);
	public boolean deleteChiTietGioHang(int id);
	public ChiTietGioHang getChiTietGioHangByID(int id);
	public List<ChiTietGioHang> getListChiTietGioHang();
	public ChiTietGioHang getChiTietGioHangByName(String name);
}
