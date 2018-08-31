package com.vikhlaev.grow.hibernate2;

import com.vikhlaev.grow.hibernate2.util.HibernateUtil;
import org.hibernate.SessionFactory;

public class Runner {

  public static void main(String[] args) {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
  }
}
