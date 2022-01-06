package com.projetodigitalone.projectapi.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ContactType {

    NUMBERHOME("Home"),
    NUMBERMOBILE("Mobile"),
    NUMBERCOMMERCIAL("Commercial"),
    ADRESSEEMAIL("Email") ;

    private final String description;
}
