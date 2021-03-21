package br.com.iti.password.component;

import br.com.iti.password.component.utilities.CheckStrings;
import br.com.iti.password.dto.ValidPassword;
import br.com.iti.password.entity.Password;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PasswordComponent {

    @Value("${regex_password}")
    private String regex_password;

    @Autowired
    private CheckStrings checkStrings;

    public ValidPassword isValidPassword(Password password){
        try {
            ValidPassword validPassword = new ValidPassword();
            validPassword.setIsValidPassword(!checkStrings.CheckDuplicates(password.getPasswordPhrase()) && password.getPasswordPhrase().matches(regex_password));

            return validPassword;
        }
        catch (Exception e) {
            return new ValidPassword(false);
        }
    }
}
