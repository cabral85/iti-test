package br.com.iti.password.entity;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Password implements Serializable {
    private String passwordPhrase;

    @Override
    public String toString() {
        return "Password{" +
                "passwordPhrase='" + passwordPhrase + '\'' +
                '}';
    }
}
