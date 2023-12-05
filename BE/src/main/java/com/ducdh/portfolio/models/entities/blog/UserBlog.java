package com.ducdh.portfolio.models.entities.blog;

import com.ducdh.portfolio.models.entities.AppUser;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.sql.Date;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "user_blogs")
public class UserBlog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userBlogId;

    @OneToOne
    @JoinColumn(name = "app_user_id", referencedColumnName = "app_user_id")
    @JsonManagedReference
    private AppUser appUser;

    @ManyToOne
    @JoinColumn(name = "blog_category_id", referencedColumnName = "blog_category_id")
    @JsonManagedReference
    private BlogCategory blogCategory;

    private String userBlogName;

    private Date userBlogDate;

    private String userBlogDecs;

    private String userBlogImg;

    private boolean userBlogDeleteFlag;

    private Date createdAt;

    private Date modifiedAt;
}
