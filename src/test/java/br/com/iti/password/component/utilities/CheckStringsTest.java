package br.com.iti.password.component.utilities;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
class CheckStringsTest {

    @Autowired
    CheckStrings checkStrings;

    @Test
    void whenInputHaveDuplicateStringsThenReturnTrue(){
        assertTrue(checkStrings.CheckDuplicates("abca"));
    }

    @Test
    void whenInputHaveDuplicateStringsThenReturnFalse(){
        assertTrue(checkStrings.CheckDuplicates("abc"));
    }

}