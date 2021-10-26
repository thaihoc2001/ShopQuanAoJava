package service;

import java.util.List;

import entity.NhanVien;

public interface NhanVienService {
	public boolean addNhanVien(NhanVien NhanVien);
	public boolean updateNhanVien(NhanVien NhanVien);
	public boolean deleteNhanVien(int id);
	public NhanVien getNhanVienByID(int id);
	public List<NhanVien> getListNhanVien();
	public NhanVien getNhanVienByName(String name);
}
