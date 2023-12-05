package com.ducdh.portfolio.models.entities.about_me;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.sql.Date;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "user_about_me_testimonials")
public class UserAboutMeTestimonial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userAboutMeTestimonialId;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "user_about_me_id", referencedColumnName = "user_about_me_id")
    private UserAboutMe userAboutMe;

    private String userAboutMeTestimonialName;

    private String userAboutMeTestimonialComment;

    private String userAboutMeTestimonialAvatar;

    private boolean userAboutMeTestimonialDeleteFlag;

    private Date createdAt;

    private Date modifiedAt;
}
