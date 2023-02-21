package day2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeSet;

public class Sol2 {
    

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("day2/input.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String s;
        int sum = 0;

        while ((s = br.readLine()) != null) {
            s = s.replaceAll("\\s", "");
            System.out.println(s);
            int n = 0;
            char c0 = s.charAt(0);
            char c1 = s.charAt(1);

            if (c0 == 'A') {
                if (c1 == 'X') {
                    n = 3;
                } else if (c1 == 'Y') {
                    n = 4;
                } else if (c1 == 'Z'){
                    n = 8;        
                }
            } else if (c0 == 'B') {
                if (c1 == 'X') {
                    n = 1;
                } else if (c0 == 'Y') {
                    n = 5;
                } else if (c1 == 'Z'){
                    n = 9;
                }
            } else if (c0 == 'C'){
                if (c1 == 'X') {
                    n = 2;
                } else if (c1 == 'Y') {
                    n = 6;
                } else if (c1 == 'Z') {
                    n = 7;
                }
            }
            sum += n;
        }
        System.out.println("The answer is: " + sum);
    }

}
