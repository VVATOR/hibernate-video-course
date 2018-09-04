package com.vikhlaev.grow.hibernate11;

import com.vikhlaev.grow.hibernate11.util.HibernateUtil;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.common.util.impl.LoggerFactory;

public class Runner {

  public static void main(String[] args) {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    Session session = sessionFactory.openSession();
    try {
      session.beginTransaction();

      //-----
      session.getTransaction().commit();
    } catch (Exception e) {
      session.getTransaction().rollback();
    } finally {
      session.close();
      sessionFactory.close(); //program nor end work while session factory not closed;
    }
  }

}
