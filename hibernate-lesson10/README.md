# lesson 10
### link https://www.youtube.com/watch?v=1qYOxJ-OEWs&list=PLi3gxGWPyGGQsEZyjQNPoUEHwNtxiMf-0

## Inheritance of Models


  @MappedSuperclass


  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  @JoinColumn(name = "parentProductCategory",referencedColumnName = "id")
  private ProductCategory parentProductCategory;