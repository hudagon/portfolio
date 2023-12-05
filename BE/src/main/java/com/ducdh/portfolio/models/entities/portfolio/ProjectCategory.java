package com.ducdh.portfolio.models.entities.portfolio;

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
@Table(name = "project_categories")
public class ProjectCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_category_id")
    private Long projectCategoryId;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "app_user_id", referencedColumnName = "app_user_id")
    private AppUser appUser;

    @JsonBackReference
    @OneToMany(mappedBy = "projectCategory")
    private Set<UserPortfolioProject> userPortfolioProjectSet;

    private String projectCategoryName;

    private boolean projectCategoryDeleteFlag;

    private Date createdAt;

    private Date modifiedAt;
}
