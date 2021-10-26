package service;

import java.util.List;

import entity.HoaDon;

public interface HoaDonService {
	public boolean addHoaDon(HoaDon hoaDon);
	public boolean updateHoaDon(HoaDon hoaDon);
	public boolean deleteHoaDon(int id);
	public HoaDon getHoaDonByID(int id);
	public List<HoaDon> getListHoaDon();
	public HoaDon getHoaDonByName(String name);
}
