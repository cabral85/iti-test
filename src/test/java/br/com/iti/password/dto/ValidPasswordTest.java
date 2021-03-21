package br.com.iti.password.dto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
class ValidPasswordTest {

    @InjectMocks
    private ValidPassword validPassword;

    @BeforeEach
    void setUp() {
        validPassword = new ValidPassword();
    }

    @Test
    void testGetterSetter(){
        validPassword.setIsValidPassword(false);
        assertTrue(validPassword.getIsValidPassword().equals(false));
    }

    @Test
    void testToString(){
        validPassword.setIsValidPassword(false);
        assertTrue(!validPassword.toString().isEmpty());
    }

}