package com.ducdh.portfolio.models.entities.blog;

import com.ducdh.portfolio.models.entities.AppUser;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.sql.Date;
import java.util.Set;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "blog_categories")
public class BlogCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "blog_category_id")
    private Long blogCategoryId;

    @ManyToOne
    @JoinColumn(name = "app_user_id", referencedColumnName = "app_user_id")
    @JsonManagedReference
    private AppUser appUser;

    @JsonBackReference
    @OneToMany(mappedBy = "blogCategory")
    private Set<UserBlog> userBlogSet;

    private String blogCategoryName;

    private boolean blogCategoryDeleteFlag;

    private Date createdAt;

    private Date modifiedAt;
}
