package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entity.HoaDon;
import service.HoaDonService;

public class HoaDonDAO implements HoaDonService{
	private SessionFactory sessionFactory;
	

	public HoaDonDAO(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean addHoaDon(HoaDon hoaDon) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.save(hoaDon);
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}

	@Override
	public boolean updateHoaDon(HoaDon hoaDon) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.update(hoaDon);
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}

	
	@Override
	public HoaDon getHoaDonByID(int id) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			HoaDon hoaDon = session.find(HoaDon.class, id);
			tr.commit();
			
			return hoaDon;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public List<HoaDon> getListHoaDon() {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			String sql = "select * from [dbo].[HoaDon]";
			List<HoaDon> hoaDon = session
					.createNativeQuery(sql, HoaDon.class)
					.getResultList();
			tr.commit();
			
			return hoaDon;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public HoaDon getHoaDonByName(String name) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			String sql = "select p from HoaDon p where p.name=:x";
			HoaDon hoaDon = session
					.createNativeQuery(sql, HoaDon.class)
					.setParameter('x', name)
					.getSingleResult();
			tr.commit();
			
			return hoaDon;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public boolean deleteHoaDon(int id) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.delete(session.find(HoaDon.class, id));
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}
}
