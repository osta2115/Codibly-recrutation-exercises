package exercise2;

import java.util.HashMap;
import java.util.Map;

public class BalancedWordsCounter {

    public static Integer count(String input) {
        int counter = 0;
        if (input.equals("")){
            return counter;
        } else if (input.equals(null) || input.matches("[a-zA-Z]*[0-9]+")){
            throw new RuntimeException();
        } else{
            for (int i = 0; i < input.length(); i++){
                for (int j = i + 1; j < input.length() + 1; j++){
                    String word = input.substring(i, j);
                    if (isBeautiful(word)) {
                        counter++;
                    }
                }
            }
            return counter;
        }
    }

    private static boolean isBeautiful(String word) {
        String[] letters = word.split("");
        Map<String, Integer> lettersCount = new HashMap<>();

        if(word.length() == 1){
            return true;
        }
        for (String letter : letters) {
            if (lettersCount.containsKey(letter)) {
                lettersCount.put(letter,lettersCount.get(letter) + 1);
            } else {
                lettersCount.put(letter, 1);
            }
        }

        for (Integer count : lettersCount.values()) {
            if (count != lettersCount.get(letters[0])) {
                return false;
            }
        }
        return true;
    }
}
