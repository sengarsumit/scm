package com.scm.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
public class Contact {
    @Id
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String picture;
    @Column(length = 10000)
    private String description;
    private boolean favorite=false;
    private String websiteLink;
    private String LinkedinLink;

    @ManyToOne
    private User user;

    // private List<String> socialLinks=new ArrayList<>();
    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private List<SocialLink> links = new ArrayList<>();

}
