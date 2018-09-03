# lesson 6
### link https://www.youtube.com/watch?v=1qYOxJ-OEWs&list=PLi3gxGWPyGGQsEZyjQNPoUEHwNtxiMf-0

## Annotation Mapping (without relation)

@Entity
@Table

 @Id

 @GeneratedValue(strategy = )
 AUTO - from provider (default)
 IDENTITY - for DB with special type Key
 SEQUENCE - for DB with special mechanism generation sequences keys
 TABLE - generated keys is store in outer table

 @Column

good material:

https://easyjava.ru/data/jpa/pervichnye-klyuchi-v-jpa/

попробовать сделать  составной ключ
два варианта:
  - вынос составного ключа в отделный клвсс
  - встраивание в класс сущьности