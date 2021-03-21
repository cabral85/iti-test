package br.com.iti.password.component;

import br.com.iti.password.dto.ValidPassword;
import br.com.iti.password.entity.Password;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
class PasswordComponentTest {

    @Autowired
    PasswordComponent passwordComponent;

    @Test
    void whenReceiveStringThenCheckIfIsValidPassword(){
        ValidPassword validPasswordTrue = passwordComponent.isValidPassword(new Password("AbTp9!fok"));
        assertTrue(validPasswordTrue.getIsValidPassword());
        ValidPassword validPasswordFalse = passwordComponent.isValidPassword(new Password("AbTp9!foA"));
        assertTrue(!validPasswordFalse.getIsValidPassword());
    }

}