package com.ducdh.portfolio.models.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.sql.Date;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "user_addresses")
public class UserAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userAddressId;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "app_user_id", referencedColumnName = "app_user_id")
    private AppUser appUser;

    private String userAddressLevel1;

    private String userAddressLevel2;

    private String userAddressLevel3;

    private String userAddressLevel4;

    private String userAddressDetailAddress;

    private boolean userAddressDeleteFlag;

    private Date createdAt;

    private Date modifiedAt;
}
