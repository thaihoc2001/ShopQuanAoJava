package service;

import java.util.List;

import entity.ChiTietHoaDon;

public interface ChiTietHoaDonService {
	public boolean addChiTietHoaDon(ChiTietHoaDon ChiTietHoaDon);
	public boolean updateChiTietHoaDon(ChiTietHoaDon ChiTietHoaDon);
	public boolean deleteChiTietHoaDon(int id);
	public ChiTietHoaDon getChiTietHoaDonByID(int id);
	public List<ChiTietHoaDon> getListChiTietHoaDon();
	public ChiTietHoaDon getChiTietHoaDonByName(String name);
}
