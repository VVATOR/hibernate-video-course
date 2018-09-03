package com.vikhlaev.grow.hibernate8;

import com.vikhlaev.grow.hibernate8.model.Role;
import com.vikhlaev.grow.hibernate8.model.User;
import com.vikhlaev.grow.hibernate8.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Runner {

  public static void main(String[] args) {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    Session session = sessionFactory.openSession();
    session.beginTransaction();
    User user = new User();
    user.setAge(1L);
    user.setName("name");
    Role role = new Role();
    role.setTitle("lol");
    user.setRole(role);

    session.save(role);
    session.save(user);
    session.flush();
    session.getTransaction().commit();
  }
}
