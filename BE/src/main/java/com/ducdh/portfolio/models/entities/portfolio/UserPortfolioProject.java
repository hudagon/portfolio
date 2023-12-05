package com.ducdh.portfolio.models.entities.portfolio;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.sql.Date;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "user_portfolio_projects")
public class UserPortfolioProject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userPortfolioProjectId;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "user_portfolio_id", referencedColumnName = "user_portfolio_id")
    private UserPortfolio userPortfolio;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "project_category_id", referencedColumnName = "project_category_id")
    private ProjectCategory projectCategory;

    private String userPortfolioProjectName;

    private String userPortfolioProjectImg;

    private String userPortfolioProjectLink;

    private boolean isUserPortfolioProjectDeleteFlag;

    private Date createdAt;

    private Date modifiedAt;
}
