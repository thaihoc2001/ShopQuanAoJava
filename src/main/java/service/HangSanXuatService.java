package service;

import java.util.List;

import entity.HangSanXuat;

public interface HangSanXuatService {
	public boolean addHangSanXuat(HangSanXuat HangSanXuat);
	public boolean updateHangSanXuat(HangSanXuat HangSanXuat);
	public boolean deleteHangSanXuat(int id);
	public HangSanXuat getHangSanXuatByID(int id);
	public List<HangSanXuat> getListHangSanXuat();
	public HangSanXuat getHangSanXuatByName(String name);
}
