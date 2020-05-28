package Lesson;
import java.io.*;
import java.util.*;

public class sample1 {

        static int solveMeFirst(int a, int b) {
            // Hint: Type return a+b; below
            return a+b;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int a;
            System.out.println("Enter the value for a");
            a = in.nextInt();
            int b;
            System.out.println("Enter the value for b");
            b = in.nextInt();
            int sum;
            sum = solveMeFirst(a, b);
            System.out.println("the value of sum of a,b is "+sum);
        }
    }

