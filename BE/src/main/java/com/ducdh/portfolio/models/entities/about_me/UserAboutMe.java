package com.ducdh.portfolio.models.entities.about_me;

import com.ducdh.portfolio.models.entities.AppUser;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.sql.Date;
import java.util.Set;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "user_about_me")
public class UserAboutMe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_about_me_id")
    private Long userAboutMeId;

    private String userAboutMeSummary;

    private boolean userAboutMeDeleteFlag;

    @JsonBackReference
    @OneToOne
    @JoinColumn(name = "app_user_id", referencedColumnName = "app_user_id")
    private AppUser appUser;

    @JsonBackReference
    @OneToMany(mappedBy = "userAboutMe")
    private Set<UserAboutMeClient> userAboutMeClient;

    @JsonBackReference
    @OneToMany(mappedBy = "userAboutMe")
    private Set<UserAboutMeService> userAboutMeService;

    @JsonBackReference
    @OneToMany(mappedBy = "userAboutMe")
    private Set<UserAboutMeTestimonial> userAboutMeTestimonial;

    private Date createdAt;

    private Date modifiedAt;
}













