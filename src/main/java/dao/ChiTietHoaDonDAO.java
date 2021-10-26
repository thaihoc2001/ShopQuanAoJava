package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entity.ChiTietHoaDon;
import service.ChiTietHoaDonService;

public class ChiTietHoaDonDAO implements ChiTietHoaDonService{
private SessionFactory sessionFactory;
	

	public ChiTietHoaDonDAO(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean addChiTietHoaDon(ChiTietHoaDon chiTietHoaDon) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.save(chiTietHoaDon);
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}

	@Override
	public boolean updateChiTietHoaDon(ChiTietHoaDon chiTietHoaDon) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.update(chiTietHoaDon);
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}

	
	@Override
	public ChiTietHoaDon getChiTietHoaDonByID(int id) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			ChiTietHoaDon chiTietHoaDon = session.find(ChiTietHoaDon.class, id);
			tr.commit();
			
			return chiTietHoaDon;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public List<ChiTietHoaDon> getListChiTietHoaDon() {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			String sql = "select * from [dbo].[ChiTietHoaDon]";
			List<ChiTietHoaDon> ChiTietHoaDon = session
					.createNativeQuery(sql, ChiTietHoaDon.class)
					.getResultList();
			tr.commit();
			
			return ChiTietHoaDon;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public ChiTietHoaDon getChiTietHoaDonByName(String name) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			String sql = "select p from ChiTietHoaDon p where p.name=:x";
			ChiTietHoaDon chiTietHoaDon = session
					.createNativeQuery(sql, ChiTietHoaDon.class)
					.setParameter('x', name)
					.getSingleResult();
			tr.commit();
			
			return chiTietHoaDon;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public boolean deleteChiTietHoaDon(int id) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.delete(session.find(ChiTietHoaDon.class, id));
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}
}
