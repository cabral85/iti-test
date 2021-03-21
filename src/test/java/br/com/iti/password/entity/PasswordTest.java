package br.com.iti.password.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
class PasswordTest {

    @InjectMocks
    private Password password;

    @BeforeEach
    void setUp() {
        password = new Password();
    }

    @Test
    void testGetterSetter(){
        password.setPasswordPhrase("abc");
        assertTrue(!password.getPasswordPhrase().isEmpty());
    }

    @Test
    void testToString(){
        password.setPasswordPhrase("abc");
        assertTrue(!password.toString().isEmpty());
    }

}