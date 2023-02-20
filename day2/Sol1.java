package day2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeSet;

public class Sol1 {
    

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("day2/input.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String s;
        int sum = 0;

        while ((s = br.readLine()) != null) {
            int win = won(s);
            int n = 0;

            if (s.charAt(2) == 'X') {
                n = 1;
            } else if (s.charAt(2) == 'Y') {
                n = 2;
            } else {n = 3;}

            sum += n;
            sum += win;
        }

        System.out.println("The answer is: " + sum);
    }

    public static int won(String s) {
        if (s.startsWith("A X") || s.startsWith("B Y") || s.startsWith("C Z")) {
            return 3;
        }
        if (s.startsWith("A Y") || s.startsWith("B Z") || s.startsWith("C X")) {
            return 6;
        } 
        return 0;
    }
}
