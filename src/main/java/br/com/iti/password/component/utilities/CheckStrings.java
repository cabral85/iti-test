package br.com.iti.password.component.utilities;

import org.springframework.stereotype.Component;

@Component
public class CheckStrings {
    public boolean CheckDuplicates(CharSequence phrase){
        for(int i = 0; i <= phrase.length(); i++){
            for (int j = i+1; j < phrase.length(); j++){
                if(phrase.charAt(i) == (phrase.charAt(j)))
                    return true;
            }
        }
        return false;
    }
}
