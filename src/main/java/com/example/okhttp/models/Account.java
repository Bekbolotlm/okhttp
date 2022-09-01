package com.example.okhttp.models;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

@Builder
public class Account {

    Long id;
    String login;
    String password;
    boolean active;


}
