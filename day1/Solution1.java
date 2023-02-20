package day1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Solution1 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        File file = new File("day1/input.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        int max = 0;
        String s;
        int n = 0;

        while ((s = br.readLine()) != null) {
            if (s.isEmpty()) {
                if (n > max) {
                    max = n;
                }
                n = 0;
            } else {
                n += Integer.parseInt(s);
            }
        }

        System.out.println("The answer is: " + max);
    }
}

