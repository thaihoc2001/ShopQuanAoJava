package service;

import java.util.List;

import entity.GioHang;

public interface GioHangService {
	public boolean addGioHang(GioHang GioHang);
	public boolean updateGioHang(GioHang GioHang);
	public boolean deleteGioHang(int id);
	public GioHang getGioHangByID(int id);
	public List<GioHang> getListGioHang();
	public GioHang getGioHangByName(String name);
}
