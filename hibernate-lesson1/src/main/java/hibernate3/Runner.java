package com.vikhlaev.grow.hibernate3;

import org.hibernate.SessionFactory;

public class Runner {

  public static void main(String[] args) {

    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

  }

}
