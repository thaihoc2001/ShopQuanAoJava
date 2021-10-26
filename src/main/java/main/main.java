package main;

import gui.GUI_Application;
import util.MySessionFactory;

import javax.swing.JFrame;

import org.hibernate.SessionFactory;

public class main {
    public static void main(String[] args) {
        new GUI_Application();
//        SessionFactory sessionFactory = new MySessionFactory().getSessionFactory();
    }   
}
