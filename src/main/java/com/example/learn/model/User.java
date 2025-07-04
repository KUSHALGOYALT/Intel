package com.example.learn.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// User Entity (Student/Teacher/Admin)
@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private String role; // STUDENT, TEACHER, ADMIN
    private String avatar;
    private String password ;



    // Constructors

    public User(String name, String email, String role,String Password) {
        this.name = name;
        this.email = email;
        this.role = role;
        this.password=password;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getAvatar() { return avatar; }
    public void setAvatar(String avatar) { this.avatar = avatar; }
}

