package com.ducdh.portfolio.models.entities.resume;

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
@Table(name = "user_resume")
public class UserResume {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_resume_id")
    private Long userResumeId;

    @OneToOne
    @JoinColumn(name = "app_user_id", referencedColumnName = "app_user_id")
    @JsonManagedReference
    private AppUser appUser;

    @JsonBackReference
    @OneToMany(mappedBy = "userResume")
    private Set<UserResumeEducation> userResumeEducationSet;

    @JsonBackReference
    @OneToMany(mappedBy = "userResume")
    private Set<UserResumeExperience> userResumeExperienceSet;

    @JsonBackReference
    @OneToMany(mappedBy = "userResume")
    private Set<UserResumeSkill> userResumeSkillSet;

    private boolean userResumeDeleteFlag;

    private Date createdAt;

    private Date modifiedAt;
}
