package com.pj.learn.userCatalog.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Setter @Getter @AllArgsConstructor
public class Users {



    private Long id;

    private String mailID;

    private String fName;

    private String lName;

    private String uName;

    private String passwd;


    public Users() {

    }
}
