package com.vikhlaev.grow.hibernate10.models;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product_category")
public class ProductCategory extends AbstractModel {

  @Column(name = "title")
  private String title;

  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  @JoinColumn(name = "parent_product_category", referencedColumnName = "id")
  private ProductCategory parentProductCategory;

  @OneToMany(mappedBy = "productCategory")
  private Set<Product> products = new HashSet<Product>();

  public ProductCategory() {
  }

  public ProductCategory(String title) {
    this.title = title;
  }

  public ProductCategory(ProductCategory parentProductCategory, String title) {
    this.title = title;
    this.parentProductCategory = parentProductCategory;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ProductCategory getParentProductCategory() {
    return parentProductCategory;
  }

  public void setParentProductCategory(ProductCategory parentProductCategory) {
    this.parentProductCategory = parentProductCategory;
  }

  public Set<Product> getProducts() {
    return products;
  }

  public void setProducts(Set<Product> products) {
    this.products = products;
  }


}
