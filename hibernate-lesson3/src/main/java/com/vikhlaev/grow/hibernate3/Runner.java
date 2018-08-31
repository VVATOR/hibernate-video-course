package com.vikhlaev.grow.hibernate3;

import com.vikhlaev.grow.hibernate3.util.HibernateUtil;
import org.hibernate.SessionFactory;

public class Runner {

  public static void main(String[] args) {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
  }

}
