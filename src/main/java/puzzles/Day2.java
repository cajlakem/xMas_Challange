package puzzles;

import utils.Password;

import java.util.ArrayList;
import java.util.List;

public class Day2 {
    private List<Password> passwordList;

    public Day2(List<String> list){
        this.passwordList = new ArrayList<>();
        for (String input:list) {
            passwordList.add(new Password(input));
        }
    }

    public Integer calculate(){
        int hits = 0;
        for (Password password: passwordList) {
            if(password.isValid()){
                hits++;
            }
        }
        return hits;
    }

}
