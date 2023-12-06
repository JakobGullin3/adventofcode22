package day4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Solution {

    public static void main(String[] args) throws IOException {

        File file = new File("day4/input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        int n1 = 0;

        int n2 = 0;
        String s;

        int[] pair1 = {0,0};
        int[] pair2 = {0,0};
        String[] nums1;
        String[] nums2;

        while ((s = br.readLine()) != null) {
            String[] pairs = s.split(",");
            nums1 = pairs[0].split("-");
            nums2 = pairs[1].split("-");

            pair1[0] = Integer.parseInt(nums1[0]);
            pair1[1] = Integer.parseInt(nums1[1]);

            pair2[0] = Integer.parseInt(nums2[0]);
            pair2[1] = Integer.parseInt(nums2[1]);

            // If the first range covers the second range
            
            if ((pair1[0] <= pair2[0] && pair2[1] <= pair1[1]) || (pair2[0] <= pair1[0] && pair1[1] <= pair2[1])) {
                n1 += 1;
            }

            if (!(pair1[1] < pair2[0] || pair1[0] > pair2[1])) {
                n2 += 1;
            }

            
            
            
        }

        
        br.close();

        System.out.println(n1);
        System.out.println(n2);

    }
}
