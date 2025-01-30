import java.util.*;
public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        // return ' ';
        Map<Character, Integer> freq = new HashMap<>(getCharacterFrequency(str));
        int currentCount = 0;
        char currentMaxChar = ' ';

        for (Map.Entry<Character, Integer> e: freq.entrySet()) {
            if (e.getValue() > currentCount) {
                currentCount = e.getValue();
                currentMaxChar = (char) e.getKey();
            }
        }
        return currentMaxChar;

     }

    public Map<Character, Integer> getCharacterFrequency(String str) {
        Map<Character, Integer> frequencyCount = new HashMap<>();
        char currentChar;
        int currentCount = 0;

        for (int i = 0; i < str.length(); i++) {
            currentChar = str.charAt(i);
            if (frequencyCount.containsKey(currentChar)) {
                currentCount = frequencyCount.get(currentChar);
                currentCount += 1;
                frequencyCount.put(currentChar, currentCount);
            } else {
                frequencyCount.put(currentChar, 1);
            }
            currentChar = ' ';
        }
        return frequencyCount;
    }
}
