package com.example.okhttp.controllers;


import com.example.okhttp.models.Account;
import org.springframework.web.bind.annotation.*;

@RestController

public class AccountController {


    @PostMapping("/save")
    public Account save(@RequestBody Account account){

        account.setId(1l);
        return account;
    }

    @PutMapping("/update")
    public Account update(@RequestBody Account account){
        account.setLogin(account.getLogin()+234);
        return account;
    }

    @GetMapping("/get/{id}")
    public Account getById(@PathVariable Long id){
        return Account.builder()
                .id(id)
                .password("sdasdgs")
                .login("admin")
                .active(true)
                .build();
    }

    @GetMapping("/get")
    public Account getById(){
        return Account.builder()
                .id(1l)
                .password("sdasdgs")
                .login("admin")
                .active(true)
                .build();

    }

    @DeleteMapping("/delete")
    public Account delete(@RequestParam Long id){

        return Account.builder()
                .id(id)
                .password("sdasdgs")
                .login("admin")
                .active(true)
                .build();

    }
}

