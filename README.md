# Spring Digital Library

# Usage

This is a proof of concept implementing Spring Boot, Thymeleaf templates, and a postgresql database.

# Setup

- Create an application.properties file under src/main/resources and enter the database info like below:
    ```
    spring.datasource.url=jdbc:postgresql://localhost:5432/book_site
    spring.datasource.username=book_site_db_user
    spring.datasource.password=bookDbUser
    spring.jpa.hibernate.ddl-auto=create-drop
    ```