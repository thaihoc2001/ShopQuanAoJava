package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entity.LichLamViec;
import service.LichLamViecService;

public class LichLamViecDAO implements LichLamViecService{
private SessionFactory sessionFactory;
	

	public LichLamViecDAO(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean addLichLamViec(LichLamViec lichLamViec) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.save(lichLamViec);
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}

	@Override
	public boolean updateLichLamViec(LichLamViec LichLamViec) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.update(LichLamViec);
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}

	
	@Override
	public LichLamViec getLichLamViecByID(int id) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			LichLamViec lichLamViec = session.find(LichLamViec.class, id);
			tr.commit();
			
			return lichLamViec;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public List<LichLamViec> getListLichLamViec() {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			String sql = "select * from [dbo].[LichLamViec]";
			List<LichLamViec> lichLamViec = session
					.createNativeQuery(sql, LichLamViec.class)
					.getResultList();
			tr.commit();
			
			return lichLamViec;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public LichLamViec getLichLamViecByName(String name) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			String sql = "select p from LichLamViec p where p.name=:x";
			LichLamViec lichLamViec = session
					.createNativeQuery(sql, LichLamViec.class)
					.setParameter('x', name)
					.getSingleResult();
			tr.commit();
			
			return lichLamViec;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public boolean deleteLichLamViec(int id) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.delete(session.find(LichLamViec.class, id));
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}
}
