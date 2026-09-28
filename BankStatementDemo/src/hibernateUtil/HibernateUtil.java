package hibernateUtil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
        Configuration config = new Configuration();
		config.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/BankStatementGenerationSystem");
		config.setProperty("hibernate.connection.username", "root");
		config.setProperty("hibernate.connection.password", "root");
		
		config.setProperty("hibernate.Dialect", "org.hibernate.dialect.MySQL8Dialect");
		config.setProperty("hibernate.hbm2ddl.auto", "update");
		config.setProperty("hibernate.show_sql", "true");
		
	    config.addAnnotatedClass(com.bank.entity.Customer.class);
	    config.addAnnotatedClass(com.bank.entity.Bank.class);
	    config.addAnnotatedClass(com.bank.entity.CustomerAddress.class);
	    config.addAnnotatedClass(com.bank.entity.ContactInfo.class);
	    
	    sessionFactory = config.buildSessionFactory();
		return sessionFactory;
	}
	
	
	
}
