package com.vikhlaev.grow.hibernate1;

import org.hibernate.SessionFactory;

public class Runner {

  public static void main(String[] args) {

    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

  }

}
