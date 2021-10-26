package util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import entity.ChiTietGioHang;
import entity.ChiTietHoaDon;
import entity.GioHang;
import entity.HangSanXuat;
import entity.HoaDon;
import entity.KhachHang;
import entity.LichLamViec;
import entity.NhanVien;
import entity.QuanAo;
import entity.TaiKhoan;
import entity.XuatXu;
import entity.LoaiQuanAo;
import org.hibernate.cfg.Configuration;

public class MySessionFactory {
private SessionFactory sessionFactory;
	
	public MySessionFactory() {
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml")//hibernate.cfg.xml
				.build();
                
		Metadata metadata = new MetadataSources(serviceRegistry)
				.addAnnotatedClass(LichLamViec.class)
				.addAnnotatedClass(NhanVien.class)
				.addAnnotatedClass(HoaDon.class)
				.addAnnotatedClass(TaiKhoan.class)
				.addAnnotatedClass(KhachHang.class)
				.addAnnotatedClass(GioHang.class)
				.addAnnotatedClass(ChiTietGioHang.class)
				.addAnnotatedClass(ChiTietHoaDon.class)
				.addAnnotatedClass(QuanAo.class)
				.addAnnotatedClass(LoaiQuanAo.class)
				.addAnnotatedClass(XuatXu.class)
				.addAnnotatedClass(HangSanXuat.class)
				.getMetadataBuilder()
				.build();
		
		sessionFactory = metadata
				.getSessionFactoryBuilder()
				.build();
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public void close() {
		sessionFactory.close();
	}
}
