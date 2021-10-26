package service;

import java.util.List;

import entity.XuatXu;

public interface XuatXuService {
	public boolean addXuatXu(XuatXu XuatXu);
	public boolean updateXuatXu(XuatXu XuatXu);
	public boolean deleteXuatXu(int id);
	public XuatXu getXuatXuByID(int id);
	public List<XuatXu> getListXuatXu();
	public XuatXu getXuatXuByName(String name);
}
