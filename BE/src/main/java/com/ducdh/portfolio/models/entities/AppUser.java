package com.ducdh.portfolio.models.entities;

import com.ducdh.portfolio.models.entities.about_me.UserAboutMe;
import com.ducdh.portfolio.models.entities.blog.BlogCategory;
import com.ducdh.portfolio.models.entities.blog.UserBlog;
import com.ducdh.portfolio.models.entities.portfolio.ProjectCategory;
import com.ducdh.portfolio.models.entities.portfolio.UserPortfolio;
import com.ducdh.portfolio.models.entities.resume.UserResume;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.sql.Date;
import java.util.Set;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "app_users")
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "app_user_id")
    private Long appUserId;

    @JsonBackReference
    @OneToMany(mappedBy = "appUser")
    private Set<UserAddress> userAddressSet;

    @JsonBackReference
    @OneToOne(mappedBy = "appUser")
    private UserAboutMe userAboutMe;

    @JsonBackReference
    @OneToOne(mappedBy = "appUser")
    private UserResume userResume;

    @JsonBackReference
    @OneToOne(mappedBy = "appUser")
    private UserPortfolio userPortfolio;

    @JsonBackReference
    @OneToOne(mappedBy = "appUser")
    private UserBlog userBlog;

    @OneToMany(mappedBy = "appUser")
    @JsonBackReference
    private Set<ProjectCategory> projectCategory;

    @OneToMany(mappedBy = "appUser")
    @JsonBackReference
    private Set<BlogCategory> blogCategory;

    private String appUserName;

    private String appUserEmail;

    private String appUserPhone;

    private Date appUserBirthday;

    private String appUserAvatar;

    private String appUserCurrentJob;

    private String appUserLoginId;

    private String appUserPassword;

    private String appUserFacebookLink;

    private String appUserInstagramLink;

    private String appUserTwitterLink;

    private boolean appUserDeleteFlag;

    private Date createdAt;

    private Date modifiedAt;
}











