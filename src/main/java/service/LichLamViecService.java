package service;

import java.util.List;

import entity.LichLamViec;

public interface LichLamViecService {
	public boolean addLichLamViec(LichLamViec LichLamViec);
	public boolean updateLichLamViec(LichLamViec LichLamViec);
	public boolean deleteLichLamViec(int id);
	public LichLamViec getLichLamViecByID(int id);
	public List<LichLamViec> getListLichLamViec();
	public LichLamViec getLichLamViecByName(String name);
}
