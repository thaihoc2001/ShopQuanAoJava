package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entity.TaiKhoan;
import service.TaiKhoanService;

public class TaiKhoanDAO implements TaiKhoanService{
	private SessionFactory sessionFactory;

	public TaiKhoanDAO(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean addTaiKhoan(TaiKhoan taiKhoan) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.save(taiKhoan);
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}

	@Override
	public boolean updateTaiKhoan(TaiKhoan taiKhoan) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.update(taiKhoan);
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}

	
	@Override
	public TaiKhoan getTaiKhoanByID(int id) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			TaiKhoan taiKhoan = session.find(TaiKhoan.class, id);
			tr.commit();
			
			return taiKhoan;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public List<TaiKhoan> getListTaiKhoan() {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			String sql = "select * from [dbo].[TaiKhoan]";
			List<TaiKhoan> taiKhoan = session
					.createNativeQuery(sql, TaiKhoan.class)
					.getResultList();
			tr.commit();
			
			return taiKhoan;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public TaiKhoan getTaiKhoanByName(String name) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			String sql = "select p from TaiKhoan p where p.name=:x";
			TaiKhoan taiKhoan = session
					.createNativeQuery(sql, TaiKhoan.class)
					.setParameter('x', name)
					.getSingleResult();
			tr.commit();
			
			return taiKhoan;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public boolean deleteTaiKhoan(int id) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.delete(session.find(TaiKhoan.class, id));
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}

	@Override
	public boolean checkLogin(String taiKhoan, String matKhau) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
