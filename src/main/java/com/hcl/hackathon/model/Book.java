package com.hcl.hackathon.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "UUID", nullable = false)
    private int UUID;
    @JsonProperty
    @Column(name = "Title", nullable = false, length = 30)
    private String title;
    @Id
    @JsonProperty
    @Column(name = "Author", nullable = false, length = 6)
    private String author;
    @JsonProperty
    @Column(name = "category", nullable = false, length = 6)
    private String category;
    @JsonProperty
    @Column(name = "Rack", nullable = false, length = 6)
    private String rack;
    @JsonProperty
    @Column(name = "Edition", nullable = false, length = 6)
    private String edition;
    @JsonProperty
    @Column(name = "Status", nullable = false, length = 6)
    private String status;
 

}
 