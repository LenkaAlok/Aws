package com.Api.crudproject.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "login")
public class Login {
    @Column(name = "mobile", nullable = false)
    private String mobile;

    @Column(name = "email_id", nullable = false)
    private String emailId;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}