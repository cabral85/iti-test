package br.com.iti.password.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ValidPassword implements Serializable {
    private Boolean isValidPassword;

    @Override
    public String toString() {
        return "ValidPassword{" +
                "isValidPassword=" + isValidPassword +
                '}';
    }
}
