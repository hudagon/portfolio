package com.ducdh.portfolio.models.entities.resume;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.sql.Date;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "user_resume_educations")
public class UserResumeEducation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userResumeEducationId;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "user_resume_id", referencedColumnName = "user_resume_id")
    private UserResume userResume;

    private String userResumeEducationName;

    private String userResumeEducationStartTime;

    private String userResumeEducationEndTime;

    private String userResumeEducationDesc;

    private boolean userResumeEducationDeleteFlag;

    private Date createdAt;

    private Date modifiedAt;
}
