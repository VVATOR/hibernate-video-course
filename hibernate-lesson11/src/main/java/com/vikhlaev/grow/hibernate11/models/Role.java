package com.vikhlaev.grow.hibernate11.models;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role extends AbstractModel {

  @Column(name = "title")
  private String title;

  @ManyToMany(mappedBy = "roles")
  private Set<User> users = new HashSet<User>();

  public Role() {
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Set<User> getUsers() {
    return users;
  }

  public void setUsers(Set<User> users) {
    this.users = users;
  }
}
