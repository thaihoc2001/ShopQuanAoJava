package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entity.HangSanXuat;
import service.HangSanXuatService;

public class HangSanXuatDAO implements HangSanXuatService{
private SessionFactory sessionFactory;
	

	public HangSanXuatDAO(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean addHangSanXuat(HangSanXuat hangSanXuat) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.save(hangSanXuat);
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}

	@Override
	public boolean updateHangSanXuat(HangSanXuat hangSanXuat) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.update(hangSanXuat);
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}

	
	@Override
	public HangSanXuat getHangSanXuatByID(int id) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			HangSanXuat hangSanXuat = session.find(HangSanXuat.class, id);
			tr.commit();
			
			return hangSanXuat;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public List<HangSanXuat> getListHangSanXuat() {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			String sql = "select * from [dbo].[HangSanXuat]";
			List<HangSanXuat> hangSanXuat = session
					.createNativeQuery(sql, HangSanXuat.class)
					.getResultList();
			tr.commit();
			
			return hangSanXuat;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public HangSanXuat getHangSanXuatByName(String name) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			String sql = "select p from HangSanXuat p where p.name=:x";
			HangSanXuat hangSanXuat = session
					.createNativeQuery(sql, HangSanXuat.class)
					.setParameter('x', name)
					.getSingleResult();
			tr.commit();
			
			return hangSanXuat;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public boolean deleteHangSanXuat(int id) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.delete(session.find(HangSanXuat.class, id));
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}
}
