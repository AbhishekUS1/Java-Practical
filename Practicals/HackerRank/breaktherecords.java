package Practicals.HackerRank;

import java.util.Scanner;

//https://www.hackerrank.com/contests/mountblue-technologies/challenges/breaking-best-and-worst-records/problem
public class breaktherecords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = in.nextInt();
        int min = a[0];
        int max = a[0];
        int res1 = 0, res2 = 0;
        // ip 5
        // 4 5 6 4 3 5
        // min=4,max=6,res1=1,res2=2
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                res1++;
                max = a[i]; // max is incremented to a[1] to a[n]
            }
            if (a[i] < min) {
                res2++;
                min = a[i];
            }
        }
        System.out.println(res1 + " " + res2);
        in.close();
    }
}