package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entity.NhanVien;
import service.NhanVienService;

public class NhanVienDAO implements NhanVienService{
	private SessionFactory sessionFactory;

	public NhanVienDAO(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean addNhanVien(NhanVien nhanVien) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.save(nhanVien);
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}

	@Override
	public boolean updateNhanVien(NhanVien nhanVien) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.update(nhanVien);
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}

	
	@Override
	public NhanVien getNhanVienByID(int id) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			NhanVien nhanVien = session.find(NhanVien.class, id);
			tr.commit();
			
			return nhanVien;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public List<NhanVien> getListNhanVien() {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			String sql = "select * from [dbo].[NhanVien]";
			List<NhanVien> nhanVien = session
					.createNativeQuery(sql, NhanVien.class)
					.getResultList();
			tr.commit();
			
			return nhanVien;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public NhanVien getNhanVienByName(String name) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			String sql = "select p from NhanVien p where p.name=:x";
			NhanVien nhanVien = session
					.createNativeQuery(sql, NhanVien.class)
					.setParameter('x', name)
					.getSingleResult();
			tr.commit();
			
			return nhanVien;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public boolean deleteNhanVien(int id) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.delete(session.find(NhanVien.class, id));
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}
}
