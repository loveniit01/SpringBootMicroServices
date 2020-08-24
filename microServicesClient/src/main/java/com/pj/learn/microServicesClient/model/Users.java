package com.pj.learn.microServicesClient.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter @Getter @AllArgsConstructor
public class Users {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "EMAIL")
    private String mailID;
    @Column(name = "FIRST_NAME")
    private String fName;
    @Column(name = "LAST_NAME")
    private String lName;
    @Column(name = "USERNAME")
    private String uName;
    @Column(name = "PASSWORD")
    private String passwd;


    public Users() {

    }
}
