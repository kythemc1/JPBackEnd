package com.example.jp.payload.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter

public class SignUpRequest {

    private Long UserId;

    private String firstName;

    private String lastname;

    private String email;

    private Integer age;

    private String address;

    private  String username;

    private String password;

    private String phoneNumber;

    private Set<String> listRole;



}