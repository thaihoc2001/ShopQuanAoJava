package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entity.ChiTietGioHang;
import service.ChiTietGioHangService;

public class ChiTietGioHangDAO implements ChiTietGioHangService{
private SessionFactory sessionFactory;
	

	public ChiTietGioHangDAO(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean addChiTietGioHang(ChiTietGioHang ChiTietGioHang) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.save(ChiTietGioHang);
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}

	@Override
	public boolean updateChiTietGioHang(ChiTietGioHang ChiTietGioHang) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.update(ChiTietGioHang);
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}

	
	@Override
	public ChiTietGioHang getChiTietGioHangByID(int id) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			ChiTietGioHang chiTietGioHang = session.find(ChiTietGioHang.class, id);
			tr.commit();
			
			return chiTietGioHang;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public List<ChiTietGioHang> getListChiTietGioHang() {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			String sql = "select * from [dbo].[ChiTietGioHang]";
			List<ChiTietGioHang> chiTietGioHang = session
					.createNativeQuery(sql, ChiTietGioHang.class)
					.getResultList();
			tr.commit();
			
			return chiTietGioHang;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public ChiTietGioHang getChiTietGioHangByName(String name) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			String sql = "select p from ChiTietGioHang p where p.name=:x";
			ChiTietGioHang chiTietGioHang = session
					.createNativeQuery(sql, ChiTietGioHang.class)
					.setParameter('x', name)
					.getSingleResult();
			tr.commit();
			
			return chiTietGioHang;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public boolean deleteChiTietGioHang(int id) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.delete(session.find(ChiTietGioHang.class, id));
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}
}
