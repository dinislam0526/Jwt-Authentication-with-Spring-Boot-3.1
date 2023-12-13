package com.jwtExample.model;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Users {

    private String userId;
    private String name;
    private  String email;

}
