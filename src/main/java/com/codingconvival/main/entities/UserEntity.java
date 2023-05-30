package com.codingconvival.main.entities;

import org.hibernate.annotations.*;
import java.time.LocalDateTime;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private String userId;

    @Column(name = "email", unique = true, nullable = false)
    @NotNull
    private String email;

    @Column(name = "password", nullable = false)
    @NotNull
    private String password;

    @Column(name = "username", length = 50, unique = true, nullable = false)
    @NotNull
    private String username;

    @Column(name = "is_verified", nullable = false, columnDefinition = "boolean default false")
    private boolean isVerified;

    @Column(name = "is_admin", nullable = false, columnDefinition = "boolean default false")
    private boolean isAdmin;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "profile_picture")
    private String profilePicture;

    // Constructors, getters, setters, and other methods

    // Default constructor
    public UserEntity() {
        this.isVerified = false;
        this.isAdmin = false;
    }

    // Parameterized constructor
    public UserEntity(String email, String password, String username) {
        this.email = email;
        this.password = password;
        this.username = username;
        this.isVerified = false;
        this.isAdmin = false;
    }

    // Getters and setters

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = 'U' + userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }
}

