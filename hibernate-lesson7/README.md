# lesson 7
### link https://www.youtube.com/watch?v=1qYOxJ-OEWs&list=PLi3gxGWPyGGQsEZyjQNPoUEHwNtxiMf-0

## Annotation Mapping (OneToMany)

@Entity
@Table

 @Id

 @GeneratedValue(strategy = )
 AUTO - from provider (default)
 IDENTITY - for DB with special type Key
 SEQUENCE - for DB with special mechanism generation sequences keys
 TABLE - generated keys is store in outer table

 @Column

-------------
  @OneToMany(mappedBy = "role")

    @ManyToOne
    @JoinColumn(name = "role_id")

