package DataStructuresAndAlgorithmsInJava_Exercises.Chapter_1;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;

public class RandomMistakes {
    public static char keySwap(char letter) {
        HashMap<Character, Function<Character,Character>> easyMistakes = new HashMap<>();
        easyMistakes.put('a', a -> {
            return 's';
        });
        easyMistakes.put('e', a -> {
            int whichMistake = ThreadLocalRandom.current().nextInt(1,3);
            return whichMistake == 1 ? 'w' : 'r';
        });
        easyMistakes.put('i', a -> {
            int whichMistake = ThreadLocalRandom.current().nextInt(1,3);
            return whichMistake == 1 ? 'u' : 'o';
        });
        easyMistakes.put('I', a -> {
            int whichMistake = ThreadLocalRandom.current().nextInt(1,3);
            return whichMistake == 1 ? 'U' : 'O';
        });
        easyMistakes.put('w', a -> {
            int whichMistake = ThreadLocalRandom.current().nextInt(1,3);
            return whichMistake == 1 ? 'q' : 'e';
        });
        easyMistakes.put('l', a -> {
            int whichMistake = ThreadLocalRandom.current().nextInt(1,3);
            return whichMistake == 1 ? 'k' : ';';
        });
        easyMistakes.put('n', a -> {
            int whichMistake = ThreadLocalRandom.current().nextInt(1,3);
            return whichMistake == 1 ? 'b' : 'm';
        });
        easyMistakes.put('v', a -> {
            int whichMistake = ThreadLocalRandom.current().nextInt(1,3);
            return whichMistake == 1 ? 'c' : 'b';
        });
        easyMistakes.put('r', a -> {
            int whichMistake = ThreadLocalRandom.current().nextInt(1,3);
            return whichMistake == 1 ? 'e' : 't';
        });
        easyMistakes.put('s', a -> {
            int whichMistake = ThreadLocalRandom.current().nextInt(1, 3);
            return whichMistake == 1 ? 'a' : 'd';
        });
        easyMistakes.put('p', a -> {
            int whichMistake = ThreadLocalRandom.current().nextInt(1, 3);
            return whichMistake == 1 ? 'o' : '[';
        });
        easyMistakes.put('m', a -> {
            int whichMistake = ThreadLocalRandom.current().nextInt(1, 3);
            return whichMistake == 1 ? 'n' : ',';
        });
        easyMistakes.put('y', a -> {
            int whichMistake = ThreadLocalRandom.current().nextInt(1, 3);
            return whichMistake == 1 ? 't' : 'u';
        });
        easyMistakes.put('f', a -> {
            int whichMistake = ThreadLocalRandom.current().nextInt(1, 3);
            return whichMistake == 1 ? 'd' : 'g';
        });
        easyMistakes.put('d', a -> {
            int whichMistake = ThreadLocalRandom.current().nextInt(1, 3);
            return whichMistake == 1 ? 's' : 'f';
        });
        easyMistakes.put('g', a -> {
            int whichMistake = ThreadLocalRandom.current().nextInt(1, 3);
            return whichMistake == 1 ? 'f' : 'h';
        });
        return easyMistakes.get(letter).apply(letter);
    }

    public static int[] mistakeLines() {
        int one = ThreadLocalRandom.current().nextInt(0,100);
        int two = ThreadLocalRandom.current().nextInt(0,100);
        while (two == one) {
            two = ThreadLocalRandom.current().nextInt(0,100);
        }
        int three = ThreadLocalRandom.current().nextInt(0,100);
        while (three == two || three == one) {
            three = ThreadLocalRandom.current().nextInt(0,100);
        }
        int four = ThreadLocalRandom.current().nextInt(0,100);
        while (four == three || four == two || four == one) {
            four = ThreadLocalRandom.current().nextInt(0,100);
        }
        int five = ThreadLocalRandom.current().nextInt(0,100);
        while (five == four || five == three || five == two || five == one) {
            five = ThreadLocalRandom.current().nextInt(0,100);
        }
        int six = ThreadLocalRandom.current().nextInt(0,100);
        while (six == five || six == four || six == three || six == two || six == one) {
            six = ThreadLocalRandom.current().nextInt(0,100);
        }
        int seven = ThreadLocalRandom.current().nextInt(0,100);
        while (seven == six || seven == five || seven == four || seven == three || seven == two || seven == one) {
            seven = ThreadLocalRandom.current().nextInt(0,100);
        }
        int eight = ThreadLocalRandom.current().nextInt(0,100);
        while (eight == seven || eight == six || eight == five || eight == four || eight == three || eight == two || eight == one) {
            eight = ThreadLocalRandom.current().nextInt(0,100);
        }
        return new int[]{one, two, three, four, five, six, seven, eight};
    }

    public static int whichIndex(@NotNull String sentence) {
        char[] letters = sentence.toCharArray();
        int randomIndex = ThreadLocalRandom.current().nextInt(0,letters.length-1);
        if (letters[randomIndex] == ' ') {
            randomIndex += 1;
        }
        return randomIndex;
    }

    public static boolean contains(int[] lines, int j){
        boolean ans = false;
        for (int line : lines) {
            if (line == j) {
                ans = true;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String sentence = "I will never spam my friends again.";
        int[] lines = mistakeLines();
        char[] sentenceLetters = sentence.toCharArray();
        for (int i = 0; i < 100; i++) {
            if (contains(lines, i)) {
                int index = whichIndex(sentence);
                sentenceLetters[index] = keySwap(sentenceLetters[index]);
                String newSentence = new String(sentenceLetters);
                System.out.println(newSentence);
                sentenceLetters = sentence.toCharArray();
            } else {
                System.out.println(sentence);
            }
        }
    }
}