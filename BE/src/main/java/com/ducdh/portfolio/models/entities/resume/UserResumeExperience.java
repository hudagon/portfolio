package com.ducdh.portfolio.models.entities.resume;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.sql.Date;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "user_resume_experiences")
public class UserResumeExperience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userResumeExperienceId;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "user_resume_id", referencedColumnName = "user_resume_id")
    private UserResume userResume;

    private String userResumeExperienceName;

    private String userResumeExperienceStarTime;

    private String userResumeExperienceEndTime;

    private String userResumeExperienceDesc;

    private boolean userResumeExperienceDeleteFlag;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "modified_at")
    private Date modifiedAt;
}
