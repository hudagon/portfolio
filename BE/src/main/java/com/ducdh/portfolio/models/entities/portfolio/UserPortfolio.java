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
@Table(name = "user_portfolioes")
public class UserPortfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_portfolio_id")
    private Long userPortfolioId;

    @JsonManagedReference
    @OneToOne
    @JoinColumn(name = "app_user_id", referencedColumnName = "app_user_id")
    private AppUser appUser;

    @JsonBackReference
    @OneToMany(mappedBy = "userPortfolio")
    private Set<UserPortfolioProject> userPortfolioProjectSet;

    private boolean userPortfolioDeleteFlag;

    private Date createdAt;

    private Date modifiedAt;
}
