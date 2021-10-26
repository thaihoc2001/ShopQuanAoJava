package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entity.LoaiQuanAo;
import service.LoaiQuanAoService;

public class LoaiQuanAoDAO implements LoaiQuanAoService{
private SessionFactory sessionFactory;
	

	public LoaiQuanAoDAO(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean addLoaiQuanAo(LoaiQuanAo loaiQuanAo) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.save(loaiQuanAo);
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}

	@Override
	public boolean updateLoaiQuanAo(LoaiQuanAo loaiQuanAo) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.update(loaiQuanAo);
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}

	
	@Override
	public LoaiQuanAo getLoaiQuanAoByID(int id) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			LoaiQuanAo LoaiQuanAo = session.find(LoaiQuanAo.class, id);
			tr.commit();
			
			return LoaiQuanAo;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public List<LoaiQuanAo> getListLoaiQuanAo() {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			String sql = "select * from [dbo].[LoaiQuanAo]";
			List<LoaiQuanAo> loaiQuanAo = session
					.createNativeQuery(sql, LoaiQuanAo.class)
					.getResultList();
			tr.commit();
			
			return loaiQuanAo;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public LoaiQuanAo getLoaiQuanAoByName(String name) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			String sql = "select p from LoaiQuanAo p where p.name=:x";
			LoaiQuanAo loaiQuanAo = session
					.createNativeQuery(sql, LoaiQuanAo.class)
					.setParameter('x', name)
					.getSingleResult();
			tr.commit();
			
			return loaiQuanAo;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public boolean deleteLoaiQuanAo(int id) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.delete(session.find(LoaiQuanAo.class, id));
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}
}
