package com.vikhlaev.grow.hibernate7;

import com.vikhlaev.grow.hibernate7.util.HibernateUtil;
import org.hibernate.SessionFactory;

public class Runner {

  public static void main(String[] args) {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//    Session session = sessionFactory.openSession();
//    session.beginTransaction();
//    User user = new User();
//    user.setAge(1L);
//    user.setName("name");
//    Role role = new Role();
//    role.setTitle("lol");
//    user.setRole(role);
//
//
//
//    session.save(role);
//    session.save(user);
//    session.flush();
//    session.getTransaction().commit();
  }
}
