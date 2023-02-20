package day1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeSet;

public class Solution2 {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        File file = new File("day1/input.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        TreeSet<Integer> max = new TreeSet<Integer>();
        String s;
        int n = 0;

        while ((s = br.readLine()) != null) {
            if (s.isEmpty()) {
                max.add(n);
                n = 0;
            } else {
                n += Integer.parseInt(s);
            }
        }

        System.out.println("The answer is: " + (max.pollLast()+max.pollLast()+max.pollLast()));
    }

}
