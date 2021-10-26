package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entity.KhachHang;
import service.KhachHangService;

public class KhachHangDAO implements KhachHangService{
	private SessionFactory sessionFactory;

	public KhachHangDAO(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean addKhachHang(KhachHang khachHang) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.save(khachHang);
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}

	@Override
	public boolean updateKhachHang(KhachHang khachHang) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.update(khachHang);
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}

	
	@Override
	public KhachHang getKhachHangByID(int id) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			KhachHang KhachHang = session.find(KhachHang.class, id);
			tr.commit();
			
			return KhachHang;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public List<KhachHang> getListKhachHang() {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			String sql = "select * from [dbo].[KhachHang]";
			List<KhachHang> khachHang = session
					.createNativeQuery(sql, KhachHang.class)
					.getResultList();
			tr.commit();
			
			return khachHang;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public KhachHang getKhachHangByName(String name) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			String sql = "select p from KhachHang p where p.name=:x";
			KhachHang khachHang = session
					.createNativeQuery(sql, KhachHang.class)
					.setParameter('x', name)
					.getSingleResult();
			tr.commit();
			
			return khachHang;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public boolean deleteKhachHang(int id) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.delete(session.find(KhachHang.class, id));
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}
}
