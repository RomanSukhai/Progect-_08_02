package ua.lviv.lgs.hbm.xml;

import java.util.HashSet;
import java.util.Set;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateXMLConfig {
public static void main(String[] args) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
	
	Item iphone = new Item();
	iphone.setPrice(100); iphone.setDescription("iPhone");
	
	Item ipod = new Item();
	ipod.setPrice(50); ipod.setDescription("iPod");
	
	Cart cart = new Cart();
	cart.setTotal(150);
	
	Cart cart1 = new Cart();
	cart1.setTotal(100);
	
	Set<Cart> cartSet = new HashSet<Cart>();
	cartSet.add(cart);cartSet.add(cart1);
	
	Set<Cart> cartSet1 = new HashSet<Cart>();
	cartSet1.add(cart);
	
	iphone.setCarts(cartSet1);
	ipod.setCarts(cartSet);
	
	
	
	
	SessionFactory sessionFactory = null;
	sessionFactory = HibernateUTIL.getSessionFactory();
	Session session = sessionFactory.getCurrentSession();
	Transaction tx = (Transaction) session.beginTransaction();
	session.save(iphone);
	session.save(ipod);
	tx.commit();
	sessionFactory.close();
	

}
	
}
