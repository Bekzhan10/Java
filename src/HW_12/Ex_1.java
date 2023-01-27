package HW_12;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 1
        System.out.println(calculateTwo(5, 4));
        //2
        System.out.println("Odd numbers from 0 to 20 are:");
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 1)
                System.out.println(i);
        }
        System.out.println("That's all.");
        //3
        int first = 1;
        int sec = 2;
        int temp = first;
        first = sec;
        sec = temp;
        System.out.println("First variable now is:" + first);
        System.out.println("Second variable now is:" + sec);
        //4
        System.out.println("Enter three numbers");
        int biggest = Math.max(scan.nextInt(), Math.max(scan.nextInt(), scan.nextInt()));
        System.out.println(biggest);
        //5
        System.out.println("Enter a number");
        int num = scan.nextInt();
        if (num > 0)
            System.out.println("Your number is positive.");
        else if (num == 0)
            System.out.println("Your number is equal to 0");
        else
            System.out.println("Your number is negative");
        //6
        String before = "I am Bekzhan";
        String after = "";
        for (char c : before.toCharArray()) {
            if (c != 'a')
                after = after + c;
            else
                after = after + 'b';
        }
        System.out.println(after);
        //7
        int[] arr = {1, 2, 5, 3, 4, 7, 9, 9};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        //8
        Arrays.sort(arr);
        int last = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < last) {
                System.out.println("Second biggest num in array is " + arr[i]);
                break;
            }
        }

    }


    public static String calculateTwo(int first, int sec) {
        int sum = first + sec;
        int product = first * sec;
        int dif = Math.abs(first - sec);
        int division = first / sec;
        int remainder = first % sec;
        return "Sum is " + sum + ", Product is " + product + ", Difference is " + dif + " , Division is " + division + ", Remainder is " + remainder;
    }

    public static String shuffleString(String s, int[] indices) {
        char[] c = new char[indices.length];
        for (int i = 0; i < indices.length; i++)
            c[indices[i]] = s.charAt(i);
        return new String(c);
    }

    public static boolean isPalindrome(int x) {
        int num = 0;
        int copy = x;
        if (x >= 0) {
            while (x != 0) {
                num = num * 10 + x % 10;
                x /= 10;
            }
            if (copy == num)
                return true;
        }
        return false;
    }

    public static int numberOfSteps(int num) {
        int count = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = (num - 1);
            }
            count++;
        }
        return count;
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        for (String s : word1) {
            one.append(s);
        }
         for (String s : word2) {
            two.append(s);
        }
        return one.toString().equals(two.toString());
    }
}
