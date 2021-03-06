package com.vikhlaev.grow.hibernate4.model;

import java.io.Serializable;

public class Role implements Serializable {

  private Long id;

  private String title;

  private User user;

  public Role() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}
