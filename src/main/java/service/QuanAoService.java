package service;

import java.util.List;

import entity.QuanAo;


public interface QuanAoService {
	public boolean addProduct(QuanAo quanAo);
	public boolean updateProduct(QuanAo quanAo);
	public boolean deleteBrand(int id);
	public QuanAo getProductByID(int id);
	public List<QuanAo> getListProducts();
	public QuanAo getProductByName(String name);
}
