package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entity.XuatXu;
import service.XuatXuService;

public class XuatXuDAO implements XuatXuService{
private SessionFactory sessionFactory;
	

	public XuatXuDAO(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean addXuatXu(XuatXu xuatXu) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.save(xuatXu);
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}

	@Override
	public boolean updateXuatXu(XuatXu xuatXu) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.update(xuatXu);
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}

	
	@Override
	public XuatXu getXuatXuByID(int id) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			XuatXu xuatXu = session.find(XuatXu.class, id);
			tr.commit();
			
			return xuatXu;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public List<XuatXu> getListXuatXu() {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			String sql = "select * from [dbo].[XuatXu]";
			List<XuatXu> XuatXu = session
					.createNativeQuery(sql, XuatXu.class)
					.getResultList();
			tr.commit();
			
			return XuatXu;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public XuatXu getXuatXuByName(String name) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			String sql = "select p from XuatXu p where p.name=:x";
			XuatXu xuatXu = session
					.createNativeQuery(sql, XuatXu.class)
					.setParameter('x', name)
					.getSingleResult();
			tr.commit();
			
			return xuatXu;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return null;
	}

	@Override
	public boolean deleteXuatXu(int id) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
			session.delete(session.find(XuatXu.class, id));
			tr.commit();
			
			return true;
		} catch (Exception e) {
			tr.rollback();
		}
		
		return false;
	}
}
