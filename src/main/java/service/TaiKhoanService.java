package service;

import java.util.List;

import entity.TaiKhoan;

public interface TaiKhoanService {
	public boolean addTaiKhoan(TaiKhoan TaiKhoan);
	public boolean updateTaiKhoan(TaiKhoan TaiKhoan);
	public boolean deleteTaiKhoan(int id);
	public TaiKhoan getTaiKhoanByID(int id);
	public List<TaiKhoan> getListTaiKhoan();
	public TaiKhoan getTaiKhoanByName(String name);
	public boolean checkLogin(String taiKhoan, String matKhau); 
}
