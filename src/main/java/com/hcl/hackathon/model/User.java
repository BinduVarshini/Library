package com.hcl.hackathon.model;

 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

 

import com.fasterxml.jackson.annotation.JsonProperty;

 

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User implements Serializable{
    @Id
    @JsonProperty
    @Column(name = "UserId", nullable = false, length = 6)
    private String userId;

 

    @Column(nullable = false, length = 64)
    private String password;

 

    @JsonProperty
    @Column(name = "Name", nullable = false, length = 20)
    private String name;
    
    @JsonProperty
    @Column(name = "Role", nullable = false, length = 5)
    private String role;

 

}