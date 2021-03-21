package br.com.iti.password.controller;

import br.com.iti.password.component.PasswordComponent;
import br.com.iti.password.dto.ValidPassword;
import br.com.iti.password.entity.Password;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("password")
public class HomeController {

    @Autowired
    private PasswordComponent passwordComponent;

    @PostMapping("checkIsValidPassword")
    private ResponseEntity<ValidPassword> checkIsValidPassword(@RequestBody Password password){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(passwordComponent.isValidPassword(password));
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).build();
        }
    }
}