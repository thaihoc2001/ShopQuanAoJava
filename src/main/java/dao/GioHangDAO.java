package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entity.GioHang;
import service.GioHangService;

public class GioHangDAO implements GioHangService{
private SessionFactory sessionFactory;
	

	public GioHangDAO(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean addGioHang(GioHang gioHang) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.save(gioHang);
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}

	@Override
	public boolean updateGioHang(GioHang gioHang) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.update(gioHang);
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}

	
	@Override
	public GioHang getGioHangByID(int id) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			GioHang GioHang = session.find(GioHang.class, id);
			tr.commit();
			
			return GioHang;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public List<GioHang> getListGioHang() {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			String sql = "select * from [dbo].[GioHang]";
			List<GioHang> gioHang = session
					.createNativeQuery(sql, GioHang.class)
					.getResultList();
			tr.commit();
			
			return gioHang;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public GioHang getGioHangByName(String name) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			String sql = "select p from GioHang p where p.name=:x";
			GioHang gioHang = session
					.createNativeQuery(sql, GioHang.class)
					.setParameter('x', name)
					.getSingleResult();
			tr.commit();
			
			return gioHang;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public boolean deleteGioHang(int id) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.delete(session.find(GioHang.class, id));
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}
}
