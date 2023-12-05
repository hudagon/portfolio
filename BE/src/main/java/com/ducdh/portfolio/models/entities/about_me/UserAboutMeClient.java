package com.ducdh.portfolio.models.entities.about_me;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.sql.Date;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "user_about_me_clients")
public class UserAboutMeClient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userAboutMeClientId;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "user_about_me_id", referencedColumnName = "user_about_me_id")
    private UserAboutMe userAboutMe;

    private String userAboutMeClientLink;

    private String userAboutMeClientImage;

    private boolean userAboutMeDeleteFlag;

    private Date createdAt;

    private Date modifiedAt;
}
