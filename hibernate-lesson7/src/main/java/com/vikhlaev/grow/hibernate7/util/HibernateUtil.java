package com.vikhlaev.grow.hibernate7.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

  private static SessionFactory sessionFactory;

  static {
    Configuration cfg = new Configuration().configure();
    StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
        .applySettings(cfg.getProperties());
    sessionFactory = cfg.buildSessionFactory();
  }

  public static SessionFactory getSessionFactory() {
    return sessionFactory;
  }

}

