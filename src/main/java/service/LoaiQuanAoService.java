package service;

import java.util.List;

import entity.LoaiQuanAo;

public interface LoaiQuanAoService {
	public boolean addLoaiQuanAo(LoaiQuanAo LoaiQuanAo);
	public boolean updateLoaiQuanAo(LoaiQuanAo LoaiQuanAo);
	public boolean deleteLoaiQuanAo(int id);
	public LoaiQuanAo getLoaiQuanAoByID(int id);
	public List<LoaiQuanAo> getListLoaiQuanAo();
	public LoaiQuanAo getLoaiQuanAoByName(String name);
}
