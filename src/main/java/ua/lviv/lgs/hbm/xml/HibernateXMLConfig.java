package ua.lviv.lgs.hbm.xml;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.*;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.*;






public class HibernateXMLConfig {
public static void main(String[] args) {
	Configuration configuration = new Configuration().configure("hibernate.cnf.xml");

		
	ServiceRegistryBuilder registry = new ServiceRegistryBuilder();
	registry.applySettings(configuration.getProperties());
	org.hibernate.service.ServiceRegistry serviceRegistry =  registry.buildServiceRegistry();
	SessionFactory sessionFactory = configuration.buildSessionFactory((org.hibernate.service.ServiceRegistry) serviceRegistry);
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Cart cart = new Cart(23, "Roman","Sukhai" );
		Item item1 = new Item(1,"Sausage");
		Item item2 = new Item(1,"Fruit");
		Item item3 = new Item(1,"Vagetable");
		Item item4 = new Item(1,"Soup");
		cart.setSet(new HashSet<>(Arrays.asList(item1,item2,item3,item4)));
		
		
		session.persist(cart);
		transaction.commit();
		session.close();
}
}
