# lesson 9
### link https://www.youtube.com/watch?v=1qYOxJ-OEWs&list=PLi3gxGWPyGGQsEZyjQNPoUEHwNtxiMf-0

## Annotation Mapping (ManyToMany)

(see in @ManyToMany annotation comment with example)

User.java
    @ManyToMany
    @JoinTable(name = "rel_user_role",
        joinColumns = {@JoinColumn(name = "user_id")},
        inverseJoinColumns = {@JoinColumn(name = "role_id")
    })
    private Set<User> users= new HashSet<User>();


Role.java
    @ManyToMany(mappedBy = "roles")
    private Set<User> users = new HashSet<User>();




