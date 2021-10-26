package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import entity.QuanAo;
import service.QuanAoService;

public class QuanAoDAO implements QuanAoService{
	private SessionFactory sessionFactory;

	public QuanAoDAO(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean addProduct(QuanAo quanAo) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.save(quanAo);
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}

	@Override
	public boolean updateProduct(QuanAo quanAo) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.update(quanAo);
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}

	
	@Override
	public QuanAo getProductByID(int id) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			QuanAo quanAo = session.find(QuanAo.class, id);
			tr.commit();
			
			return quanAo;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public List<QuanAo> getListProducts() {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			String sql = "select * from [dbo].[QuanAo]";
			List<QuanAo> quanAo = session
					.createNativeQuery(sql, QuanAo.class)
					.getResultList();
			tr.commit();
			
			return quanAo;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public QuanAo getProductByName(String name) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			String sql = "select p from QuanAo p where p.name=:x";
			QuanAo quanAo = session
					.createNativeQuery(sql, QuanAo.class)
					.setParameter('x', name)
					.getSingleResult();
			tr.commit();
			
			return quanAo;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public boolean deleteBrand(int id) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.delete(session.find(QuanAo.class, id));
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}

}
