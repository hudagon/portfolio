package com.ducdh.portfolio.models.entities.resume;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.sql.Date;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "user_resume_skill")
public class UserResumeSkill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userResumeSkillId;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "user_resume_id", referencedColumnName = "user_resume_id")
    private UserResume userResume;

    private String userResumeSkillName;

    private Integer userResumeSkillPercentage;

    private boolean userResumeSkillDeleteFlag;

    private Date createdAt;

    private Date modifiedAt;
}
