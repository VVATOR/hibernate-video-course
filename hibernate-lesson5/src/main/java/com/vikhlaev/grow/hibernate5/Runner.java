package com.vikhlaev.grow.hibernate5;

import com.vikhlaev.grow.hibernate5.util.HibernateUtil;
import org.hibernate.SessionFactory;

public class Runner {

  public static void main(String[] args) {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//    Session session = sessionFactory.openSession();
//    session.beginTransaction();
//    User user = new User();
//    user.setAge(1L);
//    user.setName("name");
//    user.setRoles(new HashSet<Role>());
//
//
//    session.flush();
//    session.save(user);
//    session.getTransaction().commit();
  }
}
